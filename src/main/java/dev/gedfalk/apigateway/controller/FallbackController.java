package dev.gedfalk.apigateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback/user")
    public ResponseEntity<String> userFallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("User-service недоступен.\nСработал Circuit Breaker");
    }

    @GetMapping("/fallback/notification")
    public ResponseEntity<String> notificationFallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("Notification-service недоступен.\nСработал Circuit Breaker");
    }
}