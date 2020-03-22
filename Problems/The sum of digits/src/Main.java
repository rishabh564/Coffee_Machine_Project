import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = 0;
        int sum = 0;
        while (a > 0) {
            r = a % 10;
            sum += r;
            a = a / 10;
        }
        System.out.println(sum);
    }
}