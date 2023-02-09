// 01. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package Homeworks.HW05;

import java.util.*;

public class Task01
{
    public static void main(String[] args)
    {
        Map<Integer, String> phoneBook = new HashMap<Integer, String>();
        phoneBook.put(5532639, "Маша");
        phoneBook.put(3659863, "Маша");
        phoneBook.put(9111723, "Паша");
        phoneBook.put(6917371, "Паша");
        phoneBook.put(8201661, "Кирилл");
        phoneBook.put(7509481, "Кирилл");
        phoneBook.put(3155261, "Таня");
        phoneBook.put(4273443, "Вася");

        Set<Integer> keys = phoneBook.keySet();
        Collection<String> values = phoneBook.values();
        System.out.println(values);
        System.out.println(keys);

        for (Map.Entry<Integer, String> item : phoneBook.entrySet())
        {
            System.out.printf("Телефон: %d,  Имя: %s \n", item.getKey(), item.getValue());
        }

        for (Map.Entry<Integer, String> item : phoneBook.entrySet())//ищем по книге номер(-а) интересующего нас человека
        {
            if (item.getValue().equals("Кирилл"))
            {
                System.out.println(item);
            }

            //System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
    }
}