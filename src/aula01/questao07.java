package aula01;

import java.util.Scanner;

public class questao07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        sc.nextLine();

        int dias = idade * 365;

        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de dias vividos: " + dias);
    }
}
