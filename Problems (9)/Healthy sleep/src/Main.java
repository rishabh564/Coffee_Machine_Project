import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        if (h < a)
            System.out.println("Deficiency");
        if (h > b)
            System.out.println("Excess");
    }
}