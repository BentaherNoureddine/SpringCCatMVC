package com.exemple.config;

import com.example.dao.ProduitRepository;
import com.example.dao.ProduitRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ProduitRepository produitRepository() {
        return new ProduitRepositoryImpl();
    }
}