package com.company;

public class Main {

    public static void main(String[] args) {
        Magic mg1 = new Magic();
        Medic md1 = new Medic();
        Warrior wr1 = new Warrior();

        Hero[] heroes = {mg1,md1, wr1};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("");

        }
        }

}
