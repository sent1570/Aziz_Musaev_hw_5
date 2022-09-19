package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String superPower;


    public Hero(int health,int damage, String superPower) {
        this.heroHealth = health;
        this.heroDamage = damage;
        this.superPower = superPower;
    }
        public Hero(int health,int damage){
            this.heroHealth = health;
            this.heroDamage = damage;


    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
}
