package asd;

public abstract class Primate {
    protected String name;
    protected double weight;
    protected double height;

    public Primate(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public abstract String getType();
    public abstract boolean isSpeakable();
}
