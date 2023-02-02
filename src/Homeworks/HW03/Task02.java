// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа
package Homeworks.HW03;
import java.util.ArrayList;
public class Task02
{
    public static void main(String[] args)
    {
        int[] arrayRandom = Task01.RandomRandom();

        ArrayList<Integer> arrayList = new ArrayList<>(arrayRandom.length);
        for (int i = 0; i < arrayRandom.length; i++) //наполняем наш список
        {
            arrayList.add(arrayRandom[i]);
        }

        System.out.println(arrayList.toString());//выводим изначальный список

        for (int j = 0; j < arrayList.size(); j++)
        {
            int temp = arrayList.get(j);
            if (temp % 2 == 0)
            {
                arrayList.remove(j);
                --j; //так как список сдвигается при удалении элемента, нужно будет пройтись по индексу ещё раз
            }
        }
        System.out.println(arrayList.toString()); //выводим итоговый результат
    }
}