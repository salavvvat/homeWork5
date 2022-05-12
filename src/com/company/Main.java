package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(550);
        boss.setDamage(60);
        boss.setTypeOfDefence("kinetic");
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss choose: " + boss.getTypeOfDefence());
        createHeroes();
    }
    public static Hero[] createHeroes(){
//        Hero kinetic = new Hero(230,30, "brainRush");
//        Hero magic = new Hero(200, 25, "fireBall");
//        Hero physic = new Hero(300, 35);

        Hero[] allHeroes = new Hero[3];
        allHeroes[0] = new Hero("kinetic", 230, 30, "brainRush");
        allHeroes[1] = new Hero("magic", 200, 25, "fireBall");
        allHeroes[2] = new Hero("physic", 300, 35);
        for (int i = 0; i < allHeroes.length; i++) {
            System.out.println(allHeroes[i].getName() + "  " + allHeroes[i].getHealth() + "  " + allHeroes[i].getDamage() +
                    "  " + allHeroes[i].getSuperPower());
        }
        return allHeroes;
    }



    }



