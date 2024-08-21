package dev.leowtos.aston.homework.battleground;

public class Archer extends Hero {

    public Archer (String name) {
        super(name);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        boolean left = this.random.nextBoolean();
        if (left) {
            System.out.println("Лучник " + this.name + " попала стрелой в левую филейную часть врага.");
        } else {
            System.out.println("Лучник " + this.name + " попала стрелой в правую филейную часть врага.");
        }
        int damage = random.nextInt(5, 30);
        enemy.takeDamage(damage);

        System.out.println("Враг получил - " + damage + " урона.");

        return damage;
    }

}
