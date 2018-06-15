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
public class LegendaryTroop implements Tropa {

    int damageE, damageT;
    public int vida;
    String nombre;
    public int Velocidad = 2, Entrenamiento = 10;
    Structure estructura;
    
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
    public void attack() {
        if (vida > 0) {
            estructura.getDamage(damageE);
        }
    }

    @Override
    public void defend(Tropa tropa) {
        if (vida > 0) {
            tropa.atacado(this.damageT);
        }
    }

    @Override
    public void atacado(int damage) {
        this.vida -= damage;
        System.out.println("La tropa a recibido " + damage + " de danio ");
    }

    @Override
    public boolean checkLife() {
        if (vida < 0) {
            return false;
        }
        return true;
    }

    @Override
    public int getLife() {
        return vida;
    }

    @Override
    public String getName() {
        return nombre;
    }

    @Override
    public void Training() {
        this.Entrenamiento--;
    }

    @Override
    public int getTraining() {
        return this.Entrenamiento;
    }

    @Override
    public void Avanzando() {
        this.Velocidad--;
    }

    @Override
    public int getVelocidad() {
        return this.Velocidad;
    }

    @Override
    public void Target(Structure estructura) {
    
    this.estructura=estructura;
    }


}
