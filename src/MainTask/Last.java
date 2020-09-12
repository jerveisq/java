package MainTask;

//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class Last {
    public static void main(String[] args) {
        //user enters number of month
        System.out.println("Enter the number of month (1-12)");
        Scanner numOfMonth = new Scanner(System.in);
        String setNumOfMonth = numOfMonth.nextLine();
        switch(setNumOfMonth){
            case "1":
                System.out.println("January");
                break;
            case "2":
                System.out.println("February");
                break;
            case "3":
                System.out.println("March");
                break;
            case "4":
                System.out.println("April");
                break;
            case "5":
                System.out.println("May");
                break;
            case "6":
                System.out.println("June");
                break;
            case "7":
                System.out.println("July");
                break;
            case "8":
                System.out.println("August");
                break;
            case "9":
                System.out.println("September");
                break;
            case "10":
                System.out.println("October");
                break;
            case "11":
                System.out.println("November");
                break;
            case "12":
                System.out.println("December");
                break;
            //Check if the number of month is wrong
            default:
                System.out.println("Acceptable numbers are 1-12");
                break;
        }
    }
}
