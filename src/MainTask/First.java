package MainTask;

// Приветствовать любого пользователя при вводе его имени через командную строку.


import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        System.out.println("Hellloooo, sweety!\nWhat's your name, pal?");
        Scanner callYourName = new Scanner(System.in);
        String name = callYourName.nextLine();
        System.out.println("Nice to meet you, " + name);
    }
}