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
public class Escuela implements Productor,Structure {

    int graduados;

    @Override
    public void producir() {
        graduados+=300;
    }

    @Override
    public int recolectar() {
        return graduados;
    }

}
