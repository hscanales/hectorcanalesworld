/*
 * 
 * 
 * 
 */
package com.hscanales;

import com.hscanales.clans.Clan;
import com.hscanales.clans.ClanFactory;
import com.hscanales.clans.structures.Barracks;
import com.hscanales.clans.structures.Militar;
import com.hscanales.clans.troops.Tropa;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Player implements IPlayer {

    Game game;
    Clan clan;
    ClanFactory fabrica;
    Scanner input = new Scanner(System.in);
    public ArrayList<Tropa> entrenando = new ArrayList<>();

    boolean turnFinished = false;

    public Player(Game game) {
        fabrica = new ClanFactory();
        seleccionarClan();
        this.game = game;
    }

    Player() {
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
                    clan = fabrica.ClanCreator("novak");
                    flag = false;
                    break;
                case 2:
                    clan = fabrica.ClanCreator("empires");
                    flag = false;
                    break;
                case 3:
                    clan = fabrica.ClanCreator("badlion");
                    flag = false;
                    break;
                default:
                    System.out.println("Ingresaste un dato no valido");
                    break;
            }

        } while (flag);
    }

    @Override
    public void terminarTurno() {
        this.turnFinished = true;
        game.turno();
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

    @Override
    public void entrenar() {
        String a = clan.getName();
        Boolean flag = true;
        int op = -1;
        Militar b = new Barracks(this);
        do {
            if ("NOVAK".equals(a)) {
                System.out.println("Menu Entrenamiento Novak: ");
                System.out.println("1- Entrenar Batallon Kyogra");
                System.out.println("2- Entrenar Batallon Hajuzk");
                System.out.println("3- Entrenar Batallon DoomPiggy");
                System.out.println("0- Salir");
                try {
                    System.out.println("Ingrese su opcion");
                    op = input.nextInt();

                } catch (InputMismatchException e) {
                    System.err.println("Los datos ingresados no corresponden al formato correcto, intente denuevo: ");
                    input.next();
                }

                switch (op) {
                    case 1:
                        b.entrenar("kyogra");
                        flag = false;
                        break;
                    case 2:
                        b.entrenar("hajuzk");
                        flag = false;
                        break;
                    case 3:
                        b.entrenar("doompiggy");
                        flag = false;
                        break;
                    default:
                        System.out.println("Opcion no valida, intente denuevo");
                        break;

                }

            }

            if ("BADLION".equals(a)) {
                System.out.println("Menu Entrenamiento BadLion: ");
                System.out.println("1- Entrenar Squad Ginie");
                System.out.println("2- Entrenar Squad Pikaoku");
                System.out.println("3- Entrenar Squad CringieCake");
                System.out.println("0- Salir");

                try {
                    System.out.println("Ingrese su opcion");
                    op = input.nextInt();

                } catch (InputMismatchException e) {
                    System.err.println("Los datos ingresados no corresponden al formato correcto, intente denuevo: ");
                    input.next();
                }

                switch (op) {
                    case 1:
                        b.entrenar("GINIE");
                        flag = false;
                        break;
                    case 2:
                        b.entrenar("Pikaoku");
                        flag = false;
                        break;
                    case 3:
                        b.entrenar("Cringiecake");
                        flag = false;
                        break;
                    default:
                        System.out.println("Opcion no valida, intente denuevo");
                        break;

                }

            }

            if ("EMPIRES".equals(a)) {
                System.out.println("Menu Entrenamiento Empires: ");
                System.out.println("1- Entrenar Escuadron Zeus");
                System.out.println("2- Entrenar Escuadron Joa");
                System.out.println("3- Entrenar Escuadron Pretcorp");
                System.out.println("0- Salir");

                try {
                    System.out.println("Ingrese su opcion");
                    op = input.nextInt();

                } catch (InputMismatchException e) {
                    System.err.println("Los datos ingresados no corresponden al formato correcto, intente denuevo: ");
                    input.next();
                }
                switch (op) {
                    case 1:
                        b.entrenar("zeus");
                        flag = false;
                        break;
                    case 2:
                        b.entrenar("joa");
                        flag = false;
                        break;
                    case 3:
                        b.entrenar("pretcorp");
                        flag = false;
                        break;
                    default:
                        System.out.println("Opcion no valida, intente denuevo");
                        break;

                }

            }
        } while (flag);

    }
}
