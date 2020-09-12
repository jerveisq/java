package MainTask;

// Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("argue are = " + str);
        }
        for (int i = args.length-1; i>-1; i--) {
            System.out.println("inside-out: " + args[i]);
        }
    }
}