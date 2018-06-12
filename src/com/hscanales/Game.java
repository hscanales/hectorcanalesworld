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
    Player player1= new Player();
    Player player2= new Player();
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
