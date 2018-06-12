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
public class Escuela implements Productor, Structure {

    int graduados, vida;

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

}
