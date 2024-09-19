package aula03.exer02;

import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (verificarAno(ano)) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }

        sc.close();
    }

    public static boolean verificarAno(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
