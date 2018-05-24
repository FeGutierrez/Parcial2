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
public class StudentAdvanceTicket extends AdvanceTicket{
    
    private Estudiante estudiante;

    public StudentAdvanceTicket(Event event, int id, int dia, int mes, int anio, Estudiante estudiante) {
        super(event, id, dia, mes, anio);
        if (super.getEvent().getDia() - dia >= 10) {
            super.setPrecio(super.getAdvprc()/2);
        }
        if (super.getEvent().getDia() - dia < 10) {
            super.setPrecio(super.getAdvprc()/2);
        }
        this.estudiante = estudiante;
    }
    @Override
    public int precioTick() {
        return super.getPrecio();
    }
    
    @Override
    public String info(){
        return super.info() + " Carnet estudiante: " + this.estudiante.getCarnet();
    }


    
}
