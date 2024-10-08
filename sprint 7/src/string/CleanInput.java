package string;

public class CleanInput {
    public String fixString(String str) {
        if (str.isBlank()) {
            return "Вы ничего не ввели!";
        }
        return str.trim();
    }


}

class TextEditor {

    private boolean isCapsLock = false;

    public void capsLock() {
        // Здесь нужно изменить значение флага isCapsLock на противоположное
        isCapsLock = !isCapsLock;
    }

    public void print(String str) {
        // а здесь нужно распечатать строку или в верхнем регистре, или без изменений, учитывая флаг
        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str);
        }
    }
}