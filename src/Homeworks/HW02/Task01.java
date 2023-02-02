package Homeworks.HW02;
import java.io.IOException;
import java.util.logging.*;

public class Task01
{
    public static void main(String[] args) throws IOException // почему-то IDE попросила добавить throws IOException, когда
                                                              // я указывал FileHandler, видимо на случай ошибок при работе с файлом
    {
        Logger logger = Logger.getLogger(Task01.class.getName());
        FileHandler fh = new FileHandler("src/Homeworks/HW02/logTask01.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int arrayNumbers[] = new int[]{3, 1, 8, 9, 5, 7, 4, 6, 2};

        for (int i = 0; i < arrayNumbers.length; i++)
        {
            for (int j = 1; j < arrayNumbers.length - i; j++)
            {
                int temp = arrayNumbers[j];
                logger.info("Сравниваем " + arrayNumbers[j-1] + " и " + arrayNumbers[j]);

                if (arrayNumbers[j-1] > arrayNumbers[j])
                {
                    logger.info("Меняем местами " + arrayNumbers[j-1] + " и " + arrayNumbers[j]);
                    arrayNumbers[j] = arrayNumbers[j-1];
                    arrayNumbers[j-1] = temp;
                }
                String str = "[";
                for (int k = 0; k < arrayNumbers.length; k++) // не знаю, правильно ли создавать какие-то переменные,
                                                              // только для того, чтобы записать их в лог
                {
                    str = str + arrayNumbers[k] + " ";
                }
                str = str.trim() + "]";
                logger.info("Массив на данной итерации: " + str);
            }
        }
    }
}

