package TFP;
// creamos un clase lonia que extiende de region
public class Ionia extends Region {
    public Ionia() {
        super("Ionia");
    }

    // asignamos los bonuses que va añadir a los que vienen por defecto a cada heroe
    @Override
    public int bonusVida() {
        return 100;
    }

    @Override
    public int bonusAtaque() {
        return 50;
    }

    @Override
    public int bonusDefensa() {
        return 25;
    }
}