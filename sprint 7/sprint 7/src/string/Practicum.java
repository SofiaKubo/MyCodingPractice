package string;

public class Practicum {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз, раз, раз", "раз");
        System.out.println(count);

        int count1 = check.numberOfRepeats("раз два три, раз два три", "раз");
        System.out.println(count1);


        int count2 = check.numberOfRepeats("Hello, world!", "goodbye");
        System.out.println(count2);
/*
        Capitalizator check = new Capitalizator();
        System.out.println(check.capitalize("я не волшебник, я только учусь!"));
        System.out.println(check.capitalize("меня зовут Петя"));
        System.out.println(check.capitalize("Я уже большой!"));*/

      /*  StringBuilder initial = new StringBuilder("Большая красная кнопка");

        initial.replace(8, 15, "белая");
        initial.delete(14, 30);
        initial.append("груша");
        initial.setLength(7);
        initial.reverse();

        System.out.println(initial.toString().toLowerCase());*/
    }
}

