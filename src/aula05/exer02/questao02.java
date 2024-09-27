package aula05.exer02;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];
        int quant = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite uma idade: ");
            int idade = sc.nextInt();
            vetorA[i] = idade;

            if (idade > 35) {
                quant++;
            }
        }

        System.out.println("Quantidade de pessoas que possuem idade superior a 35 anos: " + quant);
        sc.close();
    }
}
