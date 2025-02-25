package TFP;
//clase utilizando para evitar codigos y textos duplicados y manejar bien el orden del turno
public class turno {
	Map mapa;
	Region region;
	Personaje personaje;
	protected Personaje jugador1;
	protected Personaje jugador2;
	
	// HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
	//cons de turno
	public turno(Personaje jugador1, Personaje jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	
	
	//menu opciones de juego 
	public void turnoQ(String  z ) {
		System.out.println("Elige uno de los opciones " + z +" :");
		
         	System.out.println("Atacar (1)");
         	System.out.println("Curar (2)");
         	System.out.println("Usa pocion de efecto(3)");
			System.out.println("Mostrar tu heroe (4)");
         
         
		
	}
	
	//metodo para mostrar regiones
	public void EligeRegion(String x ){
	     System.out.println("");
	        System.out.println("");
		System.out.println("  ____            _                 \r\n"
				+ " |  _ \\ ___  __ _(_) ___  _ __  ___ \r\n"
				+ " | |_) / _ \\/ _` | |/ _ \\| '_ \\/ __|\r\n"
				+ " |  _ <  __/ (_| | | (_) | | | \\__ \\\r\n"
				+ " |_| \\_\\___|\\__, |_|\\___/|_| |_|___/\r\n"
				+ "            |___/                   ");
		System.out.println("___________________________________________");
        
        System.out.println("Elige Region para heroe de  " + x + " :");
        System.out.println("");
        System.out.println("º 🥷 🥷 🥷 🥷 🥷 🥷 🥷  🥷 🥷 🥷 🥷 🥷 🥷 🥷 º");
        System.out.println("1 - Ionia (HP +100, DAMAGE +50, ARMOR +25) ");
        System.out.println("2 - Noxus (HP +50, DAMAGE +100, ARMOR +25) ");
        System.out.println("___________________________________________");
        
		
    }
	// mostrar confirmacion de heroes
	public void mostrarHeroes(Personaje a ,Personaje b ,Personaje c ,Personaje d , String aa ,  String bb,  String cc,  String dd ) {
		  System.out.println("");
		  System.out.println("___________________________________________");
	      System.out.println(a.toString()+  ". (para " + aa +")");
	      System.out.println(b.toString()+ ".  (para " + bb +")");
	      System.out.println(c.toString()+ ".  (para " + cc +")");
	      System.out.println(d.toString()+ ".  (para " + dd +")");
	      System.out.println("___________________________________________");
		  System.out.println("");
	}
	
	// metodo mostrar heroes
	public void EligeHeroe(int RegionElegido) {
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("  _   _                \r\n"
        		+ " | | | | ___ _ __ ___  \r\n"
        		+ " | |_| |/ _ \\ '__/ _ \\ \r\n"
        		+ " |  _  |  __/ | | (_) |\r\n"
        		+ " |_| |_|\\___|_|  \\___/ \r\n"
        		+ "                       ");
        System.out.println("___________________________________________");

        System.out.println("");
        System.out.println("");
    if(RegionElegido == 1) {
          System.out.println("ºElige el tipo de heroe :");
          System.out.println();
          System.out.println("⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️");
          System.out.println("1 - Yasuo (1000 HP - 100 DAMAGE - 25 ARMOR)");
          System.out.println("");
          System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹");
          System.out.println("2 - Lux (1000 HP - 25 DAMAGE - 100 ARMOR)");

	}else if (RegionElegido == 2) {
        System.out.println("ºElige el tipo de heroe :");
        System.out.println("");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("1 - Katarina (500 HP - 100 DAMAGE - 25 ARMOR)");
        System.out.println("");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("2 - Darius (500 HP - 25 DAMAGE - 100 ARMOR)");
	}
	}
	
	// metodo mostrar la mapa para cada jugador
	public void EligeMap(String Personaje) {
		System.out.println("");
          System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
          System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
          System.out.println("");
          System.out.println("🛡️ 🗡️ ⚒️ 🛡️ Aqui puedes elegir en que posicion colocar tu heroe "+ Personaje+ "! 🛡️ 🗡️ ⚒️ 🛡️ 🗡️ ⚒️");
          System.out.println("");
          System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ ");
          System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
          
          System.out.println("º___________________________________º");
          System.out.println("|         |               |         |");
          System.out.println("|    1    |       2       |    3    |");
          System.out.println("|_________|_______________|_________|");
          System.out.println("|         |               |         |");
          System.out.println("|    4    |       5       |    6    |");
          System.out.println("|_________|_______________|_________|");
          System.out.println("|         |               |         |");
          System.out.println("|    7    |       8       |    9    |");
          System.out.println("|_________|_______________|_________|");
	}
	
	// metodo spam para ocultar textos o pasos anteriores
	public void spam() {
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
	}
	
	// metodo ASCII para empezar
	public void start() {
		System.out.println(" (                     (            \r\n"
				+ " )\\ )  *   )    (      )\\ )  *   )  \r\n"
				+ "(()/(` )  /(    )\\    (()/(` )  /(  \r\n"
				+ " /(_))( )(_))((((_)(   /(_))( )(_)) \r\n"
				+ "(_)) (_(_())  )\\ _ )\\ (_)) (_(_())  \r\n"
				+ "/ __||_   _|  (_)_\\(_)| _ \\|_   _|  \r\n"
				+ "\\__ \\  | |     / _ \\  |   /  | |    \r\n"
				+ "|___/  |_|    /_/ \\_\\ |_|_\\  |_|    \r\n"
				+ "                                    ");
	}
	// metodo ASCII para ganador
	public void winner() {
		System.out.println("           (        )     )       (     \r\n"
				+ " (  (      )\\ )  ( /(  ( /(       )\\ )  \r\n"
				+ " )\\))(   '(()/(  )\\()) )\\()) (   (()/(  \r\n"
				+ "((_)()\\ )  /(_))((_)\\ ((_)\\  )\\   /(_)) \r\n"
				+ "_(())\\_)()(_))   _((_) _((_)((_) (_))   \r\n"
				+ "\\ \\((_)/ /|_ _| | \\| || \\| || __|| _ \\  \r\n"
				+ " \\ \\/\\/ /  | |  | .` || .` || _| |   /  \r\n"
				+ "  \\_/\\_/  |___| |_|\\_||_|\\_||___||_|_\\  \r\n"
				+ "                                        ");
	}
	
	// metodo de atacar y aplicacion de sus efectos
	public void atack(String nombreJugadorAt , Personaje atacante , Personaje RecibirAtace , int dondeatacar , int mapa2 , Map mapa ) {

		if(dondeatacar == mapa2) {
			// aunque lo marca correctamente en mapa si el heroe en dicha posicion no esta vivo 
			// mostrara que no hay nadie aqui!
			if(RecibirAtace.getVida()<1) {
				System.out.println("    ______    _______    ________  \r\n"
						+ "   /    \" \\  |   __ \"\\  /\"       ) \r\n"
						+ "  // ____  \\ (. |__) :)(:   \\___/  \r\n"
						+ " /  /    ) :)|:  ____/  \\___  \\    \r\n"
						+ "(: (____/ // (|  /       __/  \\\\   \r\n"
						+ " \\        / /|__/ \\     /\" \\   :)  \r\n"
						+ "  \\\"_____/ (_______)   (_______/   \r\n"
						+ "                                   ");
				System.out.println("En esta posicion no hay nadie !!");
				System.out.println("");
			}else {
				// metodo de aplicacion de ataque con sus efectos
				System.out.println("");
			System.out.println("");
			   System.out.println(" (        )   (      (        )   (      (        )   (     \r\n"
				   		+ " )\\ )  ( /(   )\\ )   )\\ )  ( /(   )\\ )   )\\ )  ( /(   )\\ )  \r\n"
				   		+ "(()/(  )\\()) (()/(  (()/(  )\\()) (()/(  (()/(  )\\()) (()/(  \r\n"
				   		+ " /(_))((_)\\   /(_))  /(_))((_)\\   /(_))  /(_))((_)\\   /(_)) \r\n"
				   		+ "(_))    ((_) (_))   (_))    ((_) (_))   (_))    ((_) (_))   \r\n"
				   		+ "/ __|  / _ \\ / __|  / __|  / _ \\ / __|  / __|  / _ \\ / __|  \r\n"
				   		+ "\\__ \\ | (_) |\\__ \\  \\__ \\ | (_) |\\__ \\  \\__ \\ | (_) |\\__ \\  \r\n"
				   		+ "|___/  \\___/ |___/  |___/  \\___/ |___/  |___/  \\___/ |___/  \r\n"
				   		+ "                                                            ");
			   atacante.atacar();
			   
		
			//para poder localizar en mapa el jugador tenemos que obtener la vida antes de que recibe el ataque	
			int anteAtaque = RecibirAtace.getVida();
			RecibirAtace.defender(atacante.ataque);
			int vidaActual = RecibirAtace.getVida();
	
			//colocamos el heroe otra vez en mapa sin cambiar su posicion pero con su vida nueva
			mapa.placePlayer(anteAtaque,vidaActual);
			
	           System.out.println("Daño realizado :");
	           System.out.println("---> " + ( RecibirAtace.defensa - atacante.ataque));
	           System.out.println("Daño bloqueado : ");
	           System.out.println("---> " + ( RecibirAtace.defensa ));
	           System.out.println("");
	           System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
	           System.out.println("🏹 🧙   FIN DEL TURNO PARA "+ nombreJugadorAt+"! 🏹 🧙");
	           System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
	           System.out.println("");
	           System.out.println("");}
		}else {
			// si en dicha posicion no hay ningun heroe :
			System.out.println("    ______    _______    ________  \r\n"
					+ "   /    \" \\  |   __ \"\\  /\"       ) \r\n"
					+ "  // ____  \\ (. |__) :)(:   \\___/  \r\n"
					+ " /  /    ) :)|:  ____/  \\___  \\    \r\n"
					+ "(: (____/ // (|  /       __/  \\\\   \r\n"
					+ " \\        / /|__/ \\     /\" \\   :)  \r\n"
					+ "  \\\"_____/ (_______)   (_______/   \r\n"
					+ "                                   ");
			System.out.println("En esta posicion no hay nadie !!");
		}
	}

	// menu de posibles ataques para verificar si el enemigo vive antes que atacar!
	public void posiblesAtaces(String p1 , String p2 , Personaje Personaje1 , Personaje Personaje2) {
		if(Personaje1.getVida()>0) {
		System.out.println("A " + p1 + " (1)");}
		if(Personaje2.getVida()>0) {
		System.out.println("A " + p2 + " (2)");}

	
	}


	// para pasar el turno uno a otro jugador mientras enemigo esta vivo (!turno=0) y que va con el orden (1->2->3->4)
	public int v111(Personaje primer , Personaje seg , Personaje terc , int turno) {
		if(primer.getVida()>0){
			turno = 2;
		}else if(seg.getVida()>0) {
			turno = 3;
		}else if(terc.getVida()>0) {
			turno = 4;
		}else{
			turno = 0;
		}return turno;
	}
	public int v222(Personaje primer , Personaje seg , int turno) {
		if(primer.getVida()>0) {
			turno = 3;
		}else if(seg.getVida()>0) {
			turno = 4;
		}else {
			turno = 0;
		}return turno;
	}
	public int v333(Personaje primer , Personaje seg , Personaje terc , int turno) {
		if(primer.getVida()>0){
			turno = 4;
		}else if(seg.getVida()>0) {
			turno = 1;
		}else if(terc.getVida()>0) {
			turno = 2;
		}else{
			turno = 0;
		}return turno;
	}
	public int v444(Personaje primer , Personaje seg , int turno) {
		if(primer.getVida()>0) {
			turno = 1;
		}else if(seg.getVida()>0) {
			turno = 2;
		}else {
			turno = 0;
		}return turno;
	}
	public void info(){
		System.out.println("º------------------------------------------------------------- Reglas del Juego -------------------------------------------------------------º");
		System.out.println("|                                                                                                                                            |");
		System.out.println("| 1. Objetivo del Juego: El objetivo del juego es derrotar al equipo contrario utilizando estrategias de ataque, defensa ( curación ).       |");
		System.out.println("| El equipo que elimine a todos los oponentes primero, gana la partida.                                                                      |");
		System.out.println("| El juego se puede jugar de diferentes maneras dependiendo de los objetivos de los jugadores. Las tácticas son importantes!                 |");
		System.out.println("|                                                                                                                                            |");
		System.out.println("| 2. Jugadores y Equipos:                                                                                                                    |");
		System.out.println("| El juego es para 4 jugadores.                                                                                                              |");
		System.out.println("| Se forman dos equipos de 2 jugadores cada uno.(1. 2. En mismo y 3.4. Jugador en mismo equipo )                                             |");
		System.out.println("| Los jugadores eligen una región (Ionia o Noxus) y un héroe con habilidades específicas.                                                    |");
		System.out.println("|                                                                                                                                            |");
		System.out.println("| 3. Regiones y Bonificaciones:                                                                                                              |");
		System.out.println("| Ionia: +100 Vida , +50 DAÑO, +25 ARMADURA.                                                                                                 |");
		System.out.println("| Noxus: +50 Vida , +100 DAÑO, +25 ARMADURA.                                                                                                 |");
		System.out.println("|                                                                                                                                            |");
		System.out.println("| 4. Tipos de Héroes:                                                                                                                        |");
		System.out.println("| Héroe de Ataque: Alto daño, baja defensa. No puede curar. Por defecto viene con valores : 1000 Vida - 200 Daño - 25 Defensa - 3 Pociones   |");
		System.out.println("| Héroe de Defensa: Baja ataque, alta defensa. Puede curar . Por defecto viene con valores : 1000 Vida - 100 Daño - 50 Defensa - 3 Pociones  |");
		System.out.println("|                                                                                                                                            |");
		System.out.println("| 5. Turnos y Acciones:                                                                                                                      |");
		System.out.println("| Atacar: Inflige daño a un enemigo dentro del mapa.                                                                                         |");
		System.out.println("| Curar: Si el jugador es un Héroe de Defensa, puede curar a un aliado.                                                                      |");
		System.out.println("| Usar Pociones: Aumenta temporalmente ataque o defensa.                                                                                     |");
		System.out.println("| Ver Estado del Héroe: Muestra estadísticas del personaje.                                                                                  |");
		System.out.println("|                                                                                                                                            |");
		System.out.println("| 6. Mapa y Posicionamiento:                                                                                                                 |");
		System.out.println("| El mapa es una cuadrícula de 3x3.                                                                                                          |");
		System.out.println("| Cada jugador coloca a su héroe en una posición al inicio del juego.                                                                        |");
		System.out.println("| Los mapas son individual para cada heroe                                                                                                   |");
		System.out.println("| El ataque sólo es efectivo si el enemigo está en la posición atacad                                                                        |");
		System.out.println("| Opción 4 no acabara el turno                                                                                                               |");
		System.out.println("| Si el jugador tiene Heroe de ataque pero intenta a curar , su turno acabará !                                                              |");
		System.out.println("|                                                                                                                                            |");
		System.out.println("| 7. Valores de cada acción:                                                                                                                 |");
		System.out.println("| Daño realizado: será el daño que tiene el atacante menos el armadura del héroe que va recibir el ataque.                                   |");
		System.out.println("| Pocion :                                                                                                                                   |");
		System.out.println("|     Si lo usa un héroe de ataque tendrá los valores : 100+ Ataque o 50+ Armadura                                                           |");
		System.out.println("|     Si lo usa un heroe de defensa tendrá los valores : 50+Ataque o 100+ Armadura                                                           |");
		System.out.println("| Curación : Los héroes de defensa siempre pueden curarse y la cura tendrá el mismo valor de su armadura .                                   |");
		System.out.println("|     ej: hero1 es de defensa y tiene 30 armadura , cuando cura curara 30+                                                                   |");
		System.out.println("|                                                                                                                                            |");
		System.out.println("| 8. Fin del Juego:                                                                                                                          |");
		System.out.println("| Un equipo gana cuando los dos jugadores del equipo contrario han sido derrotados.                                                          |");
		System.out.println("| Si un equipo pierde a un jugador, el otro puede seguir luchando hasta que caiga o gane la partida.                                         |");
		System.out.println("|                                                                                                                                            |");
		System.out.println("|____________________________________________________________________________________________________________________________________________|");
	}
	
	

	
	
}
