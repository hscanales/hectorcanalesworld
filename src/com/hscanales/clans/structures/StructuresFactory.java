/*
 * 
 * 
 * 
 */
package com.hscanales.clans.structures;

import com.hscanales.Player;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class StructuresFactory {
    Player player;

    public StructuresFactory(Player player) {
        this.player = player;
    }
    
    
    public Structure TroopCreator(String type) {
        String typefix = type.toUpperCase();
        switch (typefix) {
            
            ///NOVAK
            case "NOVAKHQ":
                return new Barracks(player,"Cuartel Novak");
            case "TITANES":
                return new Escuela("Escuela de Titanes");
            case "MARKET":
                return new Mercado("Mercado de Armas");
            
            //EMPIRES
            case "BOOTCAMP":
                return new Barracks(player,"Outer Heaven");
            case "UNIVERSIDAD":
                return new Escuela("UCA");
            case "CHURCH":
                return new Mercado("MINA DE ORO");
            
            //BADLION
            case "BARRACKS":
                return new Barracks(player,"Zanzibar Land");
            case "SHOOTINGRANGE":
                return new Escuela("OverCast Network");
            case "GOLDMINE":
                return new Mercado("Badlion Client");
        }

        return null;
    }
}
