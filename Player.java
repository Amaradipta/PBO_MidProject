public class Player extends GameCharacter {
    private int damage;

    public Player(String name, int healthPoints, int damage) {
        super(name, healthPoints);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " attacks the enemy!");
    }

    @Override
    public void takeDamage(int damage) {
        setHealthPoints(getHealthPoints() - damage);
        System.out.println(getName() + " takes " + damage + " damage!");
    }
}