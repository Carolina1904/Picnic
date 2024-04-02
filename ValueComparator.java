import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<String> {
    Map<String, Integer> map;

    public ValueComparator(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String key1, String key2) {
        int value1 = map.get(key1);
        int value2 = map.get(key2);
        if (value1 == value2) {
            return key2.compareTo(key1);
        } else {
            return value2 - value1;
        }
    }
}
