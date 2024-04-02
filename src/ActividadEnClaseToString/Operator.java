public class Operator extends Employee{
    private String apellido;

    public Operator(String name, String apellido) {
        super(name);
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        String s= super.toString()+" " + getApellido();
        return s;
    }
}
