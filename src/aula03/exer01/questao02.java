package aula03.exer01;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");

        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Infantil B");

        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");

        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");

        } else if (idade >= 18) {
            System.out.println("Adulto");

        } else {
            System.out.println("Não pode nadar!");

        }

        sc.close();
    }
}
