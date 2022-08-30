import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: summ - 1, max - 2, ");

        int x = console.nextInt();
        if(x==1){SUMM(console);}
        else if(x==2){MAX(console);}

    //это я добавил 30:08:22 в 16:50
    }

    static void SUMM(Scanner console) {
        System.out.println("посчитаем сумму");
        int sum = 0;
            while (console.hasNextInt()) {
                int x = console.nextInt();
                sum = sum + x;
            }
            System.out.println(sum);

        }

    static void MAX(Scanner console) {
        System.out.println("посчитаем максимум");
        int max = 0;
            while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x > max)
                max = x;
            }
        System.out.println(max);
    }
}
