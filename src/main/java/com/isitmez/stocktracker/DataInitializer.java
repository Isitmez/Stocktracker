package com.isitmez.stocktracker;

import com.isitmez.stocktracker.model.Stock;
import com.isitmez.stocktracker.service.StockService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final StockService stockService;

    public DataInitializer(StockService stockService) {
        this.stockService = stockService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Test Verisi Yükleniyor ---");
        Stock testStock = new Stock();
        testStock.setSymbol("AAPL");
        testStock.setName("Apple Inc.");
        testStock.setBuyPrice(150.0);
        testStock.setQuantity(10);
        Stock savedStock = stockService.saveStock(testStock);

        System.out.println("KAYIT BAŞARILI!");
        System.out.println("Sembol: " + savedStock.getSymbol());
        System.out.println("Alış Fiyatı: " + savedStock.getBuyPrice());
        System.out.println("Güncel Fiyat (API'den geldi): " + savedStock.getCurrentPrice());
        System.out.println("Kar/Zarar Durumu: " + savedStock.getProfitLoss());
        System.out.println("------------------------------");
    }
}