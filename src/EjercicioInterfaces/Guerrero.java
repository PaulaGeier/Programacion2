package EjercicioInterfaces;

public class Guerrero extends PersonajeBase {
    public Guerrero(int level, String name, int lifePoints, int attackPower, int defensePower) {
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
