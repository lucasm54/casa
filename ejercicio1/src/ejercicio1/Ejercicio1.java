/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author programador
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Viaje v=new Viaje("san luis","villa mercedes",'n',"auto",1,1,91);
 double resultado=v.calcularDistancia();
 System.out.println("distacia"+resultado);
 
    }
    
}
