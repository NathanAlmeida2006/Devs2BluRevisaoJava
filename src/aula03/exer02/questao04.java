package aula03.exer02;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n1: ");
        int n1 = sc.nextInt();

        System.out.print("Digite n2: ");
        int n2 = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite uma operação (+, -, *, /): ");
        char op = sc.nextLine().charAt(0);

        int resultado = calcular(n1, n2, op);
        if (resultado != Integer.MIN_VALUE) {
            verificarParOuImpar(resultado);
            verificarPositivoOuNegativo(resultado);
        }

        sc.close();
    }

    public static int calcular(int n1, int n2, char op) {
        int total;
        switch (op) {
            case '+':
                total = n1 + n2;
                break;
            case '-':
                total = n1 - n2;
                break;
            case '*':
                total = n1 * n2;
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return Integer.MIN_VALUE;
                }
                total = n1 / n2;
                break;
            default:
                System.out.println("Operação inválida!");
                return Integer.MIN_VALUE;
        }
        System.out.println("Resultado da operação: " + total);
        return total;
    }

    public static void verificarParOuImpar(int total) {
        String resultado = (total % 2 == 0) ? "O valor é par!" : "O valor é ímpar!";
        System.out.println(resultado);
    }

    public static void verificarPositivoOuNegativo(int total) {
        String resultado = (total >= 0) ? "O valor é positivo!" : "O valor é negativo!";
        System.out.println(resultado);
    }
}
