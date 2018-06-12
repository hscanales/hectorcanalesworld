/*
 * 
 * 
 * 
 */
package com.hscanales.clans.structures;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class CommandCenter implements Structure {

    int Agold = 3000, Ametal = 10000, Apeople = 5000, lvl = 0;
    int x, y;
    int vida;

    public CommandCenter(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Has construido tu aldea en " + x + "," + y);
    }

    public void lvlup() {
        System.out.println("Actualmente tu command center es: " + lvl);
        lvl++;
        System.out.println("lo has subido a " + lvl);
        if (lvl == 1) {
            Agold *= 1.10;
            Ametal *= 1.10;
            Apeople *= 1.10;
        }
        if (lvl == 2) {
            Agold *= 1.30;
            Ametal *= 1.30;
            Apeople *= 1.30;
        }
        if (lvl == 3) {
            Agold *= 1.50;
            Ametal *= 1.50;
            Apeople *= 1.50;
        }

        if (lvl > 3) {
            Agold *= 1.75;
            Ametal *= 1.75;
            Apeople *= 1.75;
        }

        System.out.println("Ahora puedes almacenar " + Agold + " de Oro, " + Ametal + " de Metal y " + Apeople + " personas en tu Clan");
    }

    @Override
    public void getDamage(int damage) {
        this.vida -= damage;
        System.out.println("La estructura a recibido " + damage + "de danio");
    }

}
