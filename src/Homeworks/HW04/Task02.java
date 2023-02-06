// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Homeworks.HW04;

import java.util.LinkedList;

public class Task02
{
    public static void main(String[] args)
    {
        LinkedList<Integer> myLinkedList = new LinkedList<>();// задаём и наполняем лист
        for (int i = 0; i < 10; i++)
        {
            myLinkedList.add(i);
        }
        System.out.println(myLinkedList.toString()); //изначальный список

        enqueue(myLinkedList, 10);
        enqueue(myLinkedList, 55);
        System.out.println(myLinkedList.toString()); // с доп элементами в конце очереди

        int number01 = dequeue(myLinkedList);
        System.out.println(number01); // возвращённый первый элемент из очереди
        System.out.println(myLinkedList.toString()); // и каким стал список, так как первый элемент удалили

        int number02 = dequeue(myLinkedList);
        System.out.println(number02);
        System.out.println(myLinkedList.toString());

        System.out.println(first(myLinkedList)); //просто первый элемент из очереди

    }

    public static void enqueue(LinkedList<Integer> linkedList, int number) // помещает элемент в конец очереди
    {
        linkedList.add(number);
    }
    public static int dequeue(LinkedList<Integer> linkedList) // возвращает первый элемент из очереди и удаляет его
    {
        int temp = linkedList.get(0);
        linkedList.remove(0);
        return temp;
    }
    public static int first(LinkedList<Integer> linkedList) // возвращает первый элемент из очереди, не удаляя
    {
        int temp = linkedList.get(0);
        return temp;
    }


}
