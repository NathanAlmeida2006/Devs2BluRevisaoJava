package aula04.exer02;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int primo = sc.nextInt();
        System.out.println(ehPrimo(primo) ? "É primo" : "Não é primo");
    }

    public static boolean ehPrimo(int primo) {
        if (primo < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(primo); i++) {
            if (primo % i == 0) {
                return false;
            }
        }
        return true;
    }
}
