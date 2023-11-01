package asd;

public class Plane implements Flyable{
    private String model;

    public Plane(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void fly() {
        System.out.println("Самолет " + model + " взлетает в небо");
    }

    public String getMovementType(){
        return "Летает по воздуху";
    }

}
