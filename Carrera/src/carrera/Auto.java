/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

/**
 *
 * @author programador
 */
public class Auto {
    private String color;
    private String patente;
    private double combustible;

    public Auto() {
    }

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    public void llenarTanque() {
         combustible = 50;
         System.out.println("tanque lleno");
    }

public void avanzar(double metros){
    double combustibleNecesario = metros *0.1;
    if (combustible >= combustibleNecesario)
        combustible = combustible - metros*0.1;

else 
System.out.println("No puede avanzar");
}

public void retroceder(double metros){
    double combustibleNecesario = metros*0.1;
    if (combustible >= combustibleNecesario)
        combustible = combustible - metros*0.1;
    else
        System.out.println("No puede avanzar");
    
    
}

}