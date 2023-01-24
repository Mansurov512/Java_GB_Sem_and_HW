// Реализовать простой калькулятор
//
// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
//
// Задачи с урока:
// 5*. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
//
// 6*.Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//
// Если общего префикса нет, вернуть пустую строку "".

package Homeworks.HW01;

import java.util.Scanner;
public class Task03dontWork
{
    public static void main(String[] args)
    {
        System.out.println(Calculator());
    }
    public static double Calculator()
    {
        double result = 0;

        Scanner Calc = new Scanner(System.in);
        System.out.print("Введите действие которое хотите сделать:\n" +
                "+ - сложить;\n" +
                "- - вычесть;\n" +
                "* - умножить;\n" +
                "/ - поделить;\n");

        String action = Calc.nextLine();

        System.out.print("Введите первое число: ");
        double num01 = Calc.nextDouble();

        System.out.print("Введите второе число: ");
        double num02 = Calc.nextDouble();

        if (action == "+") result = num01 + num02; //почему-то не работатет сравнение, выдаёт false

        if (action == "-") result = num01 - num02;

        if (action == "*") result = num01 * num02;

        if (action == "/") result = num01 / num02;

        return result;

        //Calc.close();
    }
}
