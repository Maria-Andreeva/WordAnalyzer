import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordAnalyzer {
    public static void main(String[] args) {
        // Имя файла с входными данными
        String filename = "input.txt";

        // Используем HashMap для хранения частоты слов
        Map<String, Integer> wordCount = new HashMap<>();

        // Переменные для хранения общего количества слов и самого длинного слова
        int totalWords = 0;
        String longestWord = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Читаем файл построчно
            while ((line = reader.readLine()) != null) {
                // Разбиваем строку на слова
                String[] words = line.split("\\s+");

                for (String word : words) {
                    // Пропускаем пустые строки
                    if (word.isEmpty()) {
                        continue;
                    }

                    // Увеличиваем общее количество слов
                    totalWords++;

                    // Обновляем самое длинное слово
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }

                    // Увеличиваем счетчик для текущего слова
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }

        // Выводим результаты
        System.out.println("Общее количество слов: " + totalWords);
        System.out.println("Самое длинное слово: " + longestWord);
        System.out.println("Частота слов:");

        // Сортируем слова по алфавиту для удобства чтения
        wordCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
