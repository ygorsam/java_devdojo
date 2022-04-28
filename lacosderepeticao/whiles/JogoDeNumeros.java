package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class JogoDeNumeros {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1: Enter a number from 1 to 10: ");
            int num1 = scanner.nextInt();
            System.out.println("PLAYER 2: Enter a number from 1 to 10: ");
            int num2 = scanner.nextInt();
            System.out.println("Got! "+(num1 == num2));
            System.out.println("---------------------------------------");
            System.out.println("Do you wish to continue??");
            System.out.println("1. Yes");
            System.out.println("2. No");
            desejaContinuar = scanner.nextInt();
        }while (desejaContinuar == 1);
        System.out.println("Thanks for Playing!");
    }
}
