package TFP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

		System.out.println(" ___       _______   _______    _______  _____  ___   ________    ________        ______    _______     __   __  ___       __        _______   \r\n"
				+ "|\"  |     /\"     \"| /\" _   \"|  /\"     \"|(\\\"   \\|\"  \\ |\"      \"\\  /\"       )      /    \" \\  /\"     \"|   |\"  |/  \\|  \"|     /\"\"\\      /\"      \\  \r\n"
				+ "||  |    (: ______)(: ( \\___) (: ______)|.\\\\   \\    |(.  ___  :)(:   \\___/      // ____  \\(: ______)   |'  /    \\:  |    /    \\    |:        | \r\n"
				+ "|:  |     \\/    |   \\/ \\       \\/    |  |: \\.   \\\\  ||: \\   ) || \\___  \\       /  /    ) :)\\/    |     |: /'        |   /' /\\  \\   |_____/   ) \r\n"
				+ " \\  |___  // ___)_  //  \\ ___  // ___)_ |.  \\    \\. |(| (___\\ ||  __/  \\\\     (: (____/ // // ___)      \\//  /\\'    |  //  __'  \\   //      /  \r\n"
				+ "( \\_|:  \\(:      \"|(:   _(  _|(:      \"||    \\    \\ ||:       :) /\" \\   :)     \\        / (:  (         /   /  \\\\   | /   /  \\\\  \\ |:  __   \\  \r\n"
				+ " \\_______)\\_______) \\_______)  \\_______) \\___|\\____\\)(________/ (_______/       \\\"_____/   \\__/        |___/    \\___|(___/    \\___)|__|  \\___) \r\n"
				+ "                                                                                                                                               ");
							  
		  System.out.println("Bienvenido jugadores!");
		  System.out.println("");
		  System.out.println("Empezar (1)");
		  System.out.println("Manual de Juego (2)");
		  System.out.println("Salir (3) ");
		  // bucle de menu
		  int ilk = sc.nextInt();
          
		    // creacion de turno
			  //creacion de personaje para jugador 1  y 2
			  Personaje jugador1 = null; 
			  Personaje jugador2 = null; 
			  Personaje jugador3 = null; 
			  Personaje jugador4 = null; 
			  
			turno turno1 = new turno (jugador1, jugador2);
           
            do {
                switch (ilk) {
                    case 1:
                        System.out.println("Porfavor antes que todo introducen sus nombres: ");
                        System.out.println("");
                        System.out.println("Primeros y Ultimos dos jugador estaran en mismo equipo!");
                        System.out.println("");
                        //creacion de regiones
                        Region Region1 = new Ionia();
                        Region Region2 = new Noxus();
                        String nombreJugador1 = "";
                        String nombreJugador2 = "";
                        String nombreJugador3 = "";
                        String nombreJugador4 = "";
                        // preguntar y asignar los nombres de los jugadores
                        for (int i = 0; i < 4; i++) {
                            System.out.println("Como te llamas Jugador " + (i+1) + " ?" );
                            
                            if (i == 0) {
                                
                                nombreJugador1 = sc.nextLine();
                                nombreJugador1 = sc.nextLine();
                            }
                            if (i == 1) {
                                nombreJugador2 = sc.nextLine();
                            }
                            if (i == 2) {
                                nombreJugador3 = sc.nextLine();
                            }
                            if (i == 3) {
                                nombreJugador4 = sc.nextLine();
                            }
                        }
                        // elegir region para heroe de jugador 1
                        turno1.EligeRegion( nombreJugador1 );
                        int secimRegion = sc.nextInt();
                        turno1.EligeHeroe(secimRegion);
                        int HERO = sc.nextInt();
                        // Asignar al jugador heroe elegido para jugador 1 (crear)
                        if(secimRegion ==1) {
                            if(HERO == 1) {
                                jugador1 = new HeroeAtaque("Yasuo" , Region1 );
                            }else {
                                jugador1 = new HeroeDefensa("Lux" , Region1 );
                            }
                        }else {
                            if(HERO == 1) {
                                jugador1 = new HeroeAtaque("Katarina" , Region2 );
                            }else {
                                jugador1 = new HeroeDefensa("Darius" , Region2 );
                            }
                        }
                        // elegir region para heroe de jugador 2
                        
                        turno1.EligeRegion(nombreJugador2);
                        int secimRegion2 = sc.nextInt();
                        turno1.EligeHeroe(secimRegion2);
                        int HERO2 = sc.nextInt();
                        // Asignar al jugador heroe elegido para jugador 2 (crear)
                        if(secimRegion2 ==1) {
                            if(HERO2 == 1) {
                                jugador2 = new HeroeAtaque("Yasuo" , Region1 );
                            }else {
                                jugador2 = new HeroeDefensa("Lux" , Region1 );
                            }
                        }else {
                            if(HERO2 == 1) {
                                jugador2 = new HeroeAtaque("Katarina" , Region2 );
                            }else {
                                jugador2 = new HeroeDefensa("Darius" , Region2 );
                            }
                        }
                        // elegir region para heroe de jugador 3
                        
                        turno1.EligeRegion(nombreJugador3);
                        int secimRegion3 = sc.nextInt();
                        turno1.EligeHeroe(secimRegion3);
                        int HERO3 = sc.nextInt();
                        // Asignar al jugador heroe elegido para jugador 3 (crear)
                        if(secimRegion3 ==1) {
                            if(HERO3 == 1) {
                                jugador3 = new HeroeAtaque("Yasuo" , Region1 );
                            }else {
                                jugador3 = new HeroeDefensa("Lux" , Region1 );
                            }
                        }else {
                            if(HERO3 == 1) {
                                jugador3 = new HeroeAtaque("Katarina" , Region2 );
                            }else {
                                jugador3 = new HeroeDefensa("Darius" , Region2 );
                            }
                        }
                        // elegir region para heroe de jugador 4
                        
                        turno1.EligeRegion(nombreJugador4);
                        int secimRegion4 = sc.nextInt();
                        turno1.EligeHeroe(secimRegion4);
                        int HERO4 = sc.nextInt();
                        // Asignar al jugador heroe elegido para jugador 4 (crear)
                        if(secimRegion4 ==1) {
                            if(HERO4 == 1) {
                                jugador4 = new HeroeAtaque("Yasuo" , Region1 );
                            }else {
                                jugador4 = new HeroeDefensa("Lux" , Region1 );
                            }
                        }else {
                            if(HERO4 == 1) {
                                jugador4 = new HeroeAtaque("Katarina" , Region2 );
                            }else {
                                jugador4 = new HeroeDefensa("Darius" , Region2 );
                            }
                        }
                        turno1.mostrarHeroes(jugador1, jugador2, jugador3, jugador4, nombreJugador1, nombreJugador2, nombreJugador3, nombreJugador4);
                        // creamos mapas para cada jugador
                        Map mapjugador1 = new Map();
                        Map mapjugador2 = new Map();
                        Map mapjugador3 = new Map();
                        Map mapjugador4 = new Map();
                        //mostramos a cada jugador la mapa para que eligen
                        turno1.EligeMap(nombreJugador1);
                        //colocamos en map los heroes
                        int buscaEnMapjg1 = sc.nextInt();
                        mapjugador1.placePlayer(buscaEnMapjg1, jugador1.getVida());
                        turno1.spam();
                        turno1.spam();
						//mostramos a cada jugador la mapa para que eligen
                        turno1.EligeMap(nombreJugador2);
						//colocamos en map los heroes
                        int buscaEnMapjg2 = sc.nextInt();
                        mapjugador2.placePlayer(buscaEnMapjg2, jugador2.getVida());
                        turno1.spam();
                        turno1.spam();
						//mostramos a cada jugador la mapa para que eligen
                        turno1.EligeMap(nombreJugador3);
						//colocamos en map los heroes
                        int buscaEnMapjg3 = sc.nextInt();
                        mapjugador3.placePlayer(buscaEnMapjg3, jugador3.getVida());
                        turno1.spam();
                        turno1.spam();
						//mostramos a cada jugador la mapa para que eligen
                        turno1.EligeMap(nombreJugador4);
						//colocamos en map los heroes
                        int buscaEnMapjg4 = sc.nextInt();
                        mapjugador4.placePlayer(buscaEnMapjg4, jugador4.getVida());
                        turno1.spam();
                        turno1.spam();
                        turno1.start();
                        int accion = 0;
                        int TurnoDeJugar = 1;
                        do {
                            
                            
                            if(TurnoDeJugar == 1 ) {
                                System.out.println("Turno para : " + nombreJugador1);
                                turno1.turnoQ(nombreJugador1);
                                
                                
                                accion = sc.nextInt();
                                switch (accion) {
									// si queremos atacar
                                    case 1:
                                    {
                                        System.out.println("A quien quieres atacar " + nombreJugador1 + "?");
										//mostramos los posibles ataques (si enemigo no esta vivo no sera un opcion!)
                                        turno1.posiblesAtaces(nombreJugador3, nombreJugador4, jugador3, jugador4);
                                        int aQuien = sc.nextInt();
                                        System.out.println("A donde quiere atacar " + nombreJugador1 +  "?" );
                                        int dondeAtacar = sc.nextInt();
										// si queremos atacar a primer opcion
                                        if(aQuien == 1) { 
											//metodo ataque (lo que esta en clase turno)
                                            turno1.atack(nombreJugador1, jugador1, jugador3, dondeAtacar, buscaEnMapjg3, mapjugador3);
                                            // metodo de asignar turno a proxima jugador
                                            TurnoDeJugar = turno1.v111(jugador2, jugador3, jugador4, TurnoDeJugar);
                                            
                                            
                                            
                                            
                                            
                                          
                                        }   // si queremos atacar a segundo opcion     
										if(aQuien == 2) {
											//metodo ataque (lo que esta en clase turno)
                                            turno1.atack(nombreJugador1, jugador1, jugador4, dondeAtacar, buscaEnMapjg4, mapjugador4);
                                            
                                             // metodo de asignar turno a proxima jugador
                                            TurnoDeJugar = turno1.v111(jugador2, jugador3, jugador4, TurnoDeJugar);
                                        }
                                        break;
                                    }
									// si queremos curar
                                    case 2:
                                    {
                                        System.out.println("A quien quieres curar " + nombreJugador1 + "?") ;
                                        turno1.posiblesAtaces(" ti mismo ", nombreJugador2, jugador1, jugador2);
                                        int aQuien = sc.nextInt();
                                        if(aQuien == 1) {
                                            jugador1.curar(jugador1, jugador1);
                                            TurnoDeJugar = turno1.v111(jugador2, jugador3, jugador4, TurnoDeJugar);
                                        }else if(aQuien == 2) {
                                            jugador1.curar(jugador1, jugador2);
                                            TurnoDeJugar = turno1.v111(jugador2, jugador3, jugador4, TurnoDeJugar);
                                        }
                                        break;
                                    }
									// si queremos usar un pot
                                    case 3:
                                        if (jugador1.getPocion()>0) {
                                            System.out.println("Para que quieres usar la pocion ");
                                            System.out.println("Para mas poder! (1) ");
                                            System.out.println("Para mas armadura!  (2) ");
                                            int elegirPocion = sc.nextInt();
                                            jugador1.poscion(jugador1, elegirPocion);
                                            System.out.println(jugador1.toString());
                                            System.out.println("pociones disponibles : " + jugador1.getPocion());
                                            TurnoDeJugar = turno1.v111(jugador2, jugador3, jugador4, TurnoDeJugar);
                                            
                                            
                                        }else {
                                            System.out.println("");
                                            System.out.println("No me queda ningun pocion !");
                                            System.out.println("");
                                        }
                                        break;
									// si queremos mostrar el estado actual del heroe
                                    case 4:
                                        System.out.println(jugador1.toString());
                                        System.out.println("");
                                        break;
								    
                                    default:
                                        System.out.println("Opcion no existe!");
                                        break;
                                }
                            }
							// mismo bucle para jugador 2
                            if(TurnoDeJugar == 2) {
                                System.out.println("Turno para : " + nombreJugador2);
                                turno1.turnoQ(nombreJugador2);
                                accion = sc.nextInt();
                                switch (accion) {
                                    case 1:
                                    {
                                        System.out.println("A quien quieres atacar " + nombreJugador2 + "?");
                                        turno1.posiblesAtaces(nombreJugador3, nombreJugador4, jugador3, jugador4);
                                        int aQuien = sc.nextInt();
                                        System.out.println("A donde quiere atacar " + nombreJugador2 +  "?" );
                                        int dondeAtacar = sc.nextInt();
                                        if(aQuien == 1 ) {
                                            turno1.atack(nombreJugador2, jugador2, jugador3, dondeAtacar, buscaEnMapjg3, mapjugador3);
                                            
                                            TurnoDeJugar = turno1.v222(jugador3, jugador4, TurnoDeJugar);
                                            
                                            
                                        }
                                        if(aQuien == 2 ) {
                                            turno1.atack(nombreJugador2, jugador2, jugador4, dondeAtacar, buscaEnMapjg4, mapjugador4);
                                            
                                            TurnoDeJugar = turno1.v222(jugador3, jugador4, TurnoDeJugar);
                                        }
                                        break;
                                    }
                                    case 2:
                                    {
                                        System.out.println("A quien quieres curar " + nombreJugador2 + "?") ;
                                        turno1.posiblesAtaces(" ti mismo ", nombreJugador1, jugador2, jugador1);
                                        int aQuien = sc.nextInt();
                                        if(aQuien == 1) {
                                            jugador2.curar(jugador2, jugador2);
                                            TurnoDeJugar = turno1.v222(jugador3, jugador4, TurnoDeJugar);
                                            
                                        }else if(aQuien == 2) {
                                            jugador2.curar(jugador2, jugador1);
                                            TurnoDeJugar = turno1.v222(jugador3, jugador4, TurnoDeJugar);
                                        }
                                        break;
                                    }
                                    case 3:
                                        if (jugador2.getPocion()>0) {
                                            System.out.println("Para que quieres usar la pocion ");
                                            System.out.println("Para mas poder! (1) ");
                                            System.out.println("Para mas armadura!  (2) ");
                                            int elegirPocion = sc.nextInt();
                                            jugador2.poscion(jugador2, elegirPocion);
                                            System.out.println(jugador2.toString());
                                            System.out.println("pociones disponibles : " + jugador2.getPocion());
                                            TurnoDeJugar = turno1.v222(jugador3, jugador4, TurnoDeJugar);
                                            
                                        }else {
                                            System.out.println("");
                                            System.out.println("No me queda ningun pocion !");
                                            System.out.println("");
                                        }
                                        break;
                                    case 4:
                                        System.out.println(jugador2.toString());
                                        System.out.println("");
                                        break;
                                    default:
                                        System.out.println("Opcion no existe!");
                                        break; 
                                }
                                
                            }// mismo bucle para jugador 3  
							if(TurnoDeJugar == 3 ) {
                                System.out.println("Turno para : " + nombreJugador3);
                                turno1.turnoQ(nombreJugador3);
                                accion = sc.nextInt();
                                switch (accion) {
                                    case 1:
                                    {
                                        System.out.println("A quien quieres atacar " + nombreJugador3 + "?");
                                        turno1.posiblesAtaces(nombreJugador1, nombreJugador2, jugador1, jugador2);
                                        int aQuien = sc.nextInt();
                                        System.out.println("A donde quiere atacar " + nombreJugador3 +  "?" );
                                        int dondeAtacar = sc.nextInt();
                                        if(aQuien == 1) {
                                            turno1.atack( nombreJugador3,jugador3, jugador1, dondeAtacar, buscaEnMapjg1, mapjugador1);
                                            
                                            
                                            
                                            TurnoDeJugar = 	turno1.v333(jugador4, jugador1, jugador2, TurnoDeJugar);
                                            
                                        }
                                        if(aQuien == 2) {
                                            turno1.atack( nombreJugador3, jugador3, jugador2, dondeAtacar, buscaEnMapjg2, mapjugador2);
                                            
                                            TurnoDeJugar = 	turno1.v333(jugador4, jugador1, jugador2, TurnoDeJugar);
                                        }
                                        break;
                                    }
                                    case 2:
                                    {
                                        System.out.println("A quien quieres curar " + nombreJugador3 + "?") ;
                                        turno1.posiblesAtaces(" ti mismo ", nombreJugador4, jugador4, jugador3);
                                        int aQuien = sc.nextInt();
                                        if(aQuien == 1) {
                                            jugador3.curar(jugador3, jugador3);
                                            TurnoDeJugar = 	turno1.v333(jugador4, jugador1, jugador2, TurnoDeJugar);
                                            
                                        }else if(aQuien == 2) {
                                            jugador3.curar(jugador3, jugador4);
                                            TurnoDeJugar = 	turno1.v333(jugador4, jugador1, jugador2, TurnoDeJugar);
                                        }
                                        break;
                                    }
                                    case 3:
                                        if (jugador3.getPocion()>0) {
                                            System.out.println("Para que quieres usar la pocion ");
                                            System.out.println("Para mas poder! (1) ");
                                            System.out.println("Para mas armadura!  (2) ");
                                            int elegirPocion = sc.nextInt();
                                            jugador3.poscion(jugador3, elegirPocion);
                                            System.out.println(jugador3.toString());
                                            System.out.println("pociones disponibles : " + jugador3.getPocion());
                                            TurnoDeJugar = 	turno1.v333(jugador4, jugador1, jugador2, TurnoDeJugar);
                                        }else {
                                            System.out.println("");
                                            System.out.println("No me queda ningun pocion !");
                                            System.out.println("");
                                        }
                                        break;
                                    case 4:
                                        System.out.println(jugador3.toString());
                                        break;
                                    default:
                                        System.out.println("Opcion no existe!");
                                        System.out.println("");
                                        break;
                                }
                            }// mismo bucle para jugador 4	 
						     if((TurnoDeJugar == 4) ) {
                                System.out.println("Turno para : " + nombreJugador4);
                                turno1.turnoQ(nombreJugador4);
                                accion = sc.nextInt();
                                switch (accion) {
                                    case 1:
                                    {
                                        System.out.println("A quien quieres atacar " + nombreJugador4 + "?");
                                        turno1.posiblesAtaces(nombreJugador1, nombreJugador2, jugador1, jugador2);
                                        int aQuien = sc.nextInt();
                                        System.out.println("A donde quiere atacar " + nombreJugador4 +  "?" );
                                        int dondeAtacar = sc.nextInt();
                                        if(aQuien == 1) {
                                            turno1.atack(nombreJugador4 , jugador4, jugador1, dondeAtacar, buscaEnMapjg1, mapjugador1);
                                            TurnoDeJugar = turno1.v444(jugador1, jugador2, TurnoDeJugar);
                                            
                                        }
                                        if(aQuien == 2) {
                                            turno1.atack( nombreJugador4 , jugador4, jugador2, dondeAtacar, buscaEnMapjg2, mapjugador2);
                                            //
                                            TurnoDeJugar = turno1.v444(jugador1, jugador2, TurnoDeJugar);
                                        }
                                        break;
                                    }
                                    case 2:
                                    {
                                        System.out.println("A quien quieres curar " + nombreJugador4 + "?") ;
                                        turno1.posiblesAtaces(" ti mismo ", nombreJugador3, jugador3, jugador4);
                                        int aQuien = sc.nextInt();
                                        if(aQuien == 1) {
                                            jugador4.curar(jugador4, jugador4);
                                            TurnoDeJugar = turno1.v444(jugador1, jugador2, TurnoDeJugar);
                                            
                                        }else if(aQuien == 2) {
                                            jugador4.curar(jugador4, jugador3);
                                            TurnoDeJugar = turno1.v444(jugador1, jugador2, TurnoDeJugar);
                                        }
                                        break;
                                    }
                                    case 3:
                                        if (jugador3.getPocion()>0) {
                                            System.out.println("Para que quieres usar la pocion ");
                                            System.out.println("Para mas poder! (1) ");
                                            System.out.println("Para mas armadura!  (2)");
                                            int elegirPocion = sc.nextInt();
                                            jugador4.poscion(jugador4, elegirPocion);
                                            System.out.println("Pocion usado correctamente");
                                            System.out.println(jugador4.toString());
                                            System.out.println("pociones disponibles : " + jugador4.getPocion());
                                            TurnoDeJugar = turno1.v444(jugador1, jugador2, TurnoDeJugar);
                                        }else {
                                            System.out.println("");
                                            System.out.println("No me queda ningun pocion !");
                                            System.out.println("");
                                        }
                                        break;
                                    case 4:
                                        System.out.println(jugador4.toString());
                                        break;
                                    default:
                                        System.out.println("Opcion no existe!");
                                        System.out.println("");
                                        break;
                                }
                                
                            }}// no salimos mientras !Turno=0 , si ya un equipo no tiene enemigo vivo turno sera 0
							while(!(TurnoDeJugar == 0));
					    //mostrar el ganador
                        if(jugador1.getVida()+jugador2.getVida()> jugador3.getVida() + jugador4.getVida()) {
                            System.out.println("HA GANDO EL EQUIPO 1");
                            turno1.winner();
                        }else {
                            System.out.println("HA GANADO EL EQUIPO 2");
                            turno1.winner();
                        }
                    // mostrar informacion/Manual de juego    
                    case 2:
                        System.out.println("Area de informacion: ");
                        turno1.info();
                        System.out.println("");
                        System.out.println("Empezar (1)");
                        System.out.println("Manual de Juego (2)");
                        System.out.println("Salir (3) ");
                        ilk = sc.nextInt();
                        break;
					// Salir del juego
                    case 3:
                        System.out.println("Saliendo de la programa... ");
                        System.out.println("     _       _ _           \r\n"
                                + "    / \\   __| (_) ___  ___ \r\n"
                                + "   / _ \\ / _` | |/ _ \\/ __|\r\n"
                                + "  / ___ \\ (_| | | (_) \\__ \\\r\n"
                                + " /_/   \\_\\__,_|_|\\___/|___/\r\n"
                                + "                           ");
                        break;
                    default:
                        System.out.println("Opcion no existe!");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Empezar (1)");
                        System.out.println("Manual de Juego (2)");
                        System.out.println("Salir (3) ");
                        ilk = sc.nextInt();
                        break;
                }
				//quedamos dentro de menu mientras usuario no quiere salir
            } while (!(ilk ==3));
		  
	}
	}
					
					
					






