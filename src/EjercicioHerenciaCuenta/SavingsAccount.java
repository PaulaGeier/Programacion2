package EjercicioHerenciaCuenta;

public class SavingsAccount extends Account {
    protected boolean active;
    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if(balance<10000){
            active=false;
        }else{
            active=true;
        }
    }

    public boolean isActive() {
        return active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }


    @Override
    public void consign(float amount) {
        if(active){
            super.consign(amount);
        }else {
            System.out.println("Cuenta inactiva");
        }

    }

    @Override
    public void withdraw(float amount) {
        if(active){
            super.withdraw(amount);
        }else {
            System.out.println("Cuenta inactiva");
        }

    }

    @Override
    public float monthlyStatement() {
        if (numberWithdrawals > 4) {
            monthlyCommission += 1000;
            return super.monthlyStatement();
        }else{
            return super.monthlyStatement();
        }
    }



    public void print(){
        System.out.println("Saldo en cuenta:"+balance);
        System.out.println("Comision mensual:"+monthlyCommission);
        System.out.println("Transacciones realizadas:"+ (numberConsignments+numberWithdrawals));
    }
}
