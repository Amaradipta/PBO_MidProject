public class Main {
    public static void main(String[] args) {
        Player player = new Player("Player", 100, 10);
        Enemy enemy = new Enemy("Enemy", 100, 19);

        while (player.getHealthPoints() > 0 && enemy.getHealthPoints() > 0) {
            player.performAction();
            System.out.println(player.getName() + " attacks " + enemy.getName() + "!");
            enemy.takeDamage(player.getDamage());
            System.out.println(enemy.getName() + "'s Health: " + enemy.getHealthPoints());

            if (enemy.getHealthPoints() <= 0) {
                System.out.println("You win!");
                break;
            }

            enemy.performAction();
            System.out.println(enemy.getName() + " attacks " + player.getName() + "!");
            player.takeDamage(enemy.getDamage());
            System.out.println(player.getName() + "'s Health: " + player.getHealthPoints());

            if (player.getHealthPoints() <= 0) {
                System.out.println("Game over. You lose!");
                break;
            }
        }
    }
}