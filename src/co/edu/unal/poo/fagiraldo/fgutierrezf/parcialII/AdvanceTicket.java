/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.fagiraldo.fgutierrezf.parcialII;

/**
 *
 * @author Estudiante
 */
public class AdvanceTicket extends Ticket{
    
    private Event event;
    private int advprc;

    public AdvanceTicket(Event event, int id, int dia, int mes, int anio) {
        super(id, dia, mes, anio);
        this.event = event;
        if (this.event.getDia() - dia >= 10) {
            super.setPrecio(30);
            this.advprc =30;
        }
        if (this.event.getDia() - dia < 10) {
            super.setPrecio(40);
            this.advprc =40;
        }
    }
    
    @Override
    public int precioTick() {
        return super.getPrecio();
    }

    public Event getEvent() {
        return event;
    }

    public int getAdvprc() {
        return advprc;
    }
    
    
    
    
    


    
}
