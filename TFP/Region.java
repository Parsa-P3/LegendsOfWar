package TFP;
// clase abstracra que sera extendida por clases Ionia y Noxus
public abstract class Region {
    protected String nombre;

    public Region(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // metodos abstractos
    public abstract int bonusVida();
    public abstract int bonusAtaque();
    public abstract int bonusDefensa();
   
}