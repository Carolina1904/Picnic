import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CountWords {
    public int countWords(File file) {
        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        return count;
    }
}