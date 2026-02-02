package com.isitmez.stocktracker.controller;
import com.isitmez.stocktracker.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.isitmez.stocktracker.model.Stock;

@Controller
public class WebController {
    private final StockService stockService;
    public WebController(StockService stockService) {
        this.stockService = stockService;
    }
    @GetMapping("/login")
    public String loginSayfasi() {
        return "login";
    }
    @GetMapping("/")
    public String hubSayfasi() {
        return "hub";
    }

    @GetMapping("/portfolio")
    public String portfolioSayfasi(Model model) {
        model.addAttribute("hisseler", stockService.getAllStocks());
        model.addAttribute("yeniHisse", new Stock());
        return "portfolio";
    }
    @GetMapping("/market")
    public String marketSayfasi() {
        return "market";
    }
}