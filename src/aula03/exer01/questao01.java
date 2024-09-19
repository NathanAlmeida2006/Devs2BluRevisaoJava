package aula03.exer01;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " é par!");

        } else {
            System.out.println(x + " é ímpar!");
        }
    }
}
