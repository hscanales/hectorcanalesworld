/*
 * 
 * 
 * 
 */
package com.hscanales;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Menu {

    Scanner input = new Scanner(System.in);
    private static Menu instance;
    Game juego;
    private Menu() {
    }

    ;
    


    public synchronized static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    void Start() {
        boolean flag = true;
        int op = -1;
            System.out.println("Hector Canales's Conquest of the New World v0.01");
        do {


            System.out.println("Menu:");
            System.out.println("1-Iniciar partida");
            System.out.println("0-Salir");

            try {
                System.out.println("Ingrese su opcion");
                op = input.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("Los datos ingresados no corresponden al formato correcto, intente denuevo ");
                input.next();
            }
            switch (op) {

                case 1:
                    System.out.println("Iniciando partida");
                    juego=new Game();
                    break;
                case 0:
                    System.out.println("Adios :)");
                    flag = false;
                    break;
                default:
                    System.out.println("Ingresaste un dato no valido");
                    break;
            }

        } while (flag);
    }
}
