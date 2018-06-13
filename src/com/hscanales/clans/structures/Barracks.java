/*
 * 
 * 
 * 
 */
package com.hscanales.clans.structures;

import com.hscanales.Player;
import com.hscanales.clans.troops.TroopFactory;
import com.hscanales.clans.troops.Tropa;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Barracks implements Militar, Structure {

    int vida;
    Player player;
    TroopFactory fabrica;
    
    public Barracks(Player player) {
        this.player=player;
        this.fabrica=new TroopFactory();
        
    }

    
    
    @Override
    public void entrenar(String type) {
        Tropa tropa = fabrica.TroopCreator(type);
        this.player.entrenando.add(tropa);
    }

    @Override
    public void getDamage(int damage) {
        this.vida -= damage;
        System.out.println("La estructura a recibido " + damage + "de danio");
    }

}
