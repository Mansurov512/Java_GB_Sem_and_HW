package Seminars.S02;

import java.util.Scanner;
public class Task002 {

     public static void main(String[] args) {
          System.out.println("Введите длину строки");
          Scanner scanner = new Scanner(System.in);
          int n = scanner.nextInt();
          String c1 = "c1";
          String c2 = "c2";
          StringBuilder sB = new StringBuilder();

          for (int i = 0; i < n/2; i++) {
               if (i % 2 == 0) sB.append(c1);
               else sB.append(c2);
          }
          System.out.println(sB);
     }
}
