package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        if (idade <= 10){
            System.out.println(nome + " participará da categoria: Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria: Juvenil");
        }else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria: Pré-Adulto");
        }else {
            System.out.println(nome + " participará da categoria: Adulto");
        }
    }
}
