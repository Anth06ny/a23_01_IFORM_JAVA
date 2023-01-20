package main;

import main.beans.PartyBean;

public class Main {

    public static void main(String[] args) {
        //Scanner
        PartyBean p = new PartyBean("Toto", "tata");

        for (int i = 0; i < 10; i++) {
            //J1 joue
            p.getJ1().roll();
            if (p.getJ1().getCup().getScoreDices() >= 7) {
                p.getJ1().add1Point();
            }

            //J2 joue
            p.getJ2().roll();
            if (p.getJ2().getCup().getScoreDices() >= 7) {
                p.getJ2().add1Point();
            }

            p.add1Round();
        }

        //Affichage des résultats
        if (p.getJ1().getScore() > p.getJ2().getScore()) {
            System.out.print(p.getJ1().getName() + " a gagné :");
        } else if (p.getJ1().getScore() < p.getJ2().getScore()) {
            System.out.print(p.getJ2().getName() + " a gagné :");
        } else {
            System.out.print("Egalité :");
        }
        System.out.println(p.getJ1().getScore() + " - " + p.getJ2().getScore());

    }


}