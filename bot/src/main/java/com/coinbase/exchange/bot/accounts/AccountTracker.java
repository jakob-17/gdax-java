package com.coinbase.exchange.bot.accounts;


import com.coinbase.exchange.api.accounts.AccountService;

import lombok.extern.log4j.Log4j2;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@Log4j2
@SpringBootApplication
public class AccountTracker {

//    final AccountService accountService;

//    public AccountTracker() {
//        this.accountService = new AccountService(...);
//    }

    public static void main(String[] args) {
        SpringApplication.run(AccountTracker.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(Environment environment) {
        return args -> {
            log.info("message from application.properties: " +
                    environment.getProperty("exchange.passphrase"));
        };
    }
}