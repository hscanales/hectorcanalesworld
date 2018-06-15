/*
 * 
 * 
 * 
 */
package com.hscanales.clans.structures;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Escuela implements  Structure {

    int graduados, vida;
    int velocidad;
    String nombre;

    public Escuela(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public void producir() {
        graduados += 300;
    }

    @Override
    public int recolectar() {
        return graduados;
    }

    @Override
    public void getDamage(int damage) {
        this.vida -= damage;
        System.out.println("La estructura a recibido " + damage + "de danio");
    }

    @Override
    public void build() {
        velocidad--;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
     @Override
    public String getName() {
        return nombre;
    }

    @Override
    public void entrenar(String type) {
    }

 @Override
    public int getVida() {
        return vida;
    }
}
