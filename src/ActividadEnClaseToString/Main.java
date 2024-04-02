
public class Main {
    public static void main(String[] args) {
        Operator p=new Operator("Paula","Geier");
        Directory d=new Directory("Rodrigo","Embalaje");
        Official f=new Official("Thomas","Muñoz",15000);
        Technical t=new Technical("Ruth","Condori",20);

        System.out.println(p.toString());
        System.out.println(d.toString());
        System.out.println(f.toString());
        System.out.println(t.toString());
    }
 }