package com.javaschool.main;

import com.javaschool.config.SpringMainConfig;
import com.javaschool.model.Ticket;
import com.javaschool.model.Train;
import com.javaschool.model.User;
import com.javaschool.services.TicketService;
import com.javaschool.services.TrainService;
import com.javaschool.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMainConfig.class);
        TrainService trainService = ctx.getBean(TrainService.class);
        UserService userService = ctx.getBean(UserService.class);
        TicketService ticketService = ctx.getBean(TicketService.class);

       Train sapsan = new Train("Sapsan", 300);

        trainService.saveTrain(sapsan);
        Train unknownTrain = trainService.findTrainByName("Sapsan");
        System.out.println(unknownTrain.getName() + " " + unknownTrain.getSeatsCount());



        User viacheslav = new User();
        viacheslav.setName("Viacheslav");
        viacheslav.setLastName("Rostov");
        viacheslav.setBirthDate(new Date());
        viacheslav.setAdmin(false);

        userService.saveUser(viacheslav);

        User unknownUser = userService.findUserByNameAndLastname("Viacheslav", "Rostov");


        Ticket ticketOne = new Ticket();
        Ticket ticketTwo = new Ticket();

        ticketOne.setRouteCode("rc1");
        ticketOne.setUser(unknownUser);

        ticketTwo.setRouteCode("rc2");
        ticketTwo.setUser(unknownUser);

        ticketService.saveTicket(ticketOne);
        ticketService.saveTicket(ticketTwo);



    }
}
