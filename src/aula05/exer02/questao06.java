package aula05.exer02;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas foram entrevistadas? ");
        int numPessoas = sc.nextInt();
        sc.nextLine();

        String[][] nomesFilhos = new String[numPessoas][];
        int[][] idadesFilhos = new int[numPessoas][];

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Quantos filhos a pessoa " + (i + 1) + " tem? ");
            int numFilhos = sc.nextInt();
            sc.nextLine();

            nomesFilhos[i] = new String[numFilhos];
            idadesFilhos[i] = new int[numFilhos];
            for (int j = 0; j < numFilhos; j++) {
                System.out.print("Nome do filho " + (j + 1) + ": ");
                nomesFilhos[i][j] = sc.nextLine();
                System.out.print("Idade do filho " + (j + 1) + ": ");
                idadesFilhos[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.println();
        System.out.println("Resultados da Pesquisa:");
        System.out.println("Número de pessoas entrevistadas: " + numPessoas);
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filhos.");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("  Filho " + (j + 1) + ": " + nomesFilhos[i][j] + ", Idade: " + idadesFilhos[i][j]);
            }
        }
    }
}
