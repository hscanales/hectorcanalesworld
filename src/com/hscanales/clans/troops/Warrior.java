/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hscanales.clans.troops;

import com.hscanales.clans.structures.Structure;

/**
 *
 * @author uca
 */
public class Warrior implements Tropa {
    int damageE,damageT,vida;

    public Warrior() {
        this.damageE = 200;
        this.damageT = 150;
        this.vida = 2000;
    }
    

    
    @Override
    public void attack(Structure estructura) {
        estructura.getDamage(damageE);
    }
    
    @Override
    public void defend(Tropa tropa) {
        tropa.atacado(this.damageT);
        
    }
    
    @Override
    public void atacado(int damage) {
        this.vida -= damage;
        System.out.println("La tropa a recibido " + damage + " de danio ");
    }
}
