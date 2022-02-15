import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ZadachaNaMap {
    // у нас есть Лист, содержащий элементы, например, 1, 2, 4, 2, 5, 1, 3
    // Нужно чтобы на выходе в Мапе содержались в виде ключа один номер элемента, а в виде значения
    // количество вхождения этого элемента в Лист.


    public static Map<Integer, Integer> counter(List<Integer> input) {
        Map<Integer, Integer> map = new HashMap<>();

        if (input == null || input.isEmpty()) {
            return map;
        }
        for (Integer el : input) {
            if (!map.containsKey(el)) {
                map.put(el, map.get(++el));
            } else {
                map.put(el, 1);
            }
        }
        return map;
    }

    // сделать тоже самое только со стримом - через форыч через лямбду написать тоже самое условие
    // или через группировку
    public static Map<Integer, Integer> calculateRepeats(List<Integer> input) {
        Map<Integer, Integer> result = new HashMap<>();
        if (input == null || input.isEmpty()) {
            return Collections.emptyMap();
        }
        input.forEach(integer -> result.merge(integer, 1, Integer::sum));
        return result;
    }
    // или так
    // list.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum, TreeMap::new));
}
