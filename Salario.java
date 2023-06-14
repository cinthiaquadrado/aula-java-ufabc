import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        float V;
        int Q;
        float PD;
        Scanner myObject = new Scanner(System.in);
        V = myObject.nextFloat();
        Q = myObject.nextInt();
        PD = myObject.nextFloat();
        float salario_liquido = (V * Q);
        float desconto = (salario_liquido * (PD/100.f));
        float SL = salario_liquido - desconto;
        System.out.printf("%.2f\n", SL);

    }
}