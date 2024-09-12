package aula01;

import java.util.Scanner;

public class questao10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário-base do funcionário: R$ ");

        double salarioBase = sc.nextDouble();
        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;
        double salarioReceber = salarioBase + gratificacao - imposto;

        System.out.printf("Salário-base: R$ %.2f%n", salarioBase);
        System.out.printf("Gratificação: R$ %.2f%n", gratificacao);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Salário a receber: R$ %.2f%n", salarioReceber);

        sc.close();
    }
}
