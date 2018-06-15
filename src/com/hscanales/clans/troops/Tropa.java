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

    void attack();

    void defend();

    void atacado(int damage);

    boolean checkLife();

    int getLife();

    String getName();

    void Training();

    int getTraining();

    void Avanzando();

    int getVelocidad();

    void Target(Structure estructura);

    void Target(Tropa tropa);
}
