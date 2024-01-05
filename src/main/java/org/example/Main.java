package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un string:");
        String str = scanner.next();
        System.out.println("return string c'est: "+ truncate(str));*/

        SortTesting sortTesting = new SortTesting();
        sortTesting.generateRandomArray();
        sortTesting.printArray();
        System.out.println("-------Sorting-------");
        sortTesting.bubbleSort();
    }

    public static String truncate(String str)
    {
        if(str.length() <= 2)
        {
            return str.replace("A", "");
        }

        String firstTwo = str.substring(0, 2);
        String restOfStr = str.substring( 2);
        return firstTwo.replaceAll("A", "") + restOfStr ;
    }

    public static Boolean firstOneSameOfLastOne(String str)
    {
        if(str.length() <= 1)
        {
            return false;
        } else if (str.length() == 2) {
            return true;
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);
        return firstTwo.equals(lastTwo);
    }
}