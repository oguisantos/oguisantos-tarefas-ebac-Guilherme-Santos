package Tarefa_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoasSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        String[] nomeSexo;
        String nome;

        System.out.println("Digite seu nome e sexo separados por hífen ou \"sair\" para encerrar o programa: ");
        while (true) {
            nomeSexo = scanner.nextLine().split("-");

            if (nomeSexo[0].equalsIgnoreCase("SAIR")) {
                break;
            } else if (nomeSexo[1].equalsIgnoreCase("M")) {
                homens.add(nomeSexo[0]);
            } else if (nomeSexo[1].equalsIgnoreCase("F")) {
                mulheres.add(nomeSexo[0]);
            }
        }

        System.out.println();
        System.out.println("Homens: ");
        for (String elemento : homens) {
            System.out.println(elemento);
        }

        System.out.println();
        System.out.println("Mulheres: ");
        for (String elemento : mulheres) {
            System.out.println(elemento);
        }
    }
}