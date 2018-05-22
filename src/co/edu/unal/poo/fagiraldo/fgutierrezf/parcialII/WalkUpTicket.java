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
public class WalkUpTicket extends Ticket {

    public WalkUpTicket(int id, int dia, int mes, int anio) {
        super(id, dia, mes, anio);
        super.setPrecio(50);
    }

    @Override
    public int precioTick() {
        return super.getPrecio();
    }
    
    
    
    
    
}
