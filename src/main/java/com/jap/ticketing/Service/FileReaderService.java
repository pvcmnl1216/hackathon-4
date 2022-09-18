package com.jap.ticketing.Service;

import com.jap.ticketing.Ticket.Ticket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class FileReaderService {

    public List<Ticket> readFile(String fileName) {
        List<Ticket> ticketList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            bufferedReader.readLine();
            bufferedReader.lines().map(readLine -> readLine.split(",")).forEach(new Consumer<String[]>() {
                @Override
                public void accept(String[] data) {
                    Ticket ticket = new Ticket();
                    ticket.setScheduleNo(data[0].trim());
                    ticket.setRouteNo(data[1].trim());
                    ticket.setTicketFromStopId(Integer.parseInt(data[2]));
                    ticket.setTicketFromStopId(Integer.parseInt(data[3]));
                    ticket.setTicketTillStopId(Integer.parseInt(data[4]));
                    ticket.setTicketTillStopSequenceNo(Integer.parseInt(data[5]));
                    ticket.setTicketDate(data[7].trim());
                    ticket.setTicketAmount(Integer.parseInt(data[8]));
                    ticket.setTravelledKm(Double.parseDouble(data[9]));
                    ticketList.add(ticket);
                }
            });
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
        return ticketList;
    }
}

