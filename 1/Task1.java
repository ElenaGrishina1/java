//  Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int count,result;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            count = scanner.nextInt();
            result = toCount(count);
            System.out.println("Сумма чисел = "+ result);
        }
    }

    public static Integer toCount(int n){
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
}