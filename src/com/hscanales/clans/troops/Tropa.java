/*
 * 
 * 
 * 
 */
package com.hscanales.clans.troops;

import com.hscanales.clans.structures.Structure;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public interface Tropa {

    void attack(Structure estructura);

    void defend(Tropa tropa);

    void atacado(int damage);
    
    boolean checkLife();
    
    int getLife();
}
