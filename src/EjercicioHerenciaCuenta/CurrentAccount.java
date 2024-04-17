package EjercicioHerenciaCuenta;
public class CurrentAccount extends Account{
    protected float turnTooHard=0;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }


    @Override
    public void withdraw(float amount) {
        if(amount>balance){
            super.withdraw(balance);
            turnTooHard=amount-balance;
        }else{
            super.withdraw(amount);
        }
    }
    @Override
    public void consign(float amount) {
        if(turnTooHard>0){
            turnTooHard-=amount;
        }
    }

    @Override
    public float monthlyStatement() {
        return super.monthlyStatement();
    }

    public void print(){
        System.out.println("Saldo en cuenta:"+balance);
        System.out.println("Comision mensual:"+monthlyCommission);
        System.out.println("Transacciones realizadas:"+ (numberConsignments+numberWithdrawals));
        System.out.println("Sobregiro:"+turnTooHard);
    }
}
