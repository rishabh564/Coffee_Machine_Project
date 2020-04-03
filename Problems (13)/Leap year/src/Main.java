import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0)
                    System.out.println("Leap");
                else
                    System.out.println("Regular");
            } else
                System.out.println("Leap");
        } else
            System.out.println("Regular");
    }
}