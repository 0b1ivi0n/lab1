package asd;

public class Crocodile implements Swimmable, Crawlable{
    
    private float toothLength;
    
    public Crocodile(float toothlength){
        this.toothLength = toothlength;
    }

    public void crawl() {
        System.out.println("Крокодил  ползает по берегу");
    }

    public void swim() {
        System.out.println("Крокодил плывет по воде");
    }

    public String getMovementType(){
        return "Плавает в воде, ползает на земле и бегает на коротки расстояния";
    }

    public void bite() {
        System.out.println("Крокодил  кусает своими зубами длиной " + toothLength + " сантиметров");
    }

}
