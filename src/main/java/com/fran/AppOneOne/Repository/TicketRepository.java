package com.fran.AppOneOne.Repository;

import com.fran.AppOneOne.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {


    @Query(value = "SELECT * FROM ticket", nativeQuery = true)
    List<Ticket>selectAllTicket();

    @Query(value = "SELECT * FROM ticket", nativeQuery = true)
    Ticket selectAllTicketById(int id);

    @Query(value = "SELECT * FROM ticket", nativeQuery = true)
    void insertTicket(String name, int price);

    @Query(value = "SELECT * FROM ticket", nativeQuery = true)
    void updateTicketById(String name, int price, int id);

    @Query(value = "SELECT * FROM ticket", nativeQuery = true)
    void deleteTicketById(int id);
}
