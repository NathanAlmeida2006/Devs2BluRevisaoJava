package aula01;

import java.util.Scanner;

public class questao05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de minutos usados:");
        int minutos = sc.nextInt();

        double horas = minutos / 60.0;

        double valor = horas * 2.30;

        System.out.printf("Valor a ser pago: R$ %.2f%n", valor);

        sc.close();
    }
}
