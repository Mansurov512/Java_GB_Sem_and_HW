package Seminars.S01;

public class Task01 {

        public static void main(String[] args) {

            int[] array = new int[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1};
            int max_counter = 0;
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    ++counter;
                    if (counter > max_counter) {
                        max_counter = counter;

                    }
                }
                else {
                    counter = 0;
                }
            }
            System.out.println("///// " + max_counter);
        }
    }

