package com.isitmez.stocktracker.service;

import com.isitmez.stocktracker.model.Stock;
import com.isitmez.stocktracker.repository.StockRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    private final StockRepository stockRepository;
    private final RestTemplate restTemplate;
    private final String API_KEY = "PLS USE Finhub API KEY";

    public StockService(StockRepository stockRepository, RestTemplate restTemplate) {
        this.stockRepository = stockRepository;
        this.restTemplate = restTemplate;
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Stock saveStock(Stock stock) {
        double guncelFiyat = getPriceFromFinnhub(stock.getSymbol());
        stock.setCurrentPrice(guncelFiyat);
        double karZarar = (guncelFiyat - stock.getBuyPrice()) * stock.getQuantity();
        stock.setProfitLoss(karZarar);
        return stockRepository.save(stock);
    }

    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }
    public double getPriceFromFinnhub(String symbol) {
        try {
            String url = "https://finnhub.io/api/v1/quote?symbol=" + symbol + "&token=" + API_KEY;
            Object response = restTemplate.getForObject(url, Object.class);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.valueToTree(response);

            if (root.has("c")) {
                return root.get("c").asDouble();
            }
        } catch (Exception e) {
            System.out.println("Hata oluştu: " + e.getMessage());
        }
        return 0.0;
    }
    public List<String> searchStocks(String query) {
        List<String> results = new ArrayList<>();
        try {
            String url = "https://finnhub.io/api/v1/search?q=" + query + "&token=" + API_KEY;
            String response = restTemplate.getForObject(url, String.class);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response);
            JsonNode resultNode = root.get("result");
            if (resultNode.isArray()) {
                for (JsonNode node : resultNode) {
                    String symbol = node.get("symbol").asText();
                    String description = node.get("description").asText();
                    results.add(symbol + " - " + description);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }
}