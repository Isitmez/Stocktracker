package com.isitmez.stocktracker.controller;
import com.isitmez.stocktracker.model.Stock;
import com.isitmez.stocktracker.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/stocks")
public class StockController {

    private final StockService stockService;
    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }
    @GetMapping
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }
    @PostMapping
    public Stock addStock(@RequestBody Stock stock) {
        return stockService.saveStock(stock);
    }
    @DeleteMapping("/{id}")
    public void deleteStock(@PathVariable Long id) {
        stockService.deleteStock(id);
    }
    @GetMapping("/search")
    public List<String> searchStocks(@RequestParam String query) {
        return stockService.searchStocks(query);
    }
    @GetMapping("/price")
    public double getStockPrice(@RequestParam String symbol) {
        return stockService.getPriceFromFinnhub(symbol);
    }
}