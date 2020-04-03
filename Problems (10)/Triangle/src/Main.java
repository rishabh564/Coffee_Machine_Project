import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b) > c)
            System.out.println("YES");
        else if ((b + c) > a)
            System.out.println("YES");
        else if ((a + c) > b)
            System.out.println("YES");
        else if ((a + b) == c)
            System.out.println("NO");
        else if ((b + c) == a)
            System.out.println("NO");
        else if ((a + c) == b)
            System.out.println("NO");
        else if ((a + b) < c)
            System.out.println("NO");
        else if ((b + c) < a)
            System.out.println("NO");
        else if ((a + c) < b)
            System.out.println("NO");
        else
            System.out.println("NO");

    }
}