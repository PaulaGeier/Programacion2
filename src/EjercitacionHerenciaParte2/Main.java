package EjercitacionHerenciaParte2;

public class Main {
    public static void main(String[] args) {
          Gallina g1=new Gallina("gallina",3,"hembra",true, 4);
          Perro p1=new Perro("perro",5,"macho","caniche","blanco");
          Vaca v1=new Vaca("vaca",5,"hembra",true,3);

          g1.hacer_ruido();
          g1.informacion();

          p1.hacer_ruido();
          p1.informacion();

          v1.hacer_ruido();
          v1.informacion();
    }
}
