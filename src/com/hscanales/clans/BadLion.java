/*
 * 
 * 
 * 
 */
package com.hscanales.clans;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class BadLion implements Clan{
    String Chief="King Adam";
    
    public BadLion() {
         System.out.println("Has elegido a "+Chief);
    }


    @Override
    public String getName() {
    return "BADLION";
    }
    
}
