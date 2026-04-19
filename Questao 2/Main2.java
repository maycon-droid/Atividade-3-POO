import java.util.Scanner;
import java.util.Arrays;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosEscolhidos = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Escolha o "+ (i + 1) + "º número entre 1 e 60.");
            numerosEscolhidos[i] = sc.nextInt();
            if(numerosEscolhidos[i] < 1 || numerosEscolhidos[i] > 60) {
                System.out.println("Número inválido. Por favor, escolha um número entre 1 e 60.");
                i--;
                continue;
            }
            if(i > 0) {
                for (int j = 0; j < i; j++) {
                    if (numerosEscolhidos[i] == numerosEscolhidos[j]) {
                        System.out.println("Número já escolhido, escolha um numero diferente.");
                        i--;
                        continue;
                    }
                }
            }
        }
        Arrays.sort(numerosEscolhidos);
        for(int n : numerosEscolhidos) {
            System.out.print(n + " ");
        }
        sc.close();
    }
    //função de ordenação bubble sort
    public static void ordenarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }
}
