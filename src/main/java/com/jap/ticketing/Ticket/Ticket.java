/*
 * Author Name: Philip Meshach
 * Date: 13-09-2022
 * Praise The Lord
 */
package com.jap.ticketing.Ticket;

import java.util.Objects;

public class Ticket {
    String scheduleNo;
    String routeNo;
    int ticketFromStopId;
    int TicketFromStopSequenceNo;
    int ticketTillStopId;
    int ticketTillStopSequenceNo;
    String ticketDate;
    int ticketAmount;
    double travelledKm;

    public Ticket(String ticketDate, String scheduleNo, String routeNo, int ticketFromStopId, int ticketFromStopSequenceNo, int ticketTillStopSequenceNo, int ticketTillStopId, int ticketAmount, double travelledKm) {
    }

    public Ticket(String scheduleNo, String routeNo, int ticketFromStopId, int ticketFromStopSequenceNo, int ticketTillStopId, int ticketTillStopSequenceNo, String ticketDate, int ticketAmount, double travellingKm) {
        this.scheduleNo = scheduleNo;
        this.routeNo = routeNo;
        this.ticketFromStopId = ticketFromStopId;
        TicketFromStopSequenceNo = ticketFromStopSequenceNo;
        this.ticketTillStopId = ticketTillStopId;
        this.ticketTillStopSequenceNo = ticketTillStopSequenceNo;
        this.ticketDate = ticketDate;
        this.ticketAmount = ticketAmount;
        this.travelledKm = travellingKm;
    }

    public String getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(String scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public int getTicketFromStopId() {
        return ticketFromStopId;
    }

    public void setTicketFromStopId(int ticketFromStopId) {
        this.ticketFromStopId = ticketFromStopId;
    }

    public int getTicketFromStopSequenceNo() {
        return TicketFromStopSequenceNo;
    }

    public void setTicketFromStopSequenceNo(int ticketFromStopSequenceNo) {
        TicketFromStopSequenceNo = ticketFromStopSequenceNo;
    }

    public int getTicketTillStopId() {
        return ticketTillStopId;
    }

    public void setTicketTillStopId(int ticketTillStopId) {
        this.ticketTillStopId = ticketTillStopId;
    }

    public int getTicketTillStopSequenceNo() {
        return ticketTillStopSequenceNo;
    }

    public void setTicketTillStopSequenceNo(int ticketTillStopSequenceNo) {
        this.ticketTillStopSequenceNo = ticketTillStopSequenceNo;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(int ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public double getTravelledKm() {
        return travelledKm;
    }

    public void setTravelledKm(double travelledKm) {
        this.travelledKm = travelledKm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return ticketFromStopId == ticket.ticketFromStopId && TicketFromStopSequenceNo == ticket.TicketFromStopSequenceNo && ticketTillStopId == ticket.ticketTillStopId && ticketTillStopSequenceNo == ticket.ticketTillStopSequenceNo && ticketAmount == ticket.ticketAmount && Double.compare(ticket.travelledKm, travelledKm) == 0 && Objects.equals(scheduleNo, ticket.scheduleNo) && Objects.equals(routeNo, ticket.routeNo) && Objects.equals(ticketDate, ticket.ticketDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleNo, routeNo, ticketFromStopId, TicketFromStopSequenceNo, ticketTillStopId, ticketTillStopSequenceNo, ticketDate, ticketAmount, travelledKm);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "scheduleNo='" + scheduleNo + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", ticketFromStopId=" + ticketFromStopId +
                ", TicketFromStopSequenceNo=" + TicketFromStopSequenceNo +
                ", ticketTillStopId=" + ticketTillStopId +
                ", ticketTillStopSequenceNo=" + ticketTillStopSequenceNo +
                ", ticketDate='" + ticketDate + '\'' +
                ", ticketAmount=" + ticketAmount +
                ", travelledKm=" + travelledKm +
                '}';
    }
}
