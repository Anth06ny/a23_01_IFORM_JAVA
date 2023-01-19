package main.beans;

public class SubmarineBean {

    //Attributs
    private String name;
    private int depth;

    //Constructeurs

    public static void main(String[] args) {
        SubmarineBean s = new SubmarineBean();
        s.setName("Squall");
        s.dive();
        s.dive();
        System.out.println(s.getName() + " " + s.getDepth());
    }

    //méthode public
    public void dive() {
        depth -= 50;
    }

    public void rise() {
        depth += 50;
        if (depth > 0) {
            depth = 0;
        }
    }


//    Elle devra créer un sous-marin nommé "Squall", le faire descendre 2 fois et remonter 3 fois
//    Afficher dans la console son nom et sa profondeur

    //GET /SET
    public int getDepth() {
        return depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
