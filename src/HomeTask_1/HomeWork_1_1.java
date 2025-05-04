package HomeTask_1;

import java.util.Scanner;

public class HomeWork_1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение с: ");
        double c = scanner.nextDouble();

    int a = (int) (4*(b+c-1)/2);

    System.out.println(a);
}
}
