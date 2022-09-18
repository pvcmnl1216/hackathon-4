package com.jap.ticketing.Service;

import com.jap.ticketing.Ticket.Ticket;

import java.util.List;

public interface BusTicketInterface {
    int collectedAmount(List<Ticket> ticketList);
}
