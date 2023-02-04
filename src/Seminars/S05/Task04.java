//        Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022


//        Написать метод, который переведёт данное целое число в римский формат.
//        Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
//
//        Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.

package Seminars.S05;

import java.util.HashMap;

public class Task04
{
    public static void main(String[] args) {
        String str = "LXXXIV";
        Integer res = TranslationNumber(str);
        System.out.println(res);
    }
    public static Integer TranslationNumber(String str) {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
        Integer res = numbers.get(String.valueOf(str.charAt(str.length()-1)));
        for (int i = str.length()-2; i >= 0 ; i--) {
            int n = numbers.get(String.valueOf(str.charAt(i)));
            if (i > 0) {
                if (n >= numbers.get(String.valueOf(str.charAt(i+1)))) {
                    res = res + n;
                } else res = res - n;
            } else {
                if (n >= numbers.get(String.valueOf(str.charAt(i+1)))) {
                    res = res + n;
                } else res = res - n;
            }
        }
        return res;
    }
}
