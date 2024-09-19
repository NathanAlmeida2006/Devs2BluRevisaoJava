package aula03.exer02;

import java.util.Objects;
import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double compra = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a forma de pagamento:");
        String pagamento = sc.nextLine();

        if(Objects.equals(pagamento, "Dinheiro") && compra >= 100) {
            compra = compra - (compra * 0.10);
        }

        System.out.printf("Valor final para pagar: R$ %.2f%n", compra);
    }
}
