package academy.devdojo.estruturascondicionais.ifselse.switchcase;

public class Aula01 {
    public static void main(String[] args) {
        int dia = 8;
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabadão");
                break;
            case 7:
                System.out.println("Domingão");
                break;
            default:
                System.out.println("Dia Inválido");
        }
        System.out.println("Fim do Programa");
    }
}
