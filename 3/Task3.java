import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            array.add(random.nextInt(100));
        }
        int min = Collections.min(array);
        int max = Collections.max(array);
        double average = array.stream().mapToInt(Integer::intValue).average().orElse(0);
        
        System.out.println(array);
        System.out.println("Min значение: " + min);
        System.out.println("Max значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
        
        array.removeIf(n -> n % 2 == 0);
        System.out.println("Список без четных чисел: " + array);
    }
}