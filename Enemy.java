public class Enemy extends GameCharacter {
    private int damage;

    public Enemy(String name, int healthPoints, int damage) {
        super(name, healthPoints);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " attacks the player!");
    }

    @Override
    public void takeDamage(int damage) {
        setHealthPoints(getHealthPoints() - damage);
        System.out.println(getName() + " takes " + damage + " damage!");
    }
}