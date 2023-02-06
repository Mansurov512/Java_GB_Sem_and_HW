// 3. В калькулятор добавьте возможность отменить последнюю операцию.

package Homeworks.HW04;
import java.io.IOException;
import java.util.Scanner;

public class Task03
{
    public static double num01;
    public static double num02;
    public static int counter = 0;
    public static String action;
    public static String strCommand;
    public static String backCommand = "b";
    public static double result = 0;

    public static void main(String[] args) throws IOException

    {
        System.out.printf("Результат равен %f", Calculator());
    }

    public static double Calculator() throws IOException
    {
        Scanner Calc = new Scanner(System.in);
        while (counter < 4)
        {
            switch (counter)
            {
                case 0:
                    System.out.print("Введите действие которое хотите сделать:\n" +
                            "+ - сложить;\n" +
                            "- - вычесть;\n" +
                            "* - умножить;\n" +
                            "/ - поделить;\n");

                    action = Calc.nextLine();
                    ++counter;
                    break;

                case 1:
                    System.out.print("Введите первое число: \n");
                    strCommand = Calc.nextLine();
                    if (strCommand.equals(backCommand)) // strCommand == "b"
                    {
                        --counter;
                    }
                    else
                    {
                        num01 = Double.parseDouble(strCommand);
                        ++counter;
                    }
                    break;

                case 2:
                    System.out.print("Введите второе число: \n");
                    strCommand = Calc.nextLine();
                    if (strCommand.equals(backCommand))
                    {
                        --counter;
                    }
                    else
                    {
                        num02 = Double.parseDouble(strCommand);
                        ++counter;
                    }
                    break;

                case 3:
                    switch (action)
                    {
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

                            result = -1; //при некорректном вводе действия
                    }
                    ++counter;
                    break;

                default:
                    --counter;; //при любом другом вводе возврат действия
            }
        }
        return result;
    }
}