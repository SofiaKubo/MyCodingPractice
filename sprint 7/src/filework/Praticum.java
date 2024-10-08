package filework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Praticum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.
        String line = br.readLine();
        while (line != null) {
            frequencyMap.put(line, frequencyMap.getOrDefault(line, 0) + 1);
            line = br.readLine();
        }
        br.close();
        // выведите результат в формате "<буква>: <количество>".
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

