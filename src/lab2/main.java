package lab2;

import java.util.Scanner;

public class main {
   public static int sum(int n) {

        if (n%10 == n) {
            return n;
        }
        else {
            return n % 10 + sum(n / 10);
        }
    }
    public static void main (String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(sum(n));
    }

}
