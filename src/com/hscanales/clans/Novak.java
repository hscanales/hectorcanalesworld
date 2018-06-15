/*
 * 
 * 
 * 
 */
package com.hscanales.clans;

import com.hscanales.clans.structures.*;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Novak implements  Clan {
    String Chief="Lord Obdulio";

    
    Novak() {
        System.out.println("Has elegido a "+Chief);

    }

  
    @Override
    public String getName() {
    return "NOVAK";
    }
}
