package com.company;

public class Boss {

    private int bossHealth;
    private int bossDamage;
    private String bossDefenceType;


    public int getHealth() {
        return bossHealth;
    }

    public void setHealth(int health) {
        this.bossHealth = health;
    }

    public int getDamage() {
        return bossDamage;
    }

    public void setDamage(int damage) {
        this.bossDamage = damage;
    }

    public String getDefenceType() {
        return bossDefenceType;
    }

    public void setDefenceType(String defenceType) {
        this.bossDefenceType = defenceType;
    }
}
