public abstract class GameCharacter {
    private String name;
    private int healthPoints;

    public GameCharacter(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public abstract void performAction();

    public abstract void takeDamage(int damage);

    protected void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}