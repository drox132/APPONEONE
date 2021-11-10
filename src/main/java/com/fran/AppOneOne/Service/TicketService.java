package com.fran.AppOneOne.Service;

import com.fran.AppOneOne.Model.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> selectAllTicket();
    Ticket selectAllTicketById(int id);
    void insertTicket(Ticket nuevoTicket);
    void updateTicketById(Ticket updateTicket);
    void deleteTicketById(int id);


}
