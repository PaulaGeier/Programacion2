public class Directory extends Employee{
    private String sector;

    public Directory(String name, String sector) {
        super(name);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        String d=getName()+" es director del sector de "+ sector;
        return d;
    }
}
