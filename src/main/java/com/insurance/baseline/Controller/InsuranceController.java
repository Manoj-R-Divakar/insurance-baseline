package com.insurance.baseline.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/insurance")
public class InsuranceController {

    @Value("${app.environment}")
    private String environment;

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status", "UP",
                "application", "insurance-baseline",
                "environment", environment
        );
    }

    @GetMapping("/")
    public String home() {
        return "Insurance Management System is running!";
    }
}