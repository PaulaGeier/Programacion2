public class Official extends Operator {
    private int salary;

    public Official(String name, String apellido, int salary) {
        super(name, apellido);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getName()+" "+getApellido()+" cobra "+ salary;
    }
}
