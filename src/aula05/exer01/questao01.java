package aula05.exer01;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um valor: ");
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i];

        }

        System.out.print("Vetor A: ");
        for (int j : vetorA) {
            System.out.print(j + " ");

        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int j : vetorB) {
            System.out.print(j + " ");

        }

        sc.close();
    }
}
