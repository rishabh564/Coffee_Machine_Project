import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && b < c)
            System.out.println(true);
        else if (a > b && b > c)
            System.out.println(true);
        else if (a == b && b < c)
            System.out.println(true);
        else if (a < b && b == c)
            System.out.println(true);
        else if (a == b && b == c)
            System.out.println(true);
        else
            System.out.println(false);

    }
}