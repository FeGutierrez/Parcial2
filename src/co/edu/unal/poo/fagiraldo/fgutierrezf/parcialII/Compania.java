/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.fagiraldo.fgutierrezf.parcialII;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Compania {
    
    private String nombre;
    private ArrayList<Ticket> listaTickets;

    public Compania(String nombre) {
        this.nombre = nombre;
        this.listaTickets = new ArrayList<>();
    }
    
    
    public void registrarTicket(Ticket ticket) throws TicketNumberException{
        boolean ex = false;
        for (int i = 0; i < this.listaTickets.size(); i++) {
            if (this.listaTickets.get(i).getId()==ticket.id) {
                ex = true;
            } else {
                ex= false;
            }
        }
        
        if (ex==false) {
            this.listaTickets.add(ticket);
        } else {
            throw new TicketNumberException("Id ya registrado");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ticket> getListaTickets() {
        return listaTickets;
    }

    public void setListaTickets(ArrayList<Ticket> listaTickets) {
        this.listaTickets = listaTickets;
    }
    
    public String tiquetesVendidosdeCadaTipo(){
        Ticket x = null;
        int advCount=0;
        int studentCount=0;
        int walkCount=0;
        for (int i = 0; i < this.listaTickets.size(); i++) {
            x= this.listaTickets.get(i);
            if (x instanceof StudentAdvanceTicket) {
                studentCount+=1;
            } else {
                if (x instanceof AdvanceTicket) {
                    advCount+=1;
                } else {
                    if (x instanceof WalkUpTicket) {
                        walkCount+=1;
                    }
                }
            }
        }
        return "Tickets Walk-Up: "+ walkCount +" Tickets Advance: " + 
                advCount +" Tickets Student Advance: " + studentCount;
    }
}
