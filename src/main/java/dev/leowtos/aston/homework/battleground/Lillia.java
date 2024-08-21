package dev.leowtos.aston.homework.battleground;

public class Lillia extends Hero {

    public Lillia() {
        super("Лиллия");
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        System.out.println(this.name + " бьет врага волшебным посохом.");

        int damage = random.nextInt(10, 23);
        enemy.takeDamage(damage);

        System.out.println("Враг получил - " + damage + " урона.");

        return damage;
    }

}
