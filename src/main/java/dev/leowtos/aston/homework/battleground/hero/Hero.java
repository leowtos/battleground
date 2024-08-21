package dev.leowtos.aston.homework.battleground.hero;

import java.util.Random;

public abstract class Hero implements Mortal {

    protected final String name;

    protected final Random random = new Random();

    protected int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attack(Hero enemy);

    public void takeDamage(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}