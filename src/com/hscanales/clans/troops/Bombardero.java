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
public class Bombardero implements Tropa {
    
    int damageE, damageT, vida;
    String nombre;
    
    public Bombardero() {
        this.damageE = 1500;
        this.damageT = 7000;
        this.vida = 60000;
        this.nombre = "Bombardero";
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
    
}
