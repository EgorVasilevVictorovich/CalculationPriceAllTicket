package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



import com.example.myapplication.model.Ticket;
import com.example.myapplication.model.TicketChild;
import com.example.myapplication.model.oldTicket;


public class MainActivity extends AppCompatActivity {
    Ticket Ticket= new Ticket(70,9);
    Ticket TicketChild= new TicketChild(70,11,50);
    Ticket oldTicket= new oldTicket(70,5,30);

    private TextView TicketOut;
    private TextView TicketChildOut;
    private TextView oldTicketOut;
    private TextView priceTicketOut;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TicketOut = findViewById(R.id.TicketOut);
        TicketChildOut = findViewById(R.id.TicketChildOut);
        oldTicketOut = findViewById(R.id.oldTicketOut);
        priceTicketOut = findViewById(R.id.priceTicketOut);

        //noinspection UnnecessaryParentheses
        TicketOut.setText((Float.toString( Ticket.priceTicketAll()) + " монет"));
        oldTicketOut.setText((Float.toString(oldTicket.priceTicketAll()) + " монет"));
        TicketChildOut.setText((Float.toString(TicketChild.priceTicketAll()) + " монет"));
        priceTicketOut.setText((Float.toString(Ticket.priceTicketAll() + oldTicket.priceTicketAll() + TicketChild.priceTicketAll()) + " монет"));;
    }
}


