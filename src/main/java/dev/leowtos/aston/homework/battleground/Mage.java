package dev.leowtos.aston.homework.battleground;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
       System.out.println("Маг " + this.name + " превращает врага в альбом моргенштерна (легендарная пыль).");

        int damage = random.nextInt(0, 5);
        enemy.takeDamage(damage);

        System.out.println("Враг получил - " + damage + " урона.");

        return damage;
    }
}
