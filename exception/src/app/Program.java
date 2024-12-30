package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method2();
        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next(); // Pra consumir o input errado e não quebrar o loop
        } catch (InputMismatchException e) {
            System.out.println("Input error");
            sc.next(); // Pra consumir o input errado
        } finally {
            sc.close(); // Fecha o scanner no lugar certo
        }
        System.out.println("***METHOD2 END***");
    }
}
