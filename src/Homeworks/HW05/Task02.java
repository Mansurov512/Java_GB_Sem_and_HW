// 02 Пусть дан список сотрудников, написать программу, которая найдет и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности.
package Homeworks.HW05;

import java.util.HashMap;
import java.util.Map;

public class Task02
{
    public static void main(String[] args)
    {
        String[] arrayNames = new String[]
                {
                        "Иван Иванов",
                        "Светлана Петрова",
                        "Кристина Белова",
                        "Анна Мусина",
                        "Анна Крутова",
                        "Иван Юрин",
                        "Петр Лыков",
                        "Павел Чернов",
                        "Петр Чернышов",
                        "Мария Федорова",
                        "Марина Светлова",
                        "Мария Савина",
                        "Мария Рыкова",
                        "Марина Лугова",
                        "Анна Владимирова",
                        "Иван Мечников",
                        "Петр Петин",
                        "Иван Ежов"
                };
        String[] temp = new String[2];
        Map<String, Integer> nameCount = new HashMap<String, Integer>();
        int count = 0;


        for (int i = 0; i < arrayNames.length; i++)
        {
            temp = arrayNames[i].split(" ");
            //System.out.println(temp[0]);
            count = 0;
            if(nameCount.containsKey(temp[0])) // если имя содержится в HashMap
            {
                count = nameCount.get(temp[0]) + 1; // к значению добавляем 1, инкремент кстати не работает
                nameCount.replace(temp[0], count); // и по тому же ключу-имени ставим значение на 1 больше
            }
            else
            {
                nameCount.put(temp[0], 1); // добавляем имя как ключ, и 1 как значение(количество)
            }
        }
        System.out.println(1);



    }
}
