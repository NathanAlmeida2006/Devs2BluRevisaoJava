package aula05.exer02;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas foram entrevistadas? ");
        int numPessoas = sc.nextInt();
        sc.nextLine();

        String[][] pesquisa = new String[numPessoas][];

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Quantos filhos a pessoa " + (i + 1) + " tem? ");
            int numFilhos = sc.nextInt();
            sc.nextLine();

            pesquisa[i] = new String[numFilhos];
            for (int j = 0; j < numFilhos; j++) {
                System.out.print("Nome do filho " + (j + 1) + ": ");
                pesquisa[i][j] = sc.nextLine();
            }
        }

        System.out.println();
        System.out.println("Resultados da Pesquisa:");
        System.out.println("Número de pessoas entrevistadas: " + numPessoas);
        for (int i = 0; i < pesquisa.length; i++) {
            System.out.println("Pessoa " + (i + 1) + " tem " + pesquisa[i].length + " filhos.");
            for (int j = 0; j < pesquisa[i].length; j++) {
                System.out.println("  Filho " + (j + 1) + ": " + pesquisa[i][j]);
            }
        }
    }
}
