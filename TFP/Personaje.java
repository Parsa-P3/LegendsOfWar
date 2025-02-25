package TFP;
// clase abstracto de Personaje que sera extendida por HeroeAtaque y HeroeDefensa
public abstract class Personaje {
    protected String nombreHeroe;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected int pocion;
    protected Region region;

    public Personaje( String nombre, int vida, int ataque, int defensa,int pocion , Region region) {
   
        this.nombreHeroe = nombre;
        this.pocion = pocion;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.region = region;
        //aplicamos los bonuses de region a la hora de crear un personaje
        aplicarBonusRegion();

    }
    
    // metodo para aplicar los bonus
    private void aplicarBonusRegion() {
        this.vida += region.bonusVida();
        this.ataque += region.bonusAtaque();
        this.defensa += region.bonusDefensa();
    }

    public void setVida(int ataque) {
		this.vida = vida - ataque;
		   if((this.vida) < 0) {
			   this.vida=0;
		   }
	}

    //metodos abstractos de Personaje
	public abstract void atacar();
    public abstract int defender(int dano);
    public abstract int curar(Personaje Personaje1 , Personaje Personaje2);
    public abstract int poscion(Personaje Personaje  , int x);

    //boolean para checkear si esta vivo
    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNombre() {
        return nombreHeroe;
    }

 
	public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return nombreHeroe + " con "+ vida + " HP , Ataque: " + ataque + ", Defensa: " + defensa  +  ". Su region : " + region.getNombre();
    }

	public int getDefensa() {
		return defensa;
	}

	public int getPocion() {
		return pocion;
	}

	public void setPocion(int pocion) {
		this.pocion = pocion;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	
    


	
}
