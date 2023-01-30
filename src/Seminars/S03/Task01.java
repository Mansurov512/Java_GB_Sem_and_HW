//01 Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

//2.1 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.

//2.2 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

//3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.

//4. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//что на 0й позиции каждого внутреннего списка содержится название жанра,
//а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.

package Seminars.S03;

import java.util.Collections;
import java.util.ArrayList;

public class Task01
{
    public static void main(String[] args)
    {
        ArrayList<Double> nums = new ArrayList<Double>();

        for (int i = 0; i < 10; i++)
        {
            nums.add(Math.random() * 10);
        }
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
    }
}

//{
//        Mercury
//        Venus
//        Earth
//        Mars
//        Jupiter
//        Saturn
//        Uranus
//        Neptune
//
//        }
