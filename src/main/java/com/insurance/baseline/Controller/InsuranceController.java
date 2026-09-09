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
        System.out.println("hi");
        System.out.println("From Manoj in dev");
        //this comment added by pavan in main-pavanh-branch01 requested to manoj for review
        //hello
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