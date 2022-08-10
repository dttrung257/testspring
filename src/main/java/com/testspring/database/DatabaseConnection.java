package com.testspring.database;

import com.testspring.model.Product;
import com.testspring.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConnection {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);

    @Bean
    public void testBeanMethod() {
        System.out.println("Bean method is running ...");
    }

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product product1 = new Product(1L, "Mercedes", 2020, 2000, "http://google.com");
                Product product2 = new Product(2L, "Toyota", 2021, 1500, "http://facebook.com");
                logger.info("insert data:" + productRepository.save(product1));
                logger.info("insert data:" + productRepository.save(product2));
            }
        };
    }
}
