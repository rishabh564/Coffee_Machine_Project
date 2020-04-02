import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = sc.nextBoolean();
        if (b == false) {
            if (a >= 10 && a <= 20)
                System.out.println(true);
            else
                System.out.println(false);
        } else {
            if (a >= 15 && a <= 25)
                System.out.println(true);
            else
                System.out.println(false);
        }
    }
}