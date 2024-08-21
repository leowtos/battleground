package dev.leowtos.aston.homework.battleground;

import java.util.Random;

public abstract class Hero {

    protected final String name;

    protected final Random random = new Random();

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int attackEnemy(Enemy enemy);
}