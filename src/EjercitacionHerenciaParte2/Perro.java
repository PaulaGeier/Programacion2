package EjercitacionHerenciaParte2;

public class Perro extends Animal {
    private String raza;
    private String pelaje;

    public Perro() {
    }

    public Perro(String raza, String pelaje) {
        this.raza = raza;
        this.pelaje = pelaje;
    }

    public Perro(String nombre, int edad, String genero, String raza, String pelaje) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public void hacer_ruido() {
        System.out.println("El animal hace un ruido generico");
        System.out.println("El perro ladra");
    }

    @Override
    public void informacion() {
        System.out.println("Soy "+this.getNombre()+", tengo "+this.getEdad()+" años, soy "+this.getGenero()+". Sor de raza "+this.getRaza()+" y tengo pelaje "+ this.getPelaje());

    }
}
