import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = 0;

        if (a > 0 && (b == 0 && c == 0))
            System.out.println(true);
        else if (a > 0 && (b < 0 && c == 0))
            System.out.println(true);
        else if (a > 0 && (c < 0 && b == 0))
            System.out.println(true);
        else if (a > 0 && (c < 0 && b < 0))
            System.out.println(true);


    }
}