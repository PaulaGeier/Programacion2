package EjercitacionHerenciaParte2;

public class Vaca extends Animal {
     private boolean lechera;
     private int terneros;

    public Vaca() {
    }

    public Vaca(boolean lechera, int terneros) {
        this.lechera = lechera;
        this.terneros = terneros;
    }

    public Vaca(String nombre, int edad, String genero, boolean lechera, int terneros) {
        super(nombre, edad, genero);
        this.lechera = lechera;
        this.terneros = terneros;
    }

    public boolean isLechera() {
        return lechera;
    }

    public void setLechera(boolean lechera) {
        this.lechera = lechera;
    }

    public int getTerneros() {
        return terneros;
    }

    public void setTerneros(int terneros) {
        this.terneros = terneros;
    }

    @Override
    public void hacer_ruido() {
        System.out.println("El animal hace un ruido generico");
        System.out.println("La vaca muge");
    }

    @Override
    public void informacion() {
        System.out.println("Soy "+this.getNombre()+", tengo "+this.getEdad()+" años, soy "+this.getGenero());
        if (lechera){
            System.out.println("Soy una vaca lechera");
        }
        if(terneros>0){
            System.out.println("He tenido "+this.getTerneros()+ " terneros");
        }
    }
}
