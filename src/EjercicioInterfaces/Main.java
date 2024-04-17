package EjercicioInterfaces;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero=new Guerrero(4,"Goliat",45,65,45);
        Mago mago=new Mago(5,"Merli",75,30,50);
        Picaro picaro= new Picaro(2,"David",30,15,20);

        picaro.defense(guerrero.attack(), guerrero.getName());
        picaro.defense(mago.attack(), mago.getName());
        mago.defense(picaro.attack(), picaro.getName());
        mago.defense(guerrero.attack(), guerrero.getName());
        guerrero.defense(mago.attack(),mago.getName());
        guerrero.defense(picaro.attack(), picaro.getName());
    }
}
