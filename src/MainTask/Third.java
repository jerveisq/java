package MainTask;

// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.ArrayList;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        System.out.println("Enter the range of numbers");
        Scanner range = new Scanner(System.in);
        int setRange = range.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < setRange; i++) {
            int randomNum = (int) (Math.random() * 9);
            randomNum++;
            list.add(randomNum);
            System.out.print(list.get(i) + " ");
        }
        for (int num : list) {
            System.out.println(num);
        }
    }
}
