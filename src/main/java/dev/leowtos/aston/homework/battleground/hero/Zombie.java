package dev.leowtos.aston.homework.battleground.hero;

public class Zombie extends Enemy {

    public Zombie(int health) {
        super("Инстомби", health);
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println(this.name + " заставляет " + enemy.getName() + " сниматься в рилсах");

        int damage = random.nextInt(5, 25);
        enemy.takeDamage(damage);

        System.out.println("Герой получил - " + damage + " урона.");
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);

        if (!this.isAlive()) {
            boolean shouldResurrect = random.nextBoolean();
            if (shouldResurrect) {
                this.setHealth(100);
                System.out.println("🧟 Я ещё не все фотки запостила");
            } else {
                System.out.println("🧟 Арррггх");
            }
        }
    }
}
