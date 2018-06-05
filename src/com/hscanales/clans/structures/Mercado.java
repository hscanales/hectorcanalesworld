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
public class Mercado implements Productor,Structure{
    int almacen;
    
    @Override
    public void producir() {
    }

    @Override
    public int recolectar() {
        return almacen;
    }
    
}
