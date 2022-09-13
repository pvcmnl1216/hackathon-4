/*
 * Author Name: Philip Meshach
 * Date: 13-09-2022
 * Praise The Lord
 */
package com.jap.ticketing.Service;

import com.jap.ticketing.Ticket.Ticket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTicketData {
    public List<Ticket> readFile(String fileName) {
        List<Ticket> ticketList = new ArrayList<>();
        fileName = "src/test/resources/sample.csv";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) ;
            String[] strings = line.split(" ");
            String ticketDate = strings[0];
            String scheduleNo = strings[1];
            String routeNo = strings[2];
            int ticketFromStopId = Integer.parseInt(strings[3]);
            int ticketFromStopSequenceNo = Integer.parseInt(strings[4]);
            int ticketTillStopId = Integer.parseInt(strings[5]);
            int ticketTillStopSequenceNo = Integer.parseInt(strings[6]);
            int ticketAmount = Integer.parseInt(strings[7]);
            double travelledKm = Double.parseDouble(strings[8]);

            ticketList.add(new Ticket(ticketDate,
                    scheduleNo,
                    routeNo,
                    ticketFromStopId,
                    ticketFromStopSequenceNo,
                    ticketTillStopSequenceNo,
                    ticketTillStopId,
                    ticketAmount,
                    travelledKm));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return ticketList;
    }

    public List<Ticket> getSortTheDataAsPerTheDistanceTravelledByBus(List<Ticket> ticketList) {
        ticketList.sort((o1, o2) -> (int) ((int) o2.getTravelledKm() - o1.getTravelledKm()));
        return ticketList;
    }


}

