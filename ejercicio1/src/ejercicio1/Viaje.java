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
public class Viaje {
    private String origen;
    private String destino;
    private double distancia;
    private char tipoCombustible;
    private String tipoVehiculo;
            private int peajes;
            private int kmCiudadOrigen;
            private int kmCiudadDestino;
            
            //Contructor
            public Viaje(String origen,String destino,double distancia,char tipoCombustible,String tipoVehiculo, int peajes, int ciudadOrigen){
               this.origen=origen;
               this.destino=destino;
               this.distancia=distancia;
               this.tipoCombustible= tipoCombustible;
               this.tipoVehiculo= tipoVehiculo;
               this.peajes=peajes;
               this.kmCiudadOrigen= kmCiudadOrigen;
               
                       
            }

    public Viaje(String origen, String destino, char tipoCombustible, String tipoVehiculo, int peajes, int kmCiudadOrigen, int kmCiudadDestino) {
        this.origen = origen;
        this.destino = destino;
        this.tipoCombustible = tipoCombustible;
        this.tipoVehiculo = tipoVehiculo;
        this.peajes = peajes;
        this.kmCiudadOrigen = kmCiudadOrigen;
        this.kmCiudadDestino = kmCiudadDestino;
    }

public double calcularDistancia(){
if (distancia>0)
{return distancia;

}
else{
double dist = kmCiudadDestino - kmCiudadOrigen;
return dist;
}
}
}
