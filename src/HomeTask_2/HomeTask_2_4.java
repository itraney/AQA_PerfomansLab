package HomeTask_2;

/*
Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */
public class HomeTask_2_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;

        while (a * b <= 100) {
            System.out.print(a * b + ", ");
            a++;
        }
    }
}
