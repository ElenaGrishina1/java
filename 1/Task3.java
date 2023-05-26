// Реализовать простой калькулятор
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Выберите действие: 1.Сложение 2.Вычитание 3.Умножение 4.Деление");
        int operation = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        switch (operation) {
            case 1 -> System.out.print("Результат =  " + (num1 + num2));
            case 2 -> System.out.println("Результат = " + (num1 - num2));
            case 3 -> System.out.println("Результат = " + (num1 * num2));
            case 4 -> System.out.print("Результат = " + (num1 / num2));
            default -> System.out.println("Не верно выбран номер действия!");
        }
        in.close();
    }
}
