package Seminars.S04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.IntStream;

    public class Task001
    {
        public static void main(String[] args) {
            Logger logger = Logger.getAnonymousLogger();
            logger.info(String.valueOf(calculate()));
            List<Integer> list =new ArrayList<>();
            list.add(3);
            list.add(6);
            list.add(7);
            int[] array = list.stream().flatMapToInt(x -> IntStream.of(x)).toArray();
            System.out.println(Arrays.toString(array));


        }
        public static int[] calculate(){
            return new int[1];
        }
    }

//
//
//

//
//        1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//
//        2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
//
//        Реализовать стэк с помощью массива. Нужно реализовать методы:
//
////        size(), empty(), push(), peek(), pop().
//
//        Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
//
//        [http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181](http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181)
//
//        Вычислить запись если это возможно.

