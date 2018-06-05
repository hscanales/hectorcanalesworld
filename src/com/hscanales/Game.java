/*
 * 
 * 
 * 
 */
package com.hscanales;

import com.hscanales.clans.Clan;
import com.hscanales.clans.ClanFactory;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Game {
    Scanner input = new Scanner(System.in);
    private static Game instance;

    private Game() {
    }
    ;
    
    ClanFactory factory = new ClanFactory();
    Clan player1, player2;

    public synchronized static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    void Start() {
        boolean flag=true;
        System.out.println("Hector Canales's Conquest of the New World v0.01");
        System.out.println("Menu:");
        System.out.println("1-Iniciar partida");
        System.out.println("2-Salir");
        
        int op=-1;
       
        do{    
        try{
            op=input.nextInt();
            
        }
        
        catch(InputMismatchException e){
            System.err.println("Ingresaste algo no valido");
            input.next();
        }
        switch(op){
            case -1: 
                System.out.println("Ingresaste un dato no valido");
                break;
            case 1:
                System.out.println("Iniciando partida");
                break;
            case 2:
                System.out.println("Adios :)");
                flag=false;
                break;
            default:
                System.out.println("Ingresaste un dato no valido");
                break;
            }
        
    }while(op==-1);
        }
    }

