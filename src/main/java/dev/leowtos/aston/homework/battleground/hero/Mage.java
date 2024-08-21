package dev.leowtos.aston.homework.battleground.hero;

public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Hero enemy) {
       System.out.println("Маг " + this.name + " превращает врага в альбом моргенштерна (легендарная пыль).");

        int damage = random.nextInt(0, 5);
        enemy.takeDamage(damage);

        System.out.println("Враг получил - " + damage + " урона.");

    }
}
