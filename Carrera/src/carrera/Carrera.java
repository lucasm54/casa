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
public class Carrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto("rojo","ABC123");
        Auto auto2 = new Auto("azul","JSU491");
        auto1.avanzar(400);
        System.out.println("auto1.getCombustible");
        System.out.println("HC"+auto1.hashCode());
        System.out.println("TS"+auto1.toString());
        System.out.println("GC"+auto1.getClass());
        System.out.println("HC:"+auto1.hashCode());
        System.out.println("Instansof"+(auto1 instanceof vehiculo));
        auto1.retroceder(1000);
        auto1.llenarTanque();
                        
    }
    
}


        
        
 
     
