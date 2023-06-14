import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int anoAtual, anoNascimento;
        String nome;
        Scanner scan = new Scanner(System.in);
        anoAtual = scan.nextInt();
        nome = scan.next();
        anoNascimento = scan.nextInt();
        System.out.println(nome+ ", voce completa " + (anoAtual - anoNascimento) + " anos de idade neste ano.");
    }
}
