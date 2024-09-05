package com.fgeorgiou.parcellocker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Additional application configuration.
 */
@Configuration
public class AppConfig {

    /**
     * Bean for WebClient.Builder.
     *
     * @return A WebClient.Builder instance.
     */
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
