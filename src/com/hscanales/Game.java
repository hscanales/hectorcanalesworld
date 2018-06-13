/*
 * 
 * 
 * 
 */
package com.hscanales;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Game {
    Player player1= new Player(this);
    Player player2= new Player(this);
    int fase;

    public Game() {
        this.fase=0;
        loop();
    }
    
    void turno(){
        if(player1.isTurnFinished()||player2.isTurnFinished()){
            fase++;
        }
    }
    
    void loop(){
        
    }
    
}
