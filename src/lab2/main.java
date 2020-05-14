package lab2;

import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        while(n != 0){
            s += (n % 10);
            n/=10;
        }
        System.out.println(s + (n/10));
    }
}
