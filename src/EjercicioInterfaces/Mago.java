package EjercicioInterfaces;

public class Mago extends PersonajeBase{
    public Mago(int level, String name, int lifePoints, int attackPower, int defensePower) {
        super(level, name, lifePoints, attackPower, defensePower);
    }

    @Override
    public int attack() {
        return super.attack();
    }

    @Override
    public void defense(int damage, String opponentName) {
        super.defense(damage, opponentName);
    }
}
