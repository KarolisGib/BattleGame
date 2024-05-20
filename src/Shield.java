public class Shield {

    private String name;

    private double defence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public Shield(String name, double defence) {
        this.name = name;
        this.defence = defence;
    }
}