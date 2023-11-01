package asd;

public abstract class Bird implements Flyable {
    private String featherColor;

    public Bird(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor(){
        return featherColor;
    };

    public abstract void makeSound();
}

