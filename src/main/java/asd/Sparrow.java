package asd;

public class Sparrow extends Bird {
    private float wingSpan;
    public Sparrow(String featherColor, float wingSpan) {
        super(featherColor);
        this.wingSpan = wingSpan;
    }
    public void fly() {
        System.out.println("Воробей развивает скорость в полете благодаря своим крыльям длиной " + wingSpan + " сантиметров");
    }

    public void makeSound(){
        System.out.println("Чик-чирик-чик");
    }

    public String getMovementType(){
        return "Летает и бегает по земле";
    }
}
