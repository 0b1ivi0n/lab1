package asd;

public class Monkey extends Primate implements Jumpable, Climbable {

    public Monkey(String name, double weight, double height) {
        super(name, weight, height);
    }

    public String getType() {
        return "Обезьяна";
    }

    public boolean isSpeakable() {
        return false;
    }

    public void run() {
        System.out.println(name + " бежит со скоростью " + weight * 2 + " км/ч");
    }

    public void climb() {
        System.out.println(name + " лазит по деревьям на высоте " + height * 10 + " м");
    }

    public void jump() {
        System.out.println(name + " прыгает на расстояние " + weight * 5 + " м");
    }

    public void crawl() {
        System.out.println(name + " ползает по земле со скоростью " + weight / 2 + " км/ч");
    }

    public String getMovementType(){
        return "Бегает, прыгает, ползает и лазит по деревьям";
    }
}

