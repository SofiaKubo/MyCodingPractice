package string;

import java.util.ArrayList;
import java.util.List;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        List<String> list = new ArrayList<>();
        for (String grade : grades) {
            String[] str = grade.split(" ");
            list.add(String.join(",",
                    str[0].toLowerCase(),
                    str[1].toLowerCase(),
                    str[2], gradeStringToInt(str[4])
            ));
        }
        return String.join(";", list);
    }
}


class Test1 {
    public static void main(String[] args) {
        String[] grades = new String[]{
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"
        };

        GradesReversed reverser = new GradesReversed();
        System.out.println(reverser.serializeGrades(grades));
    }
}