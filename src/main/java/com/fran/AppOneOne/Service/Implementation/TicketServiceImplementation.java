package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Model.Ticket;
import com.fran.AppOneOne.Repository.TicketRepository;
import com.fran.AppOneOne.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImplementation implements TicketService {

    private  final TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImplementation(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Ticket> selectAllTicket() {
        return ticketRepository.selectAllTicket();
    }

    @Override
    public Ticket selectAllTicketById(int id) {
        return ticketRepository.selectAllTicketById(id);
    }

    @Override
    public void insertTicket(Ticket nuevoTicket) {
        ticketRepository.insertTicket(nuevoTicket.getName(),nuevoTicket.getPrice());
    }

    @Override
    public void updateTicketById(Ticket updateTicket) {
        ticketRepository.updateTicketById(updateTicket.getName(),updateTicket.getPrice(),updateTicket.getId());
    }

    @Override
    public void deleteTicketById(int id) {
        ticketRepository.deleteTicketById(id);
    }
}
