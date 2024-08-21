package dev.leowtos.aston.homework.battleground.hero;

public class Lillia extends Hero {

    public Lillia(int health) {
        super("Лиллия", health);
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println(this.name + " бьет врага волшебным посохом.");

        int damage = random.nextInt(10, 30);
        enemy.takeDamage(damage);

        System.out.println("Враг получил - " + damage + " урона.");

    }

}
