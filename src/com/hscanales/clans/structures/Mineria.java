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
public class Mineria implements Productor, Structure {

    int almacen, vida;

    public Mineria() {
    }

    @Override
    public void producir() {
    }

    @Override
    public int recolectar() {
        return almacen;
    }

    @Override
    public void getDamage(int damage) {
        this.vida -= damage;
        System.out.println("La estructura a recibido " + damage + "de danio");
    }

}
