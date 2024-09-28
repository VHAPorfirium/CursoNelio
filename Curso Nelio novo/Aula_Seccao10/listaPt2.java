package Aula_Seccao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaPt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        Como utilizar:
            1- Tamanho da lista: size<>
            2- Obter o elemento de uma posição: get(position)
            3- Inserir elemento na lista: add(obj), add(int, obj)
            4  - Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
            5- Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
            6- Filtrar lista com base em predicado:
            List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());

            7- Encontrar primeira ocorrência com base em predicado:
            Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
*/

        List<String> list = new ArrayList<>();

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        list.add(nome);
        list.add("Victor");
        list.add("Ninfa");
        list.add("Maju");
        list.add(2, "Alex");

        System.out.println("TAMANHO DA LISTA: " + list.size());

        list.remove(1);
        list.remove("Maju");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------");

        System.out.println("Achar elemento: " + list.indexOf("Victor"));


    }
}
