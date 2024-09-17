package aula02;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valor de a:");
        double a = sc.nextDouble();

        System.out.println("Digite valor de b:");
        double b = sc.nextDouble();

        System.out.println("Digite valor de c:");
        double c = sc.nextDouble();

        System.out.println("Digite valor de d:");
        double d = sc.nextDouble();

        System.out.println("Digite valor de e:");
        double e = sc.nextDouble();

        System.out.println("Digite valor de f:");
        double f = sc.nextDouble();

        double deno = a * e - b * d;
        double x = (c * e - b * f) / deno;
        double y = (a * f - c * d) / deno;

        System.out.println("Valor de X: " + x);
        System.out.println("Valor de Y: " + y);
    }
}
