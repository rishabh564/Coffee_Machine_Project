import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 0;
        int r = 0;
        int k = a;
        while (a > 0) {
            n = a % 10;
            r = (r * 10) + n;
            a = a / 10;
        }
        if (k == r)
            System.out.println(1);

    }
}