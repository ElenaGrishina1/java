import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
		//создаю списк
        LinkedList<String> list = new LinkedList<>();
		//добавляю в список элементы
        list.add("А");
        list.add("Л");
        list.add("Е");
        list.add("К");
        list.add("С");
		list.add("А");
		list.add("Н");
		list.add("Д");
		list.add("Р");
		//вывожу начальный список
        System.out.println(list); 
		//вызываю метод, возвращающий перевернутый список
        LinkedList<String> reversedList = reverseLinkedList(list);
		//вывожу перевернутый списк
        System.out.println(reversedList);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        Collections.reverse(list);
        return list;
    }
}