package asd;

public class Eagle extends Bird {

    private int flightHeight;
    public Eagle(String featherColor, int flightHeight) {
        super(featherColor);
        this.flightHeight = flightHeight;
    }
    public void fly() {
        System.out.println("Орел парит в воздухе на высоте "  + flightHeight + " метров");
    }

    public void makeSound(){
        System.out.println("Как-кар-кар");
    }

    public String getMovementType(){
        return "Летает";
    }
}
