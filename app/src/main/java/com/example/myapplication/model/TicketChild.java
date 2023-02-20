package com.example.myapplication.model;
import com.example.myapplication.model.Ticket;
public class TicketChild extends Ticket{
    private float ticketDiscount;
    public TicketChild() {

    }
    public TicketChild(float ticketPrice, int numberTicket, float ticketDiscount) {
        super(ticketPrice,numberTicket);
        this.ticketDiscount= ticketDiscount;
    }
    public float priceTicketAll(){
        return (getTicketPrice()*getNumberTicket()*(100-ticketDiscount))/100;
    }
}
