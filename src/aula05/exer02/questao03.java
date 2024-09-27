package aula05.exer02;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];
        int somaSuperiores = 0;
        int denominadorSuperiores = 0;
        int somaInferiores = 0;
        int quantIguais = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            vetorA[i] = num;

            if (vetorA[i] > 15) {
                somaSuperiores += vetorA[i];
                denominadorSuperiores++;
            } else if (vetorA[i] < 15) {
                somaInferiores += vetorA[i];
            } else {
                quantIguais++;
            }
        }

        double mediaSuperiores = (denominadorSuperiores > 0) ? (double) somaSuperiores / denominadorSuperiores : 0;

        System.out.println("Média superiores a 15: " + mediaSuperiores);
        System.out.println("Soma inferiores a 15: " + somaInferiores);
        System.out.println("Quantidade iguais a 15: " + quantIguais);
    }
}
