package Homeworks.HW06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Laptop compik01 = new Laptop(8, 512, 14, 2, 20000, "No");
        Laptop compik02 = new Laptop(16, 512, 15, 2.5, 25000, "Windows");
        Laptop compik03 = new Laptop(16, 1024, 15, 2.5, 30000, "Windows");
        Laptop compik04 = new Laptop(16, 1024, 15, 3, 35000, "Windows");
        Laptop compik05 = new Laptop(16, 1024, 16, 3, 40000, "Windows");
        Laptop compik06 = new Laptop(16, 2048, 17, 3, 50000, "Windows");

        Set<Laptop> Laptops = new HashSet<>(Arrays.asList(compik01, compik02, compik03, compik04, compik05, compik06));
        ArrayList<Object> quaryList = new ArrayList<Object>(6); //ArrayList peoplerr = new ArrayList();
        for (int i = 0; i < 6; i++) //заполняем список, чтобы присваивать значения по индексам
        {
            quaryList.add(-1);
        }

//        if(compik01.getFrequencyCPU() > 0)
//        {
//            System.out.println("Работает!");
//        }

    }

    public void searchLaptop()
    {
        int parameter;
        Scanner NumberSwitch = new Scanner(System.in);

        System.out.println("Введите номер параметра для добавления критерия поиска:\n" +
                "1 - Объём RAM в Гб;\n" +
                "2 - Объём HDD в Гб;\n" +
                "3 - Диагональ в дюймах;\n" +
                "4 - Частота процессора в ГГц;\n" +
                "5 - Цена;\n" +
                "6 - Операционная система;\n");

        parameter = NumberSwitch.nextInt();

        switch (parameter)
        {
            case 1:



        }

    }
}
