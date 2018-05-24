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
public abstract class Ticket {
    protected int id;
    private int precio;
    private int dia;
    private int mes;
    private int anio;

    public Ticket(int id, int dia, int mes, int anio) {
        this.id = id;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public abstract int precioTick();
    
    public String info(){
        return "Id: " + this.id + " Precio: " + this.getPrecio() + " "+ this.getClass().getSimpleName();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
