/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.fagiraldo.fgutierrezf.parcialII;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) throws TicketNumberException{
        
        Compania tx = new Compania("Ticket Xpress");
        
        Institucion ins = new Institucion("Unal");
        Estudiante est = new Estudiante(4444, ins);        
        //Evento (dia, mes, año)
        Event evento = new Event(25, 05, 2018);
                
        Ticket t1 = new AdvanceTicket(evento, 1, 22, 05, 2018);
        Ticket t2 = new AdvanceTicket(evento, 2, 9, 05, 2018);
        Ticket t3 = new StudentAdvanceTicket(evento, 3, 22, 05, 2018, est);
        Ticket t4 = new StudentAdvanceTicket(evento, 4, 9, 05, 2018, est);
        Ticket t5 = new WalkUpTicket(5, 25, 5, 2018);
        
        tx.anadirTicket(t1);
        tx.anadirTicket(t2);
        
        for (int i = 0; i < tx.getListaTickets().size(); i++) {
            System.out.println(tx.getListaTickets().get(i).getId());
        }
        
//        try {
//            tx.anadirTicket(t1);
//            
//        } catch (TicketNumberException ex) {
//            System.out.println(ex.getMessage());
//        }
        
        for (int i = 0; i < tx.getListaTickets().size(); i++) {
            System.out.println(tx.getListaTickets().get(i).getId());
        }
        
        
    }
    
}
