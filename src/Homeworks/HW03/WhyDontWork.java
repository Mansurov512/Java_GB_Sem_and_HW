package Homeworks.HW03;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyDontWork
{
        public static void main(String[] args)
        {
            int[] arrayRandom = {15, 14, 15, 1, 6, 13, 0, 10, 13, 12, 18, 4}; //[15, 14, 15, 1, 6, 13, 0, 10, 13, 12, 18, 4]

            ArrayList<Integer> arrayList = new ArrayList<>(arrayRandom.length);
            for (int i = 0; i < arrayRandom.length; i++)
            {
                arrayList.set(i, arrayRandom[i]); //почему set так не работает??? Потому что пустой список,
                                                  // а set только для тех индексов в которые уже что-то было записано?
                //arrayList.add(arrayRandom[i]);

            }

            System.out.println(Arrays.toString(arrayRandom));

        }
}
