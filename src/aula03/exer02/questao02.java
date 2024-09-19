package aula03.exer02;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite N1: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite N2: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite N3: ");
        double n3 = sc.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = sc.nextDouble();

        double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;

        char conceito =
                mediaAproveitamento >= 9 ? 'A' :
                    mediaAproveitamento >= 7.5 ? 'B' :
                        mediaAproveitamento >= 6 ? 'C' : 'D';

        System.out.printf("O aluno %s obteve média de aproveitamento %.2f e conceito %s.%n",
                nome, mediaAproveitamento, conceito);

        sc.close();
    }
}
