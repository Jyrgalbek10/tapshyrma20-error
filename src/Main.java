import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("San berin");

        while (true) {
            int a = scanner.nextInt();
            System.out.println("San berin");
            int b = scanner.nextInt();
            int v = a + b;
            if (v <= 0)
                try {
                    throw new ArithmeticException("folse " + v);
                } catch (ArithmeticException e) {
                    System.out.println("Povtor " + v);
                }
            }
        }
    }
