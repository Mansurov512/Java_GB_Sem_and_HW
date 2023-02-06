// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Homeworks.HW04;

import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;

public class Task01
{
    public static void main(String[] args)
    {
        //Homeworks.HW03.Task01.RandomRandom(); //ого как можно методы из предыдущего ДЗ вызывать, классно
        //но так сложно ДЗ будет проверять, потому скопирую код метода
        int[] arrayRandom = RandomRandom();

        LinkedList<Integer> linkedList = new LinkedList();
       // ArrayList<Integer> arrayList = new ArrayList<>(arrayRandom.length);
        for (int i = 0; i < arrayRandom.length; i++) //наполняем список из массива
        {
            linkedList.add(arrayRandom[i]);
        }
        System.out.println(linkedList.toString());

        LinkedList<Integer> LinkedListRevers = new LinkedList();
        for (int i = linkedList.size() - 1; 0 <= i; i--) //наполняем наш список перевёрнутым
        {
            LinkedListRevers.add(linkedList.get(i));
        }
        System.out.println(LinkedListRevers.toString());
    }

    public static int[] RandomRandom()
    {
        Random random = new Random();
        int[] array = new int[random.nextInt(5,10)];

        IntStream.range(0, array.length) // С помощью стрима проходим по всему массиву
                // Заносим рандомное число в ячейку массива
                // Рандомные значения могут быть в диапазоне от 0 до 99 включительно
                .forEach(index -> array[index] = random.nextInt(99));
        return array;
    }
}