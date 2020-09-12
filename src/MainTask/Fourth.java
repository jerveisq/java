package MainTask;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class Fourth {
    public static void main(String[] args) {
        int sum = 0;
        int mult = 1;
        for (int i = 0; i<args.length; i++){
            int nums = Integer.parseInt(args[i]);
            sum +=nums;
            mult *=nums;
        }
        System.out.println("The sum of your nums is: " + sum);
        System.out.println("The multiplication of your nums is: " + mult);
    }
}