package generics;

// Дополните объявление класса Contact
public abstract class Contact {
    // Класс должен содержать одно полe - имя пользователя name
    private String name;

    protected Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
    public abstract void sendMessage();

    public abstract void print();
}
