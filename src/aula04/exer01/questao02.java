package aula04.exer01;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("Digite um valor");
            x = sc.nextInt();

        } while (x != 0);
        System.out.println("Adeus!");

    }
}
