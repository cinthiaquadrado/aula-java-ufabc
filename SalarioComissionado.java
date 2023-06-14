import java.util.Scanner;

public class SalarioComissionado {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        float salario, valorVendas, valorExtra, Comissao, salarioLiquido;
        salario = scan.nextFloat();
        valorVendas = scan.nextFloat();
        Comissao = scan.nextFloat();
        valorExtra = valorVendas * (Comissao/100f);
        salarioLiquido = salario + valorExtra;
        System.out.printf("%.2f", salarioLiquido);
    }
}
