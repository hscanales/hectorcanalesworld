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
public class Mineria implements Productor,Structure {
    int almancen;
    @Override
    public void producir() {
    }

    @Override
    public int recolectar() {
        return almancen;
    }
    
}
