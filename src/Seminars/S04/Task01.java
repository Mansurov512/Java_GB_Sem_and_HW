//        Реализовать консольное приложение, которое:
//
//        1. Принимает от пользователя строку вида
//
//        text~num
//
//        1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//        2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package Seminars.S04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01
{

    public static String[] spliter(String a) {
        String[] words = a.split("~");
        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String[] result = spliter(text);
        System.out.println(Arrays.toString(result));
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i <= Integer.parseInt(result[1]); i++) {
            arr.add("0");
        }
        arr.set(Integer.parseInt(result[1]), result[0]);
        System.out.println(arr.toString());
        String textPrint = sc.next();
        result = spliter(textPrint);
        arr.remove(Integer.parseInt(result[1]));
        System.out.println(arr.toString());
    }


}
