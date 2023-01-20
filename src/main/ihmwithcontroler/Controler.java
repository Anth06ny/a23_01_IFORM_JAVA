package main.ihmwithcontroler;

import main.beans.PartyBean;

public class Controler {

    //Données
    private PartyBean partyBean = new PartyBean("Toto", "Tata");

    private IHM ihm;

    public Controler(IHM ihm) {
        this.ihm = ihm;

        refreshScreen();
    }

    private void refreshScreen() {
        //Elle prend les données et met à jour l'écran
        //PartyBean -> IHM
        ihm.updateInfoJ1(partyBean.getJ1().getName(), partyBean.getJ1().getScore());
        ihm.updateInfoJ2(partyBean.getJ2().getName(), partyBean.getJ2().getScore());
        ihm.updateTourNumber(partyBean.getRound());

        boolean btJ1Visible = false, btJ2Visible = false, btRestartVisible = false;

        if (partyBean.getRound() == 3) {
            btRestartVisible = true;
        } else if (partyBean.getCurrentPlayer() == partyBean.getJ1()) {
            btJ1Visible = true;
            ihm.updateDiceValue(partyBean.getJ2().getCup().getD1().getValue(), partyBean.getJ2().getCup().getD2().getValue());
        } else {
            btJ2Visible = true;
            ihm.updateDiceValue(partyBean.getJ1().getCup().getD1().getValue(), partyBean.getJ1().getCup().getD2().getValue());
        }

        ihm.updateVisiblityBt(btJ1Visible, btJ2Visible, btRestartVisible);
    }

    /* -------------------------------- */
    // Ecoute de l'IHM
    /* -------------------------------- */

    public void clickOnRestart() {
        partyBean = new PartyBean(partyBean.getJ1().getName(), partyBean.getJ2().getName());
        refreshScreen();
    }


    public void clickOnRollJ1() {
        //Modifications des données
        partyBean.getJ1().roll();
        if (partyBean.getJ1().getCup().getScoreDices() >= 7) {
            partyBean.getJ1().add1Point();
        }
        partyBean.setCurrentPlayer(partyBean.getJ2());

        //Modifications graphiques
        refreshScreen();
    }

    public void clickOnRollJ2() {
        //Modification des données
        partyBean.getJ2().roll();
        if (partyBean.getJ2().getCup().getScoreDices() >= 7) {
            partyBean.getJ2().add1Point();
        }
        partyBean.setCurrentPlayer(partyBean.getJ1());
        partyBean.add1Round();

        //Modifications graphiques
        refreshScreen();
    }
}
