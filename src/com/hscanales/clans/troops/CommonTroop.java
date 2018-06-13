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
public class CommonTroop implements Tropa {

    int damageE, damageT;
    public int vida;
    public String nombre;

    public CommonTroop(String nombre) {
        this.damageE = 150;
        this.damageT = 75;
        this.vida = 200;
        this.nombre = nombre;
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
        checkLife();
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

}
