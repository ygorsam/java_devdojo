package academy.devdojo.variaveis;

public class CalculardoraImposto {
    public static void main(String[] args) {
        float salario = 2500.00F;
        float porcentagem = 30;
        float porcentagemDoSalario = salario * (porcentagem / 100);

        System.out.println(porcentagemDoSalario);
    }
}
