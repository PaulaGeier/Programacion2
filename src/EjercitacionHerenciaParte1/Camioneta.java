package EjercitacionHerenciaParte1;

public class Camioneta extends Coche {
    private float carga;

    public Camioneta(String color, int ruedas, float velocidad, float cilindrada, float carga) {
        super(color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }
}
