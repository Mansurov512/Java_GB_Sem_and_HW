// 03 Реализовать простой калькулятор

package Homeworks.HW02;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Task02
{
    public static void main(String[] args) throws IOException

    {
        System.out.println(Calculator());
    }
    public static double Calculator() throws IOException
    {
        Logger logger = Logger.getLogger(Task01.class.getName());
        FileHandler fh = new FileHandler("src/Homeworks/HW02/logTask02.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        double result = 0;

        Scanner Calc = new Scanner(System.in);
        System.out.print("Введите действие которое хотите сделать:\n" +
                "+ - сложить;\n" +
                "- - вычесть;\n" +
                "* - умножить;\n" +
                "/ - поделить;\n");

        String action = Calc.nextLine();
        logger.info("Пользователь ввёл " + action);

        System.out.print("Введите первое число: \n");
        double num01 = Calc.nextDouble();
        logger.info("Пользователь ввёл " + num01);

        System.out.print("Введите второе число: ");
        double num02 = Calc.nextDouble();
        logger.info("Пользователь ввёл " + num02);

        switch(action){
            case "+":
                result = num01 + num02;
                break;
            case "-":
                result = num01 - num02;
                break;
            case "*":
                result = num01 * num02;
                break;
            case "/":
                result = num01 / num02;
                break;
            default:
                logger.log(Level.WARNING, "Пользователь ввёл некорректное " + action);
                result = -1; //при некорректном вводе действия
        }
        logger.info("Результат равен " + result);
        return result;
    }
}
