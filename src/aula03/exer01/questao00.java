package aula03.exer01;

import java.util.Scanner;

public class questao00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite de 1 - 7:");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quarta-feira");
                break;

            case 5:
                System.out.println("Quinta-feira");
                break;

            case 6:
                System.out.println("Sexta-feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Digite um valor válido.");
        }

        sc.close();
    }
}
