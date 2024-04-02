package EjercitacionHerenciaParte1;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList vehiculo=new ArrayList<>();
        Coche c=new Coche("rojo",4,200,1500);
        Bicicleta b=new Bicicleta("verde",2,"deportiva");
        Motocicleta m=new Motocicleta("azul",2,"urbana",200,200);
        Camioneta ca=new Camioneta("negro",4,250,1600,900);

        vehiculo.add(c);
        vehiculo.add(b);
        vehiculo.add(m);
        vehiculo.add(ca);

        catalogar(vehiculo,2);
    }
    public static void catalogar(ArrayList vehiculo){
        for(int i=0;i< vehiculo.size();i++){

            Vehiculo v1 = (Vehiculo) vehiculo.get(i);
            System.out.println(v1.getClass().getSimpleName());
            System.out.println("Color:"+v1.getColor());
            System.out.println("Ruedas:"+ v1.getRuedas());

        }
    }
    public static void catalogar(ArrayList vehiculos, int ruedas){
        int contador=0;
        for(int i=0;i<vehiculos.size();i++){
            Vehiculo v1=(Vehiculo) vehiculos.get(i);
            if(v1.getRuedas()==ruedas){
                contador+=1;
            }
        }
        System.out.println("Se han encontrado "+contador+" vehiculos con "+ ruedas+ " ruedas");
    }
}
