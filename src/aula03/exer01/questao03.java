package aula03.exer01;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        int quantLaranja = 60;
        int quantLimao = 80;
        int quantMorango = 20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o fruto: ");
        String fruto = sc.nextLine();

        System.out.println("Informe o valor: ");
        double valor = sc.nextDouble();

        double resultado = calcular(fruto, valor, quantLaranja, quantLimao, quantMorango);
        System.out.println("O valor total é: " + resultado);

        sc.close();
    }

    public static double calcular(String fruto, double valor, int quantLaranja, int quantLimao, int quantMorango) {
        switch (fruto) {
            case "Laranja":
                return valor * quantLaranja;
            case "Limão":
                return valor * quantLimao;
            case "Morango":
                return valor * quantMorango;
            default:
                System.out.println("Fruto não reconhecido.");
                return 0;
        }
    }
}
