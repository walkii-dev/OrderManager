package org.educational.ordermanager;

import org.educational.ordermanager.repository.ClientRepository;
import org.educational.ordermanager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderManagerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrderManagerApplication.class, args);
    }

    @Autowired
    private ProductRepository ProdRepo;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(ProdRepo.findByNameEquals("Notebook Pro"));

    }
}
