package com.dn.boot;

import com.dn.model.Customer;
import com.dn.repository.CustomerRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.dn.model")
@EnableJpaRepositories("com.dn.repository") 
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
    }
    @Bean
    CommandLineRunner init(CustomerRespository repo) {
        return (evt) ->  {
            repo.save(new Customer("Vikram","peter@stryker.com"));
            repo.save(new Customer("Peter","peter@samsung.com"));
            repo.save(new Customer("John","john@adp.com"));
            repo.save(new Customer("Alex","alex@adp.com"));
            repo.save(new Customer("Jenny","jenny@ets.com"));
            repo.save(new Customer("Jim","jim@mgs.com"));
        };
    }
}
