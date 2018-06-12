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
public class Player implements IPlayer {

    Clan clan;
    ClanFactory fabrica;
    Scanner input = new Scanner(System.in);

    boolean turnFinished = true;

    public Player() {
        fabrica = new ClanFactory();
        seleccionarClan();
    }

    @Override
    public void seleccionarClan() {

        boolean flag = true;
        int op = -1;
        do {

            System.out.println("Clanes a elegir: ");
            System.out.println("1- Novak");
            System.out.println("2- Empires");
            System.out.println("3- BadLion");

            try {
                System.out.println("Ingrese su opcion");
                op = input.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("Los datos ingresados no corresponden al formato correcto, intente denuevo: ");
                input.next();
            }
            switch (op) {

                case 1:
                    clan=fabrica.ClanCreator("novak");
                    flag=false;
                    break;
                case 2:
                    clan=fabrica.ClanCreator("empires");
                    flag = false;
                    break;
                case 3:
                    clan=fabrica.ClanCreator("badlion");
                    flag=false;
                    break;
                default:
                    System.out.println("Ingresaste un dato no valido");
                    break;
            }

        } while (flag);
    }

    @Override
    public void terminarTurno() {
    }

    @Override
    public void Construir() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void atacar() {
    }

    public boolean isTurnFinished() {
        return turnFinished;
    }

}
