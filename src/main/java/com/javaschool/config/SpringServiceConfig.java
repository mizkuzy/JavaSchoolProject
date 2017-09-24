package com.javaschool.config;

import com.javaschool.services.TicketService;
import com.javaschool.services.TrainService;
import com.javaschool.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringServiceConfig {

    @Bean
    public TrainService trainService() {
        return new TrainService();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public TicketService ticketService() {
        return new TicketService();
    }

}
