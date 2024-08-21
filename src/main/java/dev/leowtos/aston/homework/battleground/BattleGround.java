package dev.leowtos.aston.homework.battleground;

import dev.leowtos.aston.homework.battleground.hero.*;

import java.util.Scanner;

public class BattleGround {

    public static void main(String[] args) {
        System.out.println("Введите число для выбора героя:");
        System.out.println("1. Лиллия - храбрый оленёнок.");
        System.out.println("2. Эш - лучник");
        System.out.println("3. Насус - воин");
        System.out.println("4. Люкс (неподъёмный) - маг");

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        int[] levels = {250, 500, 750};

        System.out.println("Введите число для выбора сложности:");
        System.out.println("1. Проще простого (или нет?) - " + levels[0] + "❤️");
        System.out.println("2. Какие мы смелые, однако (*восторг*) - " + levels[1] + "❤️");
        System.out.println("3. А у вас стальные.. нервы - " + levels[2] + "❤️");

        int level = scanner.nextInt();
        if (level >= 1 && level <= 3) {
            System.out.println("Вы выбрали уровень - " + level + ". У врага - " + levels[level - 1] + "❤️");
        } else {
            System.out.println("Такого уровня сложности нет, попробуйте сначала");
        }

        Hero hero = null;
        int health = levels[level - 1];

        if (choose == 1) {
            hero = new Lillia(health);
        } else if (choose == 2) {
            hero = new Archer("Эш", health);
        } else if (choose == 3) {
            hero = new Warrior("Насус", health);
        } else if (choose == 4) {
            hero = new Mage("Люкс", health);
        }

        if (hero == null) {
            System.out.println("Вы ввели неправильное значение, попробуйте снова");
            return;
        } else {
            System.out.println("Отличный выбор! Удачи в бою вместе с " + hero.getName());
        }

        Enemy karapuchka = new Karapuchka(levels[level - 1]);
        Enemy zombie = new Zombie(levels[level - 1]);

        System.out.println("Ваши враги: " + karapuchka.getName() + " и " + zombie.getName());

        while (hero.isAlive() && (karapuchka.isAlive() || zombie.isAlive())) {
            hero.attack(karapuchka);
            hero.attack(zombie);

            karapuchka.attack(hero);
            zombie.attack(hero);

            System.out.println("У Карапучки осталось : " +  karapuchka.getHealth() + "❤️.");
            System.out.println("У Инстомби осталось : " +  zombie.getHealth() + "❤️.");

            System.out.println("У героя осталось : " + hero.getHealth() + "❤️.");
        }

        if (hero.isAlive()) {
            System.out.println("Победа! Враг мёртв 🙌");
        } else {
            System.out.println("Враги победили! 😒");
        }

    }

}

// Когда враг умирает вывести что-то смешное
