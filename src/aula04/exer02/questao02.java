package aula04.exer02;

public class questao02 {
    public static void main(String[] args) {
        int limiteInferior = 0;
        int limiteSuperior = 10;
        int soma = 0;

        for (int i = limiteInferior + 1; i < limiteSuperior; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
                soma += i;
            }
        }
        System.out.println("Soma: " + soma);
    }
}
