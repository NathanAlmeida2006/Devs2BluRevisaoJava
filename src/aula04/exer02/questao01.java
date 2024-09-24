package aula04.exer02;

public class questao01 {
    public static void main(String[] args) {
        double chico = 1.50;
        double juca = 1.10;
        int anos = 0;

        while (juca <= chico) {
            chico += 0.02;
            juca += 0.03;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que Juca seja maior que Chico.");
    }
}
