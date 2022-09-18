package com.jap.ticketing.Service;

import com.jap.ticketing.Ticket.Ticket;

import java.util.List;

public class DataService {


    public List<Ticket> sortByDistance(List<Ticket> ticketList) {
        ticketList.sort((Ticket o1, Ticket o2) -> Double.compare(o2.getTravelledKm(), o1.getTravelledKm()));
        return ticketList;
    }


    public double totalCollectionMadeByTicketSales(List<Ticket> ticketList) {
        return ticketList.stream().mapToDouble(Ticket::getTicketAmount).sum();

    }

}

