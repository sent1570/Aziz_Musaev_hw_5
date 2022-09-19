package com.company;

public class Main {

    public static void main(String[] args) {
        Boss c2 = new Boss();
        c2.setHealth(1000);
        c2.setDamage(50);
        c2.setDefenceType("Magical");
        System.out.println("Boss Health: " + c2.getHealth() + "  Boss Damage: " + c2.getDamage() + "  Boss defence: " + c2.getDefenceType());
        System.out.println();

        for (int i = 0; i < creatHeroes().length ; i++) {

            if (i == 1){
                System.out.println("Health: " + creatHeroes()[i].getHeroHealth() + " Damage: " + creatHeroes()[i].getHeroDamage());

             }
else {

                System.out.println("Health: " + creatHeroes()[i].getHeroHealth() + " Damage: " + creatHeroes()[i].getHeroDamage() + " SuperPower: " + creatHeroes()[i].getSuperPower());
            }

        }
    }

    public static Hero[] creatHeroes() {
        Hero n1 = new Hero(200, 20, "Kinetic");
        Hero n2 = new Hero(220, 30);
        Hero n3 = new Hero(230, 25, "Physical");
        Hero Hero1[] = {n1, n2, n3};
        return Hero1;

    }

}
