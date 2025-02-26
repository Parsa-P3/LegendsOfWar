package TFP;

public class HeroeAtaque extends Personaje{

    public HeroeAtaque(String nombreHeroe, Region region) {
        super(nombreHeroe, 1000, 2000, 25,3, region);
    }

    //metodo diyalogo para atacar ( heroes de ataque)
  //aplicacion de atacar y sus efectos esta en turno
    @Override
    public void atacar() {
        
    	// uso de random para cambiar el dialogo siempre (casi siempre!hay que tener mas opciones)
        int random = (int)(Math.random()*3)+1;
        if(random == 1) {
        	System.out.println(nombreHeroe + ": Ahora sentiras mi verdadero poder ! ");
        }else if(random == 2) {
        	System.out.println(nombreHeroe + ": No tienes escapatoria , esto terminara aqui!! ");
        }else if(random ==3) {
        	System.out.println(nombreHeroe + ": cada golpe mio te acercara mas a la derrota!! ");
        }
    }

  //metodo defender para heroes de ataque
  // el daño que recibira sera = daño - armadura
    @Override
    public int defender(int dano) {
        int recibido = dano - defensa;
        if (recibido > 0) {
            vida -= recibido;
            int random = (int)(Math.random()*3)+1;
            if(random == 1) {
	        System.out.println(nombreHeroe + ": Me han golpeado!! pero ahora les hare pagarrr. Vida actual:"+vida );
	        }else if(random == 2) {
	        System.out.println(nombreHeroe + ": Eso dolio... ! Vida actual: "+vida );
	        }else if(random == 3) {
	        System.out.println(nombreHeroe + ": ¡No importa el daño , seguire luchando hasta el final !. Vida actual:"+vida );
	        }
            }return vida;
    }

    // metodo curar (no disponible en este version para atacantes!) 
	@Override
	public int curar(Personaje Personaje1 , Personaje Personaje2) {
		System.out.println("esta habilidad no esta disponible para heroes de ataque por el momento!");
		return 0;
	}

	//metodo para uso de posciones
	@Override
	public int poscion(Personaje x, int y) {
		if(y == 1) {
			x.pocion -= 1;
			int ataqueActualizado = (x.ataque += 100);
			x.ataque = ataqueActualizado;
			System.out.println("+100 Ataque para " +x.getNombre());
			return ataque;
			
		}else if(y == 2) {
			x.pocion -=1;
			int defensaActualizada= ( x.defensa += 50);
			x.defensa = defensaActualizada;
			System.out.println("+50 Armadura para " +x.getNombre());
			return defensa;
		}return ataque ;
	}
	
	

	
	
    
}
