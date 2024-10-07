package abstractclass;

public class FlyingDuck extends Duck {
    protected FlyingDuck(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Лечу куда хочу.");
    }

    public void eat() {
        System.out.println("Обычно кушаю разные семена, но иногда нахожу хлебушек.");
    }
}
