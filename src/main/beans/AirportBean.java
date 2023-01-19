package main.beans;

public class AirportBean {

    private PlaneBean place1, place2;

    public static void main(String[] args) {
//        Ajouter une méthode main dans AirportBean, créer un Aéroport et 2 avions nommés A1 et A2
        AirportBean airport = new AirportBean();
        PlaneBean a1 = new PlaneBean();
        a1.setName("A1");
        PlaneBean a2 = new PlaneBean();
        a2.setName("A2");

//        Appeler la méthode nextFreePlace d'aéroport et garder le numéro reçu
        int nextPlace = airport.nextFreePlace();

//        Appeler la méthode park avec ce numéro et le 2ᵉ avion. Afficher le résultat (normalement ok)
        System.out.println(airport.park(a2, nextPlace));

//        Rappeler la méthode park avec le même numéro et le 2ᵉ avion. Afficher le résultat (normalement La place1 est occupée)
        System.out.println(airport.park(a2, nextPlace));

//        Appeler la méthode nextFreePlace d'aéroport et garder le numéro
        int nextPlace2 = airport.nextFreePlace();

//        Appeler la méthode park avec ce numéro et le 1er avion. Afficher le résultat (normalement ok)
        System.out.println(airport.park(a1, nextPlace2));

//        Appeler la méthode state d'aéroport qui devrait normalement afficher Place1=A2 Place2=A1
        airport.state();

//        Appeler la méthode nextFreePlace et afficher son résultat qui devrait normalement être -1
        nextPlace = airport.nextFreePlace();
        System.out.println(nextPlace);
    }

    public String park(PlaneBean plane, int position) {
        if (position == 1) {
            if (place1 == null) {
                place1 = plane;
                return "ok";
            } else {
                return "La place 1 est occupée";
            }
        } else if (position == 2) {
            if (place2 == null) {
                place2 = plane;
                return "ok";
            } else {
                return "La place 2 est occupée";
            }
        } else {
            return "Position incorrecte";
        }
    }

    public void state() {
        System.out.print("Place1=");
        if (place1 == null) {
            System.out.println("vide");
        } else {
            System.out.println(place1.getName());
        }

        System.out.print("Place2=");
        if (place2 == null) {
            System.out.println("vide");
        } else {
            System.out.println(place2.getName());
        }
    }

    public int nextFreePlace() {
        if (place1 == null) {
            return 1;
        } else if (place2 == null) {
            return 2;
        } else {
            return -1;
        }
    }
}