// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Homeworks.HW03;
import java.util.ArrayList;
public class Task03
{
    public static void main (String[] args)
    {
        int[] arrayRandom = Task01.RandomRandom();

        ArrayList<Integer> arrayList = new ArrayList<>(arrayRandom.length);
        for (int i = 0; i < arrayRandom.length; i++) //наполняем наш список
        {
            arrayList.add(arrayRandom[i]);
        }
        System.out.println(arrayList.toString());

        int numberMin = arrayList.get(0);
        int numberMax = arrayList.get(0);
        double sumCounter = arrayList.get(0);
        for (int j = 1; j < arrayList.size(); j++)
        {
            int number = arrayList.get(j);
            sumCounter = sumCounter + arrayList.get(j); // не забыть добавить ещё нулевой элемент

            if (number > numberMax)
            {
                numberMax = number;
            }
            if (number < numberMin)
            {
                numberMin = number;
            }
        }
        double avarageSum = sumCounter / arrayList.size();

        System.out.printf("Минимальное: %d,\nМаксимальное: %d,\nСреднее арифметическое: %f / %d = %f\n",
                numberMin, numberMax, sumCounter, arrayList.size(), avarageSum);

    }
}