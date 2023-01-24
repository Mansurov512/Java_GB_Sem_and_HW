//Напишите метод, который составит строку,
// состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл,
// обработайте исключения.

package Seminars.S02;
import java.io.*;
import java.io.FileWriter;
import java.util.logging.Logger;

public class Task04
{
    public class Seminar_02_task04
    {
        public static void main(String[] args)
        {

            String str = "TEST";
            String res = repeatStr(str);
            writingToFile(res);

        }
        public static String repeatStr(String str)
        {
            StringBuilder resStr = new StringBuilder();
            for (int i = 0; i < 100; i++)
            {
                resStr.append(str + "\n");
            }
            String res = resStr.toString();
            return res;
        }
        public static void writingToFile(String str)
        {
            try (FileWriter fw = new FileWriter("file.txt", false))
            {
                fw.write(str);
            } catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}
