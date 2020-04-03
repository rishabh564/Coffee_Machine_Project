import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 1)
            System.out.println("no army");
        else if (a >= 1 && a <= 19)
            System.out.println("pack");
    }
}