package ATV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteLigada<String> biblioteca = new ListaDuplamenteLigada<>();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar livro no começo");
            System.out.println("2. Adicionar livro no final");
            System.out.println("3. Remover livro do começo");
            System.out.println("4. Remover livro do final");
            System.out.println("5. Buscar livro por ID");
            System.out.println("6. Exibir livros (ordem original)");
            System.out.println("7. Exibir livros (reversa)");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do livro: ");
                    String idInicio = sc.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String tituloInicio = sc.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorInicio = sc.nextLine();
                    biblioteca.adicionarPrimeiro(idInicio + " - " + tituloInicio + " - " + autorInicio);
                    break;

                case 2:
                    System.out.print("Digite o ID do livro: ");
                    String idFim = sc.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String tituloFim = sc.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorFim = sc.nextLine();
                    biblioteca.adicionar(idFim + " - " + tituloFim + " - " + autorFim);
                    break;

                case 3:
                    biblioteca.removerPrimeiro();
                    break;

                case 4:
                    biblioteca.removerUltimo();
                    break;

                case 5:
                    System.out.print("Digite o ID do livro para buscar: ");
                    String idBusca = sc.nextLine();
                    biblioteca.buscarPorId(idBusca);
                    break;

                case 6:
                    biblioteca.imprimirLista();
                    break;

                case 7:
                    biblioteca.imprimirReverso();
                    break;

                case 0:
                    System.out.println("Programa Encerrado");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
        sc.close();
    }
}