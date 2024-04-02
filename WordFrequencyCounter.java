import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class WordFrequencyCounter {
    public Map<String, Integer> countWordFrequency(File file) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        return wordFrequency;
    }
}
