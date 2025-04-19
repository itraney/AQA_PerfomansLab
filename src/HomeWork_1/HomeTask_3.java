package HomeWork_1;

public class HomeTask_3 {

    public static void main(String[] args) {

        int n = 126;
        int a = n/100;
        int b = n%10;
        int c = (n-(a*100+b))/10;

        System.out.println(c+b+a);
    }
}

