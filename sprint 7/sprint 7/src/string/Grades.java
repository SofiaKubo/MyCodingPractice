package string;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        String[] pupils = grades.split(";"); // реализуйте метод здесь
        for (String pupil : pupils) {
            String[] str = pupil.split(",");
            System.out.println(
                    capitalize(str[0]) + " " +
                            capitalize(str[1]) + " " +
                            str[2].toLowerCase() + " — " +
                            gradeToString(str[3])
            );
        }
    }
}

class Pracum {
    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.gradeBeautifier("вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5");
    }
}
