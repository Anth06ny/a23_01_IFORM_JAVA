package main.beans;

public class PlayerBean {

    private String name;
    private int score;
    private CupBean cup;

    public PlayerBean(String name) {
        this.name = name;
        cup = new CupBean();
    }

    public static void main(String[] args) {
        PlayerBean pb = new PlayerBean("toto");
        pb.roll();
        if(pb.getCup().getScoreDices() > 7) {
            pb.add1Point();
        }
        System.out.println("Le score de " + pb.getName() + " est de " + pb.getScore());
        System.out.println("Dernier lancé : " + pb.getCup().getScoreDices());
    }

    public void roll() {
        cup.roll();
    }

    public void add1Point() {
        score++;
    }


    /* -------------------------------- */
    // GET.SET
    /* -------------------------------- */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public CupBean getCup() {
        return cup;
    }

    public void setCup(CupBean cup) {
        this.cup = cup;
    }
}
