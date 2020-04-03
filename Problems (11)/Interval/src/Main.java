import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a > -15 && a <= 12) || (a > 14 && a < 17) || (a >= 19 && a < Integer.MAX_VALUE))
            System.out.println("True");
        else
            System.out.println("False");
    }
}