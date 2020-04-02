import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = 0;
        if (b < c)
            n = 1;
        if (n == 1) {
            if ((a >= b) && (a <= c))
                System.out.println(true);
            else
                System.out.println(false);
        } else {
            if ((a <= b) && (a >= c))
                System.out.println(true);
            else
                System.out.println(false);
        }
    }
}