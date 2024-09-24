package aula04.exer01;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + (x * i));

        }
    }
}
