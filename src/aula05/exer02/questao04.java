package aula05.exer02;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] clientes = new String[5];
        int[] quantDvds = new int[5];

        for (int i = 0; i < clientes.length; i++) {
            System.out.print("Digite o nome do cliente " + (i + 1) + ": ");
            clientes[i] = sc.nextLine();
            System.out.print("Digite a quantidade de DVDs locados por " + clientes[i] + " : ");
            quantDvds[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Clientes e suas locações grátis:");
        for (int i = 0; i < clientes.length; i++) {
            int locacoesGratis = quantDvds[i] / 10;
            System.out.println(clientes[i] + " tem direito a " + locacoesGratis + " locação/locações grátis.");
        }

        sc.close();
    }
}
