/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author programador
 */
public class Personaje {
    protected Posicion ubicacion;
    protected String nick;
    protected int vidas=3;
    protected char orientacion='N';
    protected int energia=100;

    public Personaje(Posicion ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
    }
   

public void disparar(){
if (energia>=10){
    energia=energia-10;
}else {
            System.out.println("ya no hay energia");
            }
            }


public void girar(){
if (orientacion =='N'){
orientacion='E';
}else if(orientacion=='E'){
orientacion='S';
}else if(orientacion=='S'){
orientacion='O';
}else {
orientacion='N';

}
}

public void avanzar(){
    if (orientacion=='N') {
        ubicacion.setY(ubicacion.getY()-1);
                }else if (orientacion=='S') {
                    ubicacion.setY(ubicacion.getY()+1);
                }else if(orientacion=='E'){
                    ubicacion.setX(ubicacion.getX()-1);
                }else{ubicacion.getx()+1};
    
}



                            
    }
}
}
