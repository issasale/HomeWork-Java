package cmd1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PropertyReader {
    private Map<String, String> properties;

    public PropertyReader(File file) {
        properties = new HashMap<>();


        try (Scanner scanner = new Scanner(file)) {
            StringBuilder jsonContent = new StringBuilder();


            while (scanner.hasNextLine()) {
                jsonContent.append(scanner.nextLine());
            }


            parseJson(jsonContent.toString());
        } catch (FileNotFoundException e) {
            System.out.println("« Ошибка: Файл не найден! »" + e.getMessage());
        }
    }


    private void parseJson(String json) {
        json = json.trim()
                .replace("{", "")
                .replace("}", "")
                .replace("\"", "");

        String[] pairs = json.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                properties.put(key, value);
            }
        }
    }


    public String getProperty(String key) {
        return properties.getOrDefault(key, null);
    }
}


