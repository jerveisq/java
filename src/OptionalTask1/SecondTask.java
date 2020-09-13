package OptionalTask1;

//Вывести на консоль те числа, длина которых меньше средней длины по всем числам, а также длину.

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner setNumb = new Scanner(System.in);
        System.out.println("Enter the amount of numbers");
        int numb = setNumb.nextInt();
        String[] arr = new String[numb];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number");
            Scanner num = new Scanner(System.in);
            arr[i] = num.nextLine();
            sum += arr[i].length();
        }
        sum = sum / numb;
        for (String x : arr) {
            if (x.length() < sum) {
                System.out.println("The number, which length is less than average: " + x + ", it length: " + x.length() + " symbols");
            }
        }
    }
}