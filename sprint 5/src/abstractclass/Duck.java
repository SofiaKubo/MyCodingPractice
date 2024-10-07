package abstractclass;

public abstract class Duck {
    protected String name;

    protected Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void swim() {
        System.out.println("Да, я умею плавать!");
    }

    public void quack() {
        System.out.println("Кря!");
    }
}
