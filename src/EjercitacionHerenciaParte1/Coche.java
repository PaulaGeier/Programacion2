package EjercitacionHerenciaParte1;

public class Coche extends Vehiculo{

    private float velocidad;
    private float cilindrada;

    public Coche(String color, int ruedas, float velocidad, float cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

}
