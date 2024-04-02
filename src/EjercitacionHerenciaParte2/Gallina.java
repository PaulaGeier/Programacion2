package EjercitacionHerenciaParte2;

public class Gallina extends Animal {
    private boolean poneHuevos;
    private int pollitos;

    public Gallina() {
    }

    public Gallina(boolean poneHuevos, int pollitos) {
        this.poneHuevos = poneHuevos;
        this.pollitos = pollitos;
    }

    public Gallina(String nombre, int edad, String genero, boolean poneHuevos, int pollitos) {
        super(nombre, edad, genero);
        this.poneHuevos = poneHuevos;
        this.pollitos = pollitos;
    }

    public boolean isPoneHuevos() {
        return poneHuevos;
    }

    public void setPoneHuevos(boolean poneHuevos) {
        this.poneHuevos = poneHuevos;
    }

    public int getPollitos() {
        return pollitos;
    }

    public void setPollitos(int pollitos) {
        this.pollitos = pollitos;
    }

    @Override
    public void hacer_ruido() {
        System.out.println("El animal hace un ruido generico");
        System.out.println("La gallina cacarea");
    }

    @Override
    public void informacion() {
        System.out.println("Soy "+this.getNombre()+", tengo "+this.getEdad()+" años, soy "+this.getGenero());
        if(poneHuevos){
            System.out.println("Pongo huevos");
        }
        if (pollitos>0){
            System.out.println("Tengo "+this.getPollitos()+" pollitos");
        }
    }
}
