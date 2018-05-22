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
    
    public boolean anadirTicket(Ticket ticketReg){
        boolean exito = false;
        for (int i = 0; i < this.listaTickets.size(); i++) {
            if (this.listaTickets.get(i).getId() == ticketReg.getId()) {
                exito = false;
            } else {
                exito = true;
            }
        }
        return false;
    }
    
//    public boolean anadirTicket(Ticket ticketReg) throws TicketNumberException{
//        boolean exito = false;
//        for (int i = 0; i < this.listaTickets.size(); i++) {
//            if (this.listaTickets.get(i).getId() == ticketReg.getId()) {
//                exito = false;
//            } else {
//                exito = true;
//            }
//        }
//        if (exito==false) {
//            throw new TicketNumberException("Ticket ya registrado");
//        } else {
//            this.listaTickets.add(ticketReg);
//        }
//        return exito;
//    };

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
    
    
    
    
    
}
