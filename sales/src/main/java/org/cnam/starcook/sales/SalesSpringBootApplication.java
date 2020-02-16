package org.cnam.starcook.sales;

import org.cnam.starcook.sales.domain.Catalog;
import org.cnam.starcook.sales.entities.CatalogModel;
import org.cnam.starcook.sales.repositories.ICatalogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalesSpringBootApplication {
    public static void main(String[] argc) {
        SpringApplication.run(SalesSpringBootApplication.class, argc);
    }

    @Bean
    CommandLineRunner start(ICatalogRepository ICatalogRepository) {
//        for (Catalog catalog : ICatalogRepository.findAll()) {
//            System.out.println(catalog);
//        }
        System.out.println("The service started : all is ok!!!!");
        return null;
    }
}
