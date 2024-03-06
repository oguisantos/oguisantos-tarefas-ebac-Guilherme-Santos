package Tarefa_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PessoasOrdemAlfabetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes;

        System.out.println("Digite o nome de pessoas separados por vírgula: ");
        nomes = scanner.nextLine().split(",");

        List<String> listaPessoas = new ArrayList<String>();

        Collections.addAll(listaPessoas, nomes);

        Collections.sort(listaPessoas);

        System.out.println("Pessoas em ordem alfabetica: ");
        for (String nome : listaPessoas) {
            System.out.println(nome);
        }
    }
}