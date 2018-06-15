/*
 * 
 * 
 * 
 */
package com.hscanales;

import com.hscanales.clans.Clan;
import com.hscanales.clans.ClanFactory;
import com.hscanales.clans.structures.Barracks;
import com.hscanales.clans.structures.CommandCenter;
import com.hscanales.clans.structures.Structure;
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
    //Arrays de Tropas
    public ArrayList<Tropa> entrenando = new ArrayList<>();
    public ArrayList<Tropa> entrenadas = new ArrayList<>();
    public ArrayList<Tropa> avanzando = new ArrayList<>();

    //Array de Tropas enemigas
    public ArrayList<Tropa> attacked = new ArrayList<>();

    //Array de Estructuras 
    public ArrayList<Structure> construyendo = new ArrayList<>();
    public ArrayList<Structure> edificios = new ArrayList<>();
    
    CommandCenter centro = new CommandCenter("Command Center");
    
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

    }

    @Override
    public void Construir() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void atacar() {
        Tropa tropa ;
        int op = 0;
        boolean flag = true;
        
        if (entrenadas.size() <= 0) {
            System.out.println("No tienes tropas para atacar a tu enemigo! ");
            System.out.println("Para entrenar tropas elige la opcion de Entrenar Tropas en el menu jugador");
        } else {

            System.out.println("Lista de Tropas entrenadas: ");
            for (int i = 0; i < entrenadas.size(); i++) {
                System.out.println(i + "- " + entrenadas.get(i).getName());
            }
            System.out.println("Ingrese -1 para salir");

            do {
                try {
                    System.out.println("Seleccione su opcion: ");
                    op = input.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Error al momento de ingresar el dato, intenta denuevo: ");
                    input.next();

                } finally {
                    if (op > -1 && op < 11) {
                        tropa = entrenadas.get(op);
                        System.out.println("A decidio utilizar la tropa : "+ tropa.getName());
                        avanzando.add(entrenadas.get(op));
                        entrenadas.remove(op);
                        Structure estructura = elegirAtaque();
                        
                        flag = false;

                    } else {
                        //System.out.println("No elegiste una tropa correcta, intenta denuevo");
                        System.out.println("Intente denuevo: ");
                        
                    }
                }
            } while (flag);

        }

    }

    public boolean isTurnFinished() {
        return turnFinished;
    }

    @Override
    public void entrenar() {
        String a = clan.getName();
        Boolean flag = true;
        int op = -1;
        Structure b = new Barracks(this,"Boot Camp");

        if ((entrenadas.size() + entrenando.size()) < 11) {
            do {
                if ("NOVAK".equals(a)) {
                    System.out.println("Menu Entrenamiento Novak: ");
                    System.out.println("1- Entrenar Batallon Kyogra");
                    System.out.println("2- Entrenar Acorazado Hajuzk");
                    System.out.println("3- Entrenar DoomPiggy");
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
                        case 0:
                            flag = false;
                            break;

                    }

                }

                if ("BADLION".equals(a)) {
                    System.out.println("Menu Entrenamiento BadLion: ");
                    System.out.println("1- Entrenar Squad Ginie");
                    System.out.println("2- Entrenar Pikaoku Bomber");
                    System.out.println("3- Entrenar CringieCake");
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
                        case 0:
                            flag = false;
                            break;

                    }

                }

                if ("EMPIRES".equals(a)) {
                    System.out.println("Menu Entrenamiento Empires: ");
                    System.out.println("1- Entrenar Escuadron Zeus");
                    System.out.println("2- Entrenar JoaFM18 ");
                    System.out.println("3- Entrenar Pretcorp");
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
                        case 0:
                            flag = false;
                            break;

                    }

                }
            } while (flag);

        } else {
            System.err.println("Ya llegaste al limite de tropas, no puedes seguir entrenando");
        }

    }

    private Structure elegirAtaque() {
    Structure g = null;
    int op;
     if(game.freePlayer.edificios.size()<=0){
         System.out.println("Vas a atacar al Centro de Mando Enemigo!");
         g = game.freePlayer.centro;
         
     }
     else{
         System.out.println("Edificios de tu enemigo: ");
         for(int i = 0;i<game.freePlayer.edificios.size();i++){
             
             System.out.println(i + "- Nombre: "+ game.freePlayer.edificios.get(i).getName());
         }
         System.out.println("Elige tu opcion: ");
         
         try{
             op=input.nextInt();
             g=game.freePlayer.edificios.get(op);
         }catch(InputMismatchException e){
             System.out.println("Formato incorrecto, intenta denuevo: ");
             input.next();
         }
         
     
     }
    
    return  g;
    }

    @Override
    public void lvlup() {
        centro.lvlup();
    }
}
