// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).

package Seminars.S02;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите слово и программа скажет является слово полиндромом или нет");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(Polindrom(str));


    }

    public static Boolean Polindrom(String str) {
        Boolean flag = true;//результат
        Boolean flag2 = true;
        while (flag2) {
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    flag = false;
                    flag2 = false;
                }
            }
            if (flag) flag2 = false;
        }
        return flag;
    }


}
