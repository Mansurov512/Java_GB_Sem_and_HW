package Seminars.S02;
import java.io.FileWriter;
import java.util.logging.Logger;
public class Task001 {

        public static void main(String[] args) {


            try (FileWriter writer = new FileWriter("hello")){


                // запись всей строки
                String text = "withput wlush";
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.append('E');


            }catch (Exception exception){}
            Logger logger = Logger.getAnonymousLogger();
            logger.warning("We wrote a file");

        }
    }


