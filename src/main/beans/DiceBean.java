package main.beans;

import java.util.Random;

public class DiceBean {

    private int value;

    public static void main(String[] args) {
        DiceBean dice = new DiceBean();

        int tab[] = new int[7];
        for (int i = 0; i < 100000; i++) {
            dice.roll();
            if (dice.getValue() < 1 || dice.getValue() > 6) {
                System.out.println("Valeur incorrecte : " + dice.getValue());
            }
            tab[dice.getValue()]++;
        }

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] == 0) {
                System.out.println("Valeur non trouvée :" + i);
            }
        }

        System.out.println("Fin");
    }

    public void roll() {
        value = new Random().nextInt(5) + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
