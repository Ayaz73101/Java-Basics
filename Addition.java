import java.util.Scanner;

public class Addition {

    Scanner sc = new Scanner(System.in);

    void add(int a, int b) {
        System.out.println("Enter two integers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Enter two double values:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Enter three integers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Sum = " + (a + b + c));
    }

    public static void main(String[] args) {
        Addition a = new Addition();

        a.add(0, 0);        // ← fixed here
        a.add(0.0, 0.0);
        a.add(0, 0, 0);
    }
}