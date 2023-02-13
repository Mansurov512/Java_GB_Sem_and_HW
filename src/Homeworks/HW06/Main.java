package Homeworks.HW06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int parameter;
        String temp1;
        boolean flag = true;

        Laptop compik01 = new Laptop(8, 512, 14, 2, 20000);
        Laptop compik02 = new Laptop(16, 512, 15, 2.5, 25000);
        Laptop compik03 = new Laptop(16, 1024, 15, 2.5, 30000);
        Laptop compik04 = new Laptop(32, 1024, 15, 3, 35000);
        Laptop compik05 = new Laptop(32, 2048, 16, 2.2, 40000);
        Laptop compik06 = new Laptop(16, 2048, 17, 3, 50000);

        ArrayList<Laptop> Laptopss = new ArrayList<Laptop>(Arrays.asList(compik01, compik02, compik03, compik04, compik05, compik06));

        ArrayList<String> quaryList = new ArrayList<String>(5); //ArrayList peoplerr = new ArrayList();
        for (int i = 0; i < 5; i++) //заполняем список, чтобы присваивать значения по индексам
        {
            quaryList.add("-1");
        }

        Scanner NumberSwitch = new Scanner(System.in);

        while (flag)//вводим параметры поиска
        {
            System.out.println("Введите номер параметра для добавления критерия поиска:\n" +
                    "1 - Объём RAM в Гб;\n" +
                    "2 - Объём HDD в Гб;\n" +
                    "3 - Диагональ в дюймах;\n" +
                    "4 - Частота процессора в ГГц;\n" +
                    "5 - Цена;\n" +
                    "Введите любую другую цифру или число для завершения ввода параметров;\n");

            parameter = NumberSwitch.nextInt();

            switch (parameter)
            {
                case 1:
                    System.out.println("Укажите Объём RAM в Гб:");
                    temp1 = NumberSwitch.next();
                    quaryList.set(0, temp1);
                    break;
                case 2:
                    System.out.println("Укажите Объём HDD в Гб:");
                    temp1 = NumberSwitch.next();
                    quaryList.set(1, temp1);
                    break;
                case 3:
                    System.out.println("Укажите Диагональ в дюймах:");
                    temp1 = NumberSwitch.next();
                    quaryList.set(2, temp1);
                    break;
                case 4:
                    System.out.println("Укажите Частоту процессора в ГГц:");
                    temp1 = NumberSwitch.next();
                    quaryList.set(3, temp1);
                    break;
                case 5:
                    System.out.println("Укажите стоимость:");
                    temp1 = NumberSwitch.next();
                    quaryList.set(4, temp1);
                    break;
                default:
                    System.out.println("Ввод параметров окончен.");
                    flag = false;
                    break;
            }
        }

        System.out.println("Параметры запроса:");
        System.out.println(quaryList);

        //производим поиск перебирая циклом объекты. Если параметр объекта равен или больше, вкупе с остальными параметрами, то подходит.
        //Если параметр не указан, то -1 выступает как заглушка.
        for (int i = 0; i < Laptopss.size(); i++)
        {
            if (
                    (Laptopss.get(i).getValueRAM() >= Integer.parseInt(quaryList.get(0)) || Integer.parseInt(quaryList.get(0)) == -1) &&
                            (Laptopss.get(i).getValueHDD() >= Integer.parseInt(quaryList.get(1)) || Integer.parseInt(quaryList.get(1)) == -1) &&
                            (Laptopss.get(i).getSizeIches() >= Integer.parseInt(quaryList.get(2)) || Integer.parseInt(quaryList.get(2)) == -1) &&
                            (Laptopss.get(i).getFrequencyCPU() >= Double.parseDouble(quaryList.get(3)) || Double.parseDouble(quaryList.get(3)) == -1) &&
                            (Laptopss.get(i).getPrice() >= Double.parseDouble(quaryList.get(4)) || Integer.parseInt(quaryList.get(4)) == -1)

            )
            {
                System.out.printf("Подойдёт compik0%d\n", i + 1);
            }

        }
    }
}