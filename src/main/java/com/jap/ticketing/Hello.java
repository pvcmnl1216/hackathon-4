package com.jap.ticketing;

import com.jap.ticketing.Service.DataService;
import com.jap.ticketing.Service.FileReaderService;
import com.jap.ticketing.Ticket.Ticket;

import java.util.List;

public class Hello {

    public static void main(String[] args) {

        String fileName = "src/main/resources/sample.csv";
        FileReaderService readerService = new FileReaderService();
        DataService dataService = new DataService();
        List<Ticket> ticketList = readerService.readFile(fileName);
        List<Ticket> sortedTicketList = dataService.sortByDistance(ticketList);
        System.out.println("--------------------------------------------------");
        System.out.println("Data sorted based on Distance Travelled  ");
        System.out.println("--------------------------------------------------");
        for (Ticket ticket : sortedTicketList) {
            System.out.println(ticket);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        double collectionMadeByTicketSales = dataService.totalCollectionMadeByTicketSales(ticketList);
        System.out.println("The total Collection made from Ticket Sales is  $ " + collectionMadeByTicketSales);
        System.out.println("--------------------------------------------------------------");

    }
}
