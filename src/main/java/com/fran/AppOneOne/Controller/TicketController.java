package com.fran.AppOneOne.Controller;

import com.fran.AppOneOne.Model.Ticket;
import com.fran.AppOneOne.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/selectallticket")
    public List<Ticket> selectAllTicket() {
        return ticketService.selectAllTicket();
    }
    @GetMapping("/selectallticketby/{id}")
    public Ticket selectAllTicketById (@PathVariable int id) {
        return ticketService.selectAllTicketById(id);
    }
    @PostMapping("/insertticket")
    public void insertTicket(@RequestBody Ticket nuevoTicket) {
        ticketService.insertTicket(nuevoTicket);
    }
    @PutMapping("/updateticket")
    public void updateTicketById(@RequestBody Ticket updateTicket) {
        ticketService.updateTicketById(updateTicket);
    }
    @DeleteMapping("/deletticket/{id}")
    public void deleteTicketById(@PathVariable int id) {
        ticketService.deleteTicketById(id);
    }

}
