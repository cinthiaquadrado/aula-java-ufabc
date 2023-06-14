import java.util.Scanner;

public class Universidade {
    public static void main(String[] args) {
        byte A;
        String U;
        Scanner scan = new Scanner(System.in);
        U = scan.next();
        A = scan.nextByte();
        System.out.println("Voce estuda na " + U + " ha " + A + " anos.");
    }
}
