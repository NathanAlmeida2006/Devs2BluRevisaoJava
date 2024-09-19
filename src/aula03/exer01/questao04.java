package aula03.exer01;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma operação: ");
        String op = sc.nextLine();

        System.out.print("N1: ");
        double n1 = sc.nextDouble();
        System.out.print("N2: ");
        double n2 = sc.nextDouble();

        System.out.println(calcular(op, n1, n2));
        sc.close();
    }

    public static double calcular(String op, double n1, double n2) {

        return switch (op) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> {
                System.out.println("Sinal inválido!");
                yield 0;
            }
        };
    }
}
