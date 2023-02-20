package com.example.myapplication.model;
import com.example.myapplication.model.Ticket;
public class oldTicket extends Ticket{
    private float oldDiscount;
    public oldTicket() {

    }
    public oldTicket(float ticketPrice, int numberTicket, float oldDiscount) {
        super(ticketPrice,numberTicket);
        this.oldDiscount= oldDiscount;
    }
    public float priceTicketAll(){
        return (getTicketPrice()*getNumberTicket()*(100-oldDiscount))/100;
    }
}
