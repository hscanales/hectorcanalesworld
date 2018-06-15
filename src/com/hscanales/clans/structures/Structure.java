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
public interface Structure {

    void getDamage(int damage);

    void build();

    int getVelocidad();

    String getName();

    void producir();

    int recolectar();

    void entrenar(String type);

}
