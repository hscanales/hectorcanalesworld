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
    public int Velocidad = 4, Entrenamiento = 2;
    Structure estructura;
    Tropa enemigo;
    
    public CommonTroop(String nombre) {
        this.damageE = 150;
        this.damageT = 75;
        this.vida = 200;
        this.nombre = nombre;
    }

  @Override
    public void attack() {
        if (vida > 0) {
            if(estructura==null ){
                if(enemigo==null){
                    System.out.println(" no hay target definido");
                }else{
                    enemigo.atacado(damageT);
                }
                
            }else{
                estructura.getDamage(damageE);
            }
            
        }
    }

 @Override
    public void defend() {
        enemigo.atacado(damageT);
    }

    @Override
    public void Target(Tropa tropa) {
        enemigo=tropa;
        
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
        } else {
            return true;
        }
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

        this.estructura = estructura;
    }
}
