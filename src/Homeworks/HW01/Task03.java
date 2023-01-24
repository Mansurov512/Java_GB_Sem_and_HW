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
public class Task03
{
    public static void main(String[] args)
    {
        System.out.println(Calculator());
    }
    public static double Calculator()
    {
        double result = 0;

        Scanner Calc = new Scanner(System.in);
        System.out.print("Введите цифрами действие которое хотите сделать:\n" +
                "1 - + - сложить;\n" +
                "2 - - - вычесть;\n" +
                "3 - * - умножить;\n" +
                "4 - / - поделить;\n");

        int action = Calc.nextInt();

        System.out.print("Введите первое число: ");
        double num01 = Calc.nextDouble();

        System.out.print("Введите второе число: ");
        double num02 = Calc.nextDouble();

        switch(action){
            case 1:
                result = num01 + num02;
                break;
            case 2:
                result = num01 - num02;
                break;
            case 3:
                result = num01 * num02;
                break;
            case 4:
                result = num01 / num02;
                break;
            default:
                result = -1; //при некорректном вводе действия
        }
        return result;

        //Calc.close();
    }
}
