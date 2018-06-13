/*
 * 
 * 
 * 
 */
package com.hscanales.clans.troops;

import com.hscanales.clans.structures.Structure;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class RareTroop implements Tropa{
    int vida,damageE,damageT;
    String nombre;
    public RareTroop(String nombre) {
        this.vida = 600;
        this.damageE = 300 ;
        this.damageT = 150;
        this.nombre=nombre;
    }
    
    

    @Override
    public void attack(Structure estructura) {
        if(checkLife())
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
        if(vida<=0){
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
