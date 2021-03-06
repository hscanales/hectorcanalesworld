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
public class RareTroop implements Tropa {

    int damageE, damageT;
    String nombre;
    public int vida;
    public int Velocidad = 2, Entrenamiento = 4;
    Structure estructura ;
    Tropa enemigo;
    
    public RareTroop(String nombre) {
        this.vida = 600;
        this.damageE = 300;
        this.damageT = 150;
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
    public void atacado(int damage) {
        this.vida -= damage;
        System.out.println("La tropa a recibido " + damage + " de danio ");

    }

    @Override
    public boolean checkLife() {
        if (vida <= 0) {
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

    @Override
    public void defend() {
        enemigo.atacado(damageT);
    }

    @Override
    public void Target(Tropa tropa) {
        enemigo=tropa;
        
    }
}
