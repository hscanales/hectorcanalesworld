/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hscanales.clans.troops;

import com.hscanales.clans.structures.Structure;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author uca
 */
public class LegendaryTroop implements Tropa {
    
    
    int damageE, damageT, vida;
    String nombre;
    
    public LegendaryTroop(String nombre) {
        this.damageE = 600;
        this.damageT = 225;
        this.vida = 1000;
        this.nombre = nombre;
    }
    
    public int getDamageE() {
        return damageE;
    }
    
    public void setDamageE(int damageE) {
        this.damageE = damageE;
    }
    
    public int getDamageT() {
        return damageT;
    }
    
    public void setDamageT(int damageT) {
        this.damageT = damageT;
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

      @Override
    public boolean checkLife() {
        if(vida<0){
          return false;
        }
       return true;
    }

    @Override
    public int getLife() {
        return vida;
    }
    
}
