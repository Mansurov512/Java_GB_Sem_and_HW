// 03 Реализовать простой калькулятор

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
