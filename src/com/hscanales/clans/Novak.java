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
    CommandCenter Center;
    Novak() {
        System.out.println("Has elegido a "+Chief);
        Center= new CommandCenter(1,1);
    }

    @Override
    public void lvlup(){
        this.Center.lvlup();
    }
}
