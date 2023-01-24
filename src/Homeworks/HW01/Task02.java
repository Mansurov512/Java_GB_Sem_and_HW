// 02 Вывести все простые числа от 1 до 1000

package Homeworks.HW01;
public class Task02
{
    public static void main(String[] args)
    {
        primeNumbers(1000);
    }
    public static void primeNumbers(int number)
    {
        System.out.println(2); // вручную первое простое число вывожу, оно единственное чётное
        for (int i = 3; i < number; i = i + 2) // проверяем только нечётные
        {
            for (int j = 3; j <= i; j++) // на 2 не делим, так как чётных чисел точно не будет, начинаем делители с цифры 3.
            {
                double result = i % j;
                if (result == 0 && i != j) // если поделило нацело и не является тем же числом, прерываем
                {
                    break;
                }
                if (result == 0 && i == j)  // если условие выполненно, выводим число
                {
                    System.out.println(i);
                }
            }
        }
    }
}
