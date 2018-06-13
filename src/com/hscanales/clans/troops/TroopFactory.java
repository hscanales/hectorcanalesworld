/*
 * 
 * 
 * 
 */
package com.hscanales.clans.troops;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class TroopFactory {

    public Tropa TroopCreator(String type) {
        String typefix = type.toUpperCase();
        switch (typefix) {
            
            ///NOVAK
            case "KYOGRA":
                return new CommonTroop(type);
            case "HAJUZK":
                return new RareTroop(type);
            case "DOOMPIGGY":
                return new LegendaryTroop(type);
            
            //EMPIRES
            case "ZEUS":
                return new CommonTroop(type);
            case "JOA":
                return new RareTroop(type);
            case "PRETCORP":
                return new LegendaryTroop(type);
            
            //BADLION
            case "GINIE":
                return new CommonTroop(type);
            case "PIKAOKU":
                return new RareTroop(type);
            case "CRINGIECAKE":
                return new LegendaryTroop(type);

        }

        return null;
    }
}
