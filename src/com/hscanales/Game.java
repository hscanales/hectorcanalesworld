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
public class Game {

    Player player1 = new Player(this);
    Player player2 = new Player(this);
    Player freePlayer;
    int fase;
    boolean GameOver = false;
    Scanner input = new Scanner(System.in);

    public Game() {
        this.fase = 0;
        loop();
    }

    void turno() {
        if (player1.isTurnFinished() && player2.isTurnFinished()) {
            fase++;
            player1.turnFinished = false;
            player2.turnFinished = false;
            System.out.println("Cambio de fase");
            System.out.println(fase);
            training();
            building();
        }
        System.out.println("Fase= " + fase);
    }

    void loop() {

        do {
            System.out.println("\n\n\n\n\n");
            System.out.println(" ==================  ");
            System.out.println("=|Player1's turn  |= ");
            System.out.println(" ======     =======  ");
            freePlayer = player2;
            Play(player1);
            System.out.println("\n\n\n\n\n");
            System.out.println(" ==================  ");
            System.out.println("=|Player2's turn  |= ");
            System.out.println(" ======     =======  ");
            freePlayer = player1;
            Play(player2);

        } while (!GameOver);

    }

    void Play(Player player) {
        Boolean flag = player.isTurnFinished();
        int op = -1;
        while (!flag) {
            System.out.println(" ===============  ");
            System.out.println("=| Menu Player |= ");
            System.out.println(" ===============  ");
            System.out.println(" 1| Construir Edificacion");
            System.out.println(" 2| Entrenar Tropa");
            System.out.println(" 3| Defender Aldea");
            System.out.println(" 4| Atacar Edifcacion Enemiga");
            System.out.println(" 5| Subir de Nivel Centro de Comando");
            System.out.println(" 0| Terminar Turno");

            try {
                System.out.println("Ingrese su opcion");
                op = input.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("Los datos ingresados no corresponden al formato correcto, intente denuevo: ");
                input.next();
            }
            switch (op) {
                case 1:
                    player.Construir();
                    break;
                case 2:
                    player.entrenar();
                    break;
                case 3:
                    player.defender();
                    break;
                case 4:
                    player.atacar();
                    break;
                case 5: 
                    player.lvlup();
                    break;
                case 0:
                    flag = true;
                    player.turnFinished = true;
                    break;
                default:
                    System.err.println("Opcion no valida");
            }
        }
        turno();
    }

    void training() {
        if (player1.entrenando.size() > 0) {
            for (int i = 0; i < player1.entrenando.size(); i++) {
                player1.entrenando.get(i).Training();
                if (player1.entrenando.get(i).getTraining() <= 0) {
                    player1.entrenadas.add(player1.entrenando.get(i));
                    player1.entrenando.remove(i);
                }
            }
        }

        if (player2.entrenando.size() > 0) {
            for (int i = 0; i < player2.entrenando.size(); i++) {
                player2.entrenando.get(i).Training();
                if (player2.entrenando.get(i).getTraining() <= 0) {
                    player2.entrenadas.add(player2.entrenando.get(i));
                    player2.entrenando.remove(i);
                }
            }

        }
    }

    void building() {
        if(player1.construyendo.size()>0){
            for(int i = 0; i< player1.construyendo.size(); i++){
                player1.construyendo.get(i).build();
                if(player1.construyendo.get(i).getVelocidad()<=0){
                    player1.edificios.add(player1.construyendo.get(i));
                    player1.construyendo.remove(i);
                }
            }
        }
        if(player2.construyendo.size()>0){
            for(int i = 0; i< player2.construyendo.size(); i++){
                player2.construyendo.get(i).build();
                if(player2.construyendo.get(i).getVelocidad()<=0){
                    player2.edificios.add(player2.construyendo.get(i));
                    player2.construyendo.remove(i);
                }
            }
        }
    }

}
