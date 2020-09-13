package OptionalTask1;

//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner setNumb = new Scanner(System.in);
        System.out.println("Enter the amount of numbers");
        int numb = setNumb.nextInt();
        String[] arr = new String[numb];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number");
            Scanner num = new Scanner(System.in);
            arr[i] = num.nextLine();
        }
        int maxLine = 0;
        int minLine = 0;
        int maxNumb = 0;
        int minNumb = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                maxLine = arr[i].length();
                minLine = arr[i].length();
            }
            if (arr[i].length() > maxLine) {
                maxLine = arr[i].length();
                maxNumb = i;
            } else if (arr[i].length() < minLine) {
                minLine = arr[i].length();
                minNumb = i;
            }
        }
        System.out.println("The longest number is " + arr[maxNumb] + " his length is " + maxLine + "symbols");
        System.out.println("The shortest number is " + arr[minNumb] + " his length is " + minLine + "symbols");
    }
}
