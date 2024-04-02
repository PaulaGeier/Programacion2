public class Technical extends Operator {
    private int diasTrabajo;

    public Technical(String name, String apellido, int diasTrabajo) {
        super(name, apellido);
        this.diasTrabajo = diasTrabajo;
    }

    public int getDiasTrabajo() {
        return diasTrabajo;
    }

    public void setDiasTrabajo(int diasTrabajo) {
        this.diasTrabajo = diasTrabajo;
    }

    @Override
    public String toString() {
        return getName()+" "+getApellido()+" trabaja "+diasTrabajo+ " dias";
    }
}
