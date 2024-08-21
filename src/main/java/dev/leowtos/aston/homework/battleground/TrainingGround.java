package dev.leowtos.aston.homework.battleground;

import dev.leowtos.aston.homework.battleground.hero.*;

public class TrainingGround {

    public static void main(String[] args) {
        Enemy karapuchka = new Karapuchka(505);

        Warrior nasus = new Warrior("Насус", 1000);
        nasus.attack(karapuchka);

        Archer ash = new Archer("Эш", 133);
        ash.attack(karapuchka);

        Mage lux = new Mage("Люкс", 0);
        lux.attack(karapuchka);

        Lillia lillia = new Lillia(1000000000);
        lillia.attack(karapuchka);

        System.out.println("У Карапучки осталось " + karapuchka.getHealth() + "❤️");
    }
}