package TFP;
//creamos un clase Noxus que extiende de region
public class Noxus extends Region {
    public Noxus() {
        super("Noxus");
    }
 // asignamos los bonuses que va añadir a los que vienen por defecto a cada heroe
    @Override
    public int bonusVida() {
        return 50;
    }

    @Override
    public int bonusAtaque() {
        return 100;
    }

    @Override
    public int bonusDefensa() {
        return 25;
    }
}