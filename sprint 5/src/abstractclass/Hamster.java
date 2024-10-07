package abstractclass;

public class Hamster extends Pet {
    public Hamster() {
        super(4, "Пи-пи-пи");
    }
    public void hideFood() {
        System.out.println("Вся еда - в щечках!");
    }
}
