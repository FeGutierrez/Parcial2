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
    public static void main(String[] args){
        
        Compania tx = new Compania("Ticket Xpress");
        
        Institucion ins = new Institucion("Unal");
        Estudiante est = new Estudiante(4444, ins);        
        //Evento (dia, mes, año)
        Event evento = new Event(25, 05, 2018); // Evento con fecha para hacer calculos de costo de tickets advance y student advance, sin calendar.
          
        //Tickets
        Ticket t1 = new AdvanceTicket(evento, 1, 22, 05, 2018);
        Ticket t2 = new AdvanceTicket(evento, 2, 9, 05, 2018);
        Ticket t3 = new StudentAdvanceTicket(evento, 3, 22, 05, 2018, est);
        Ticket t4 = new StudentAdvanceTicket(evento, 4, 9, 05, 2018, est);
        Ticket t5 = new WalkUpTicket(5, 25, 5, 2018);
        Ticket t6 = new WalkUpTicket(6, 25, 5, 2018);
        
        Ticket t7 = new WalkUpTicket(6, 25, 5, 2018);//Ticket duplicado con el mismo id que t6
        
        
        
        try {
            tx.registrarTicket(t1);
            tx.registrarTicket(t2);
            tx.registrarTicket(t3);
            tx.registrarTicket(t4);
            tx.registrarTicket(t5);
            tx.registrarTicket(t6);
            tx.registrarTicket(t7);//Ingresar ticket Duplicado
        } catch(TicketNumberException ex) {
            System.out.println(ex.getMessage());
        }
            
            
        for (int i = 0; i < tx.getListaTickets().size(); i++) {
            System.out.println(tx.getListaTickets().get(i).info());
        }
        System.out.println(tx.tiquetesVendidosdeCadaTipo());
        System.out.println("");
        System.out.println(tx.gananciasDeTodosLosTickets());
        System.out.println("\033[31mEste texto es Rojo");
    }
    
}
