package com.example.myapplication.model;

public class Ticket {
    private float ticketPrice;
    private int numberTicket;

    public Ticket() {

    }
    public Ticket(float ticketPrice, int numberTicket) {
        this.ticketPrice= ticketPrice;
        this.numberTicket= numberTicket;
    }
    public float priceTicketAll(){
        return ticketPrice * numberTicket;
    }
    public float getTicketPrice(){
        return ticketPrice;
    }
    public void setTicketPrice(float ticketprice){
        this.ticketPrice= ticketPrice;
    }
    public int getNumberTicket(){
        return numberTicket;
    }
    public void setNumberTicket(int numberTicket){
        this.ticketPrice= numberTicket;
    }
}