//        Вывести данные по сотрудникам с фамилией Иванов.
//        Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//        Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//
//        1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//        2. буква может не меняться, а остаться такой же. (Например, note - code)
//
//        Пример 1:
//        Input: s = "foo", t = "bar"
//        Output: false
//        Пример 2:
//        Input: s = "paper", t = "title"
//        Output: true
package Seminars.S05;

public class Task02
{
    public static void main(String[] args)
    {
        String str1 = "note";
        String str2 = "code";
        Boolean izo = Izomorfff(str1, str2);
        System.out.println(izo);
    }

    public static Boolean Izomorfff(String str1, String str2)
    {
        Boolean res = false;
        if (str1.length() != str2.length())
        {
            return res;
        }
        for (int i = 1; i < str1.length(); i++)
        {
            if (str1.charAt(i - 1) != str1.charAt(i) && str2.charAt(i - 1) != str2.charAt(i))
            {
                continue;
            } else if (str1.charAt(i - 1) == str1.charAt(i) && str2.charAt(i - 1) == str2.charAt(i))
            {
                continue;
            } else return res;
        }
        return !res;
    }
}
