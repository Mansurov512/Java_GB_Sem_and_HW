package Seminars.S01;

import java.util.Scanner;
import java.time.LocalTime;
public class Task02 {

    public static void main(String[] args) {
        System.out.println("Enter username:");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();

        int hour = LocalTime.now().getHour();

        if (hour >= 5 && hour < 12) {
            System.out.printf("Доброе утро %s!", userName);
        } else if (hour >= 12 && hour < 18) {
            System.out.printf("Добрый день %s!", userName);
        } else if (hour >= 18 && hour < 23) {
            System.out.printf("Добрый вечер %s!", userName);
        } else {
            System.out.printf("Доброй ночи %s!", userName);
        }
    }

}
