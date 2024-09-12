package aula01;

import java.util.Scanner;

public class questao09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double valor = sc.nextDouble();

        double valorComDesconto = valor - (valor * 0.09);

        System.out.printf("Valor com desconto: R$ %.2f%n", valorComDesconto);

        sc.close();
    }
}
