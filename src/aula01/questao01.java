package aula01;

import java.util.Scanner;

public class questao01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um salário:");
        double salario = sc.nextDouble();

        double reajuste = salario + (salario * 0.01);

        System.out.println("Salário com reajuste: " + reajuste);

    }
}
