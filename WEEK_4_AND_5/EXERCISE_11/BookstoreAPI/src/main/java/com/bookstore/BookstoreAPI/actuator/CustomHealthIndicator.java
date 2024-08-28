package com.bookstore.BookstoreAPI.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // Custom health check logic
        boolean serverUp = checkIfServerIsUp();
        if (serverUp) {
            return Health.up().withDetail("Server Status", "Up").build();
        }
        return Health.down().withDetail("Server Status", "Down").build();
    }

    private boolean checkIfServerIsUp() {
        // Implement logic to check server status
        return true; // Example: Always returns true
    }
}
