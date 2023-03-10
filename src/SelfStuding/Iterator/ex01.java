package SelfStuding.Iterator;

import java.util.*;

public class ex01
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("E");
        list.add("D");
        list.add("U");
        list.add("R");
        list.add("E");
        list.add("K");
        list.add("A");
        // Iterator to traverse the list
        Iterator<String> iterator = list.iterator();
        System.out.println("List elements : ");
        while (iterator.hasNext())
        {
            String str = iterator.next();
            System.out.print(str + " " + str + " ");
        }
        System.out.println();
    }
}