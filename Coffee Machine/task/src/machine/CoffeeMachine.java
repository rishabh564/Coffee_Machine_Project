package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        System.out.println("> " + a);
        System.out.println("For " + a + " cups of coffee you will need:");
    }
}
