package filework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arctik {
    public static void main(String[] args) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"))) {
            fileReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

