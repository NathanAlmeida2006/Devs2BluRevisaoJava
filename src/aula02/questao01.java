package aula02;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o cateto 1: ");
        double c1 = sc.nextDouble();

        System.out.println("Digite o cateto 2: ");
        double c2 = sc.nextDouble();

        double hipotenusa = Math.sqrt(c1 * c1 + c2 * c2);

        System.out.println("Hipotenusa: " + hipotenusa);
    }
}
