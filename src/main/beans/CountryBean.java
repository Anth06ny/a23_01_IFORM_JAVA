package main.beans;

public class CountryBean  {
    private String name;
    private double population;
    private long area;

    public CountryBean() {
        this("SansNom");
    }

    public CountryBean(String name) {
        this(name, 1000, 10_000);
    }

    public CountryBean(String name, double population, long area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public static void main(String[] args) {
        CountryBean countryBean = new CountryBean();
        System.out.println(countryBean);
        countryBean.setArea(1000);
    }

    @Override
    public String toString() {
        return "CountryBean{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }

    /* -------------------------------- */
    // GEt / SET
    /* -------------------------------- */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }
}
