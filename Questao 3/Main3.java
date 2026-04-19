import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um numero: ");
        int numero = sc.nextInt();
        imprimirFirbonacci(numero);
        sc.close();
    }
    public static void imprimirFirbonacci(int n) {
        int t1 = 0, t2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(t1 + " ");
            int soma = t1 + t2;
            t1 = t2;
            t2 = soma;
        }
    }
}
