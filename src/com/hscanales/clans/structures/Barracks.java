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
public class Barracks implements  Structure {

    int vida;
    Player player;
    TroopFactory fabrica;
    int velocidad;
    String nombre;

    public Barracks(Player player, String nombre) {
        this.player = player;
        this.fabrica = new TroopFactory();
        this.nombre = nombre;
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

    @Override
    public void build() {
        velocidad--;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String getName() {
        return nombre;
    }

    @Override
    public void producir() {
    }

    @Override
    public int recolectar() {
        return 0;
    }

}
