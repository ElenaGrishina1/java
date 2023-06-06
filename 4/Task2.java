import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        enqueue(list, 7);
        dequeue(list);
        System.out.println(first(list));
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        System.out.println(list);
        return list;
    }

    public static int dequeue(LinkedList<Integer> list) {
        int temp = list.get(0);
        list.remove(0);
        System.out.println(list);
        return temp;
    }

    public static int first(LinkedList<Integer> list) {
        return list.get(0);
    }
}