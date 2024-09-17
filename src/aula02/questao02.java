package aula02;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Infome o valor do lado: ");
        double lado = sc.nextDouble();

        System.out.println("Valor da área: " + Math.pow(lado, 2));
    }
}
