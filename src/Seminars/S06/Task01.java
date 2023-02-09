//1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//
//2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
// уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//
//Для вычисления процента используйте формулу:
//
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package Seminars.S06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class Task01
{
    public static void main(String[] args)
    {
        Integer[] array = RandomRandom(25);
        printArr(array);
        HashSet<Integer> mySet = Setulya(array);
        System.out.println();
        System.out.println(mySet);
        System.out.println(mySet.size());
    }

    public static HashSet<Integer> Setulya(Integer[] arr)
    {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        return hashSet;
    }

    public static Integer[] RandomRandom(int num)
    {
        Random random = new Random();
//        int[] array = new int[random.nextInt(20)];
        Integer[] array = new Integer[1000];

        IntStream.range(0, array.length) // С помощью стрима проходим по всему массиву
                // Заносим рандомное число в ячейку массива
                // Рандомные значения могут быть в диапазоне от 0 до 99 включительно
                .forEach(index -> array[index] = random.nextInt(num));
        return array;
    }

    public static void printArr(Integer[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }
    }
}
