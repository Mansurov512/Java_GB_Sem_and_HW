// 01 Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homeworks.HW01;

public class Task01
{
    public static void main(String[] args)
    {
        int number = 4; // вводим необходимое число
        System.out.println(TringleNumber(number)); //расчёт треугольного числа
        System.out.println(Factarial(number)); //расчёт факториала
    }
    public static int TringleNumber(int number)
    {
        int tN = (number * (number + 1)) / 2;
        return tN;
    }
    public static int Factarial(int number) //не люблю рекурсии из-за их сложности восприятия, потому решаю другим путём
    {
        int result = 1;
        for (int i = 1; i <= number; i++)
        {
            result = result * i;
        }
        return result;
    }
}