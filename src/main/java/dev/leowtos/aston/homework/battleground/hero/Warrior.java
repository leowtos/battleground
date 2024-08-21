package dev.leowtos.aston.homework.battleground.hero;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println("Воин " + this.name + " шлепает по попе врага.");

        int damage = random.nextInt(4, 40);
        enemy.takeDamage(damage);

        System.out.println("Враг получил - " + damage + " урона.");

    }
}

/* Создать классы Warrior, Mage и Archer, представляющие собой
наследников класса Hero
Переопределить в них метод attackEnemy() для вывода
специализированного для этого класса сообщения об атаке.
Протестировать создание героев различных классов и их атаки в классе
TrainingGround.*/
