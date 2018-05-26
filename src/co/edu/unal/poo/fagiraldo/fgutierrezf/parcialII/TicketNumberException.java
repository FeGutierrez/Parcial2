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
public class TicketNumberException extends Exception{
    public TicketNumberException(String mensaje){
            super("\033[31m"+mensaje);
    }
    
}
