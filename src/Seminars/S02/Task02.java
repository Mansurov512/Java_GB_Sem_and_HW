// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
package Seminars.S02;

public class Task02 {

    public static void main(String[] args) {
        String str = "aaaabbbcdddf";
        StringBuilder resStr = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                resStr.append(count + str.substring(i-1, i));
                count = 1;
            }
            if (i == str.length() - 1) {
                resStr.append(count + str.substring(i));
            }
        }
        System.out.println(resStr);
    }
}

