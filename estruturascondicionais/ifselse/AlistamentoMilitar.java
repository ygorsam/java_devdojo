package academy.devdojo.estruturascondicionais.ifselse;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 18;

        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("Alistamento não permitido");

        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento Obrigatório");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Você deseja se alistar?");
        }
    }
}
