package dev.leowtos.aston.homework.battleground.hero;

public class Karapuchka extends Enemy {

    public Karapuchka(int health) {
        super("Карапучка", health);
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println(this.name + " делает кусь за попу " + enemy.getName());

        int damage = random.nextInt(5, 25);
        enemy.takeDamage(damage);

        System.out.println("Герой получил - " + damage + " урона.");
    }
}
