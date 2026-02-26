import java.util.Scanner;
import java.util.Random;

public class LocalizadorDeExtremos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = entrada.nextInt();

        int[] vetor = new int[tamanho];

        int maior;
        int menor;
        int soma = 0;

        // Preenchendo o vetor com números aleatórios
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100); // números de 0 a 99
        }

        // Inicializando maior e menor com o primeiro valor
        maior = vetor[0];
        menor = vetor[0];

        // Mostrando os valores e calculando maior, menor e soma
        System.out.println("\nValores do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");

            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
            }

            soma = soma + vetor[i];
        }

        double media = (double) soma / tamanho;

        System.out.println("\n\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média: " + media);

        entrada.close();
    }
}