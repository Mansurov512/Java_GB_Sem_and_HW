// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Homeworks.HW04;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Task01
{
    public static void main(String[] args)
    {
        //Homeworks.HW03.Task01.RandomRandom(); //ого как можно методы из предыдущего ДЗ вызывать, классно
        //но так сложно ДЗ будет проверять, потому скопирую код метода
        int[] arrayRandom = RandomRandom();

        ArrayList<Integer> arrayList = new ArrayList<>(arrayRandom.length);
        for (int i = 0; i < arrayRandom.length; i++) //наполняем список из массива
        {
            arrayList.add(arrayRandom[i]);
        }
        System.out.println(arrayList.toString());

        ArrayList<Integer> ArrayListRevers = new ArrayList<>(arrayRandom.length);
        for (int i = arrayList.size() - 1; 0 <= i; i--) //наполняем наш список перевёрнутым
        {
            ArrayListRevers.add(arrayList.get(i));
        }
        System.out.println(ArrayListRevers.toString());
    }

    public static int[] RandomRandom()
    {
        Random random = new Random();
        int[] array = new int[random.nextInt(1,20)];

        IntStream.range(0, array.length) // С помощью стрима проходим по всему массиву
                // Заносим рандомное число в ячейку массива
                // Рандомные значения могут быть в диапазоне от 0 до 99 включительно
                .forEach(index -> array[index] = random.nextInt(99));
        return array;
    }
}