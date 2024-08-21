package dev.leowtos.aston.homework.battleground;

public class TrainingGround {

    public static void main(String[] args) {
        Enemy karapuchka = new Enemy(505);

        Warrior nasus = new Warrior("Насус");
        nasus.attackEnemy(karapuchka);

        Archer ash = new Archer("Эш");
        ash.attackEnemy(karapuchka);

        Mage lux = new Mage("Люкс");
        lux.attackEnemy(karapuchka);

        Lillia lillia = new Lillia();
        lillia.attackEnemy(karapuchka);

        System.out.println("У Карапучки осталось " + karapuchka.getHealth() + "❤️");
    }
}