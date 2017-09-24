package com.javaschool.services;

import com.javaschool.model.Ticket;
import com.javaschool.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Transactional
    public void saveTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

}
