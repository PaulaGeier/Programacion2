package EjercitacionHerenciaParte1;

public class Motocicleta extends Bicicleta{
    private float velocidad;
    private float cilindrada;

    public Motocicleta(String color, int ruedas, String tipo, float velocidad, float cilindrada) {
        super(color, ruedas, tipo);
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
