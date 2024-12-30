package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally { //Deu tudo certo, vem pra cá. É tipo o else do if
            if (sc != null) {
            	System.out.println("O arquivo " + file + " existe!");
                sc.close();
            }
        }
    }
}
