package main.beans;

public class PartyBean {
    private PlayerBean j1, j2, currentPlayer;
    private int round;

    public PartyBean(String nameJ1, String nameJ2) {
        j1 = new PlayerBean(nameJ1);
        j2 = new PlayerBean(nameJ2);
        currentPlayer = j1;
        round = 1;
    }

    public static void main(String[] args) {
        //Scanner
        PartyBean p = new PartyBean("Toto", "tata");
        //Jeu
        p.getJ1().roll();
        p.add1Round();

        //Affichage des résultats

    }

    public PlayerBean winner() {
        if (j1.getScore() > j2.getScore()) {
            return j1;
        } else if (j1.getScore() < j2.getScore()) {
            return j2;
        } else {
            return null;
        }
    }

    public void add1Round() {
        round++;
    }

    /* -------------------------------- */
    // GET SET
    /* -------------------------------- */

    public PlayerBean getJ1() {
        return j1;
    }

    public void setJ1(PlayerBean j1) {
        this.j1 = j1;
    }

    public PlayerBean getJ2() {
        return j2;
    }

    public void setJ2(PlayerBean j2) {
        this.j2 = j2;
    }

    public PlayerBean getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(PlayerBean currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
