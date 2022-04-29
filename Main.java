// Principal: 100000
// Annual Interest Rate: 2.35
// Period (Years): 30
// Mortgage $123.52

import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Principal: ");
    int p = scanner.nextInt();

    System.out.println("Annual Interest Rate: ");
    float interestRate = scanner.nextFloat();
    float r = interestRate / 100 * 12;
    System.out.println(r);

    System.out.println("Period (Years): ");
    byte y = scanner.nextByte();
    int n = y * 12;
    System.out.println(n);

    String mortgage = currency.format(
        p * (r * Math.pow(1 + r, n) / Math.pow(1 + r, n) -1)
    );
    System.out.println("You mortage: " + mortgage);
    }
}