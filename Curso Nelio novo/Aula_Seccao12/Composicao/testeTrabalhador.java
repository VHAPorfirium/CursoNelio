package Aula_Seccao12.Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class testeTrabalhador {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dfs = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Dados do trabalhor: ");
        System.out.print("Name: ");
        String nome = sc.nextLine();

        System.out.print("Nivel: ");
        String nivel = sc.nextLine();

        System.out.print("Salario base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalho.valueOf(nivel), salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos o trabalhador vai ter? ");
        int contratos = sc.nextInt();

        for (int i = 1; i <= contratos; i++) {
            System.out.println("Contrato " + i + " data: ");
            System.out.print("DATA: (DD/MM/YYYY): ");
            Date dataContrato = dfs.parse(sc.next());
            System.out.print("Valor por hora: ");
            double hora = sc.nextDouble();
            System.out.print("Duração do contrado: ");
            int horas = sc.nextInt();

            HorasContratadas contratadas = new HorasContratadas(dataContrato, hora, horas);
            trabalhador.adicionarContrato(contratadas);
        }
        System.out.println();

        System.out.print("Digite o mes e o ano para calcular o salario: (mm/yyyy) ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3, 7));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Valor ganho: " + mesEano + ": " + String.format("%.2f", trabalhador.calculo(ano, mes))  );

        sc.close();
    }
}
