import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class LongestWordFinder {
    public Set<String> findLongestWords(File file) {
        Set<String> longestWords = new HashSet<>();
        int maxLength = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                int length = word.length();
                if (length > maxLength) {
                    maxLength = length;
                    longestWords.clear();
                    longestWords.add(word);
                } else if (length == maxLength) {
                    longestWords.add(word);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        return longestWords;
    }
}
