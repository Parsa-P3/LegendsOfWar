package TFP;

public class HeroeDefensa extends Personaje {
    
	//cons para herodef
    public HeroeDefensa(String nombreHeroe, Region region) {
        super(nombreHeroe, 1000, 100 , 50,3 , region);
    }



    //metodo diyalogo para atacar ( heroes de deff)
    //aplicacion de atacar y sus efectos esta en turno
    @Override
    public void atacar() {
        System.out.println("¡Eso fue casi un saludo! Ahora preparate para el adios ahahah...");
    }

    //metodo defender para heroes de deff
	// el daño que recibira sera = daño - armadura
    @Override
    public int defender(int dano) {
        int recibido = dano - defensa;
        if (recibido > 0) {
            vida -= recibido;
        }
        // uso de random para cambiar el dialogo siempre (casi siempre!hay que tener mas opciones)
        int random = (int)(Math.random()*3)+1;
        if(random == 1) {
        System.out.println(nombreHeroe + ": ¡No se preocupen , Aun puedo recibir mas ahahaha ! Vida actual de " + nombreHeroe + " : " + vida );
        }else if(random == 2) {
        System.out.println(nombreHeroe + ": ¡Resistan! Recibi el golpe , pero sigo en pie para patria! Vida actual de " + nombreHeroe + " : " + vida);
        }else 
        System.out.println(nombreHeroe + ": ¡Aguanta! Nos estan golpeando duro pero aun nos estoy protegendo! Vida actual:"+vida);
        return vida;
    }


    //metodo curar para heroes de deff
	@Override
	public int curar(Personaje Personaje1 , Personaje Personaje2){
		if(Personaje2.getVida()>2000) {
			System.out.println("Hay que esperar , ahora no puedo curar !!");
		}else {
        int random = (int)(Math.random()*3)+1;
        if(random == 1) {
        	System.out.println(nombreHeroe + ": ¡Aguanta la sanacion comienza ahora! ");
        }else if(random == 2) {
        	System.out.println(nombreHeroe + ": ¡La vitalidad se renueva , la recuperacion es inminente! ");
        }else if(random ==3) {
        	System.out.println(nombreHeroe + ": ¡El poder curativo se activa , la fuerza se restablece! ");
        }
		System.out.println("");
		System.out.println("Currando " + Personaje2.nombreHeroe +  ". Vida actual :" +Personaje2.getVida());
		System.out.println("+" + Personaje1.getDefensa());
		int heal = Personaje2.getVida() + Personaje1.getDefensa();
		Personaje2.vida = heal;
		System.out.println("Vida actualizada :" + Personaje2.getVida());
		System.out.println("");}
		return Personaje2.vida;
		
	}



	//metodo para uso de posciones
	@Override
	public int poscion(Personaje x, int y) {
		if(y == 1) {
			x.pocion -= 1;
			int ataqueActualizado = (x.ataque += 25);
			x.ataque = ataqueActualizado;
			System.out.println("+50 Ataque para " +x.getNombre());
			return ataque;
			
		}else if(y == 2) {
			x.pocion -=1;
			int defensaActualizada= ( x.defensa += 50);
			x.defensa = defensaActualizada;
			System.out.println("+100 Armadura para " +x.getNombre());
			return defensa;
		}return ataque ;
	}
}
