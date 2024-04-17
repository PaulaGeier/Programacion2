package EjercicioHerenciaCuenta;
public class Main {
    public static void main(String[] args) {
        //Realizar un método main que implemente un objeto Cuenta de ahorros y llame a los métodos correspondientes.
         SavingsAccount cuentaAhorro=new SavingsAccount(50000,15);


        cuentaAhorro.consign(10000);
        cuentaAhorro.consign(15000);
        cuentaAhorro.withdraw(25000);
        cuentaAhorro.withdraw(5000);
        cuentaAhorro.monthlyStatement();
        cuentaAhorro.print();
    }
}