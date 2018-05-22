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
public class Estudiante {
    private int carnet;
    private Institucion institucion;

    public Estudiante(int carnet, Institucion institucion) {
        this.carnet = carnet;
        this.institucion = institucion;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    
    
    
}
