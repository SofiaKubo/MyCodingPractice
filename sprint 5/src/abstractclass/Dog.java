package abstractclass;

public class Dog extends Pet {
    public Dog() {
        super(4, "Гав");
    }
    public void bringStick() {
        System.out.println("Принес палочку как хороший мальчик!");
    }
}
