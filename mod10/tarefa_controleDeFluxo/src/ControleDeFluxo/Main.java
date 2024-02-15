package ControleDeFluxo;
import java.util.Scanner;

/**
 * @author GuiSantos
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        nota4 = scanner.nextDouble();
        scanner.close();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}