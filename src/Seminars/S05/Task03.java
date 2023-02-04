//        Написать программу, определяющую правильность расстановки скобок в выражении.
//
//        Пример 1: a+(d*3) - истина
//        Пример 2: [a+(1*3) - ложь
//        Пример 3: [6+(3*3)] - истина
//        Пример 4: {a}[+]{(d*3)} - истина
//        Пример 5: <{a}+{(d*3)}> - истина
//        Пример 6: {a+]}{(d*3)} - ложь

package Seminars.S05;

public class Task03
{
    public static void main(String[] args) {
        String str = "[a+(1*3)]";
        Boolean a = Bracket(str);
        System.out.println(a);
    }
    public static Boolean Bracket(String str) {
        Boolean res = true;
        String openBracket = "([{<";
        String closeBracket = ")]}>";
        int[] array = new int[]{0, 0, 0, 0};
        for (int i = 0; i < str.length(); i++) {
            if (openBracket.indexOf(str.charAt(i)) == 0) {
                array[0]++;
            }
            else if (closeBracket.indexOf(str.charAt(i)) == 0) {
                array[0]--;
            }
            else if (openBracket.indexOf(str.charAt(i)) == 1) {
                array[1]++;
            }
            else if (closeBracket.indexOf(str.charAt(i)) == 1) {
                array[1]--;
            }
            else if (openBracket.indexOf(str.charAt(i)) == 2) {
                array[2]++;
            }
            else if (closeBracket.indexOf(str.charAt(i)) == 2) {
                array[2]--;
            }
            else if (openBracket.indexOf(str.charAt(i)) == 3) {
                array[3]++;
            }
            else if (closeBracket.indexOf(str.charAt(i)) == 3) {
                array[3]--;
            }
        }
        for (int i = 0; i < array.length ; i++) {
            if (array[i] != 0) {
                res = false;
            }
        }
        return res;
    }
}
