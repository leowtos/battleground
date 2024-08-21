package dev.leowtos.aston.homework.battleground;

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

        Hero hero = null;

        if (choose == 1) {
            hero = new Lillia();
        } else if (choose == 2) {
            hero = new Archer("Эш");
        } else if (choose == 3) {
            hero = new Warrior("Насус");
        } else if (choose == 4) {
            hero = new Mage("Люкс");
        }

        if (hero == null) {
            System.out.println("Вы ввели неправильное значение, попробуйте снова");
        } else {
            System.out.println("Отличный выбор! Удачи в бою вместе с " + hero.getName());
        }

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

        Enemy enemy = new Enemy(levels[level - 1]);

        while (enemy.isAlive()) {
            hero.attackEnemy(enemy);
            System.out.println("У врага осталось : " + enemy.getHealth() + "❤️.");
        }

        System.out.println("Победа! Враг мёртв 🙌");
    }

}

// Когда враг умирает вывести что-то смешное
