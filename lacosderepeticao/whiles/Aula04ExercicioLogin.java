package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Malcom";
        final String passoword = "Xis";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite seu Login: ");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha:");
            String passwordDigitado = scanner.nextLine();
            if (login.equals(loginDigitado) && passoword.equals(passwordDigitado)) {
                System.out.println("ACESSO CONCEDIDO");
                break;

            }
                System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}
