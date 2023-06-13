import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toMap;

public class Task2 {
    public static void main(String[] args) {
        List<phoneBook> phone = Arrays.asList(
                new phoneBook("Ivanov", "+79017495860"),
                new phoneBook("Petrov", "+78005337494"),
                new phoneBook("Pupkin", "+79017495861"),
                new phoneBook("Sidorov", "+79030654116"),
                new phoneBook("Pupkin", "+79060008840"),
                new phoneBook("Pupkin", "+79099947763"));
        Map<String, List<String>> multimap = new HashMap<>();
        for (phoneBook people : phone) {
            multimap.computeIfAbsent(people.getPerson(), k -> new ArrayList<>()).add(people.getPhone());
        }
        System.out.println("Телефонная книга: ");
        System.out.println(multimap + "\n");
        Map<String, List<String>> phoneBook = multimap.entrySet().stream()
                .sorted(comparingInt(e -> e.getValue().size()))
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        Set<String> set = phoneBook.keySet();
        Iterator<String> itr = set.iterator();
        List<String> alKeys = new ArrayList<String>(phoneBook.keySet());
        Collections.reverse(alKeys);
        System.out.println("Отсортированная телефонная книга: ");
        for (String key : alKeys) {
            System.out.println(key + " " + phoneBook.get(key));
        }
    }
}