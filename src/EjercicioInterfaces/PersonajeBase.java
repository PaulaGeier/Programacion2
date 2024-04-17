package EjercicioInterfaces;

public class PersonajeBase implements Personaje {
    private int level;
    private String name;
    private int lifePoints;
    private int attackPower;
    private int defensePower;

    public PersonajeBase(int level, String name, int lifePoints, int attackPower, int defensePower) {
        this.level = level;
        this.name = name;
        this.lifePoints = lifePoints;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }


    @Override
    public int attack() {
        return attackPower;
    }


    @Override
    public void defense(int damage, String opponentName) {
        int damageCaused=defensePower-damage;
        if(damageCaused<0) {
            System.out.println("El " +this.getClass().getSimpleName() +" "+ name+ " murio contra "+ opponentName);
        }else{
            System.out.println("La pelea entre " +name+" y "+ opponentName+ " causo a "+name +" "+damageCaused+" de  daño. "+ name+" le quedan "+ (lifePoints-damageCaused) +" de vida");
        }
    }
}
