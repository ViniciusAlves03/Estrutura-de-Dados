package Projeto;

import java.util.Scanner;

public class BrincandoComArvores {
    public static void menuzin() {
        System.out.print("\n");
        System.out.print("\n#-- Menu Rotina de Treinos --#\n\n");
        System.out.print("|----------------------------|\n");
        System.out.print("| Opção 1 - Procurar         |\n");
        System.out.print("| Opção 2 - Inserir          |\n");
        System.out.print("| Opção 3 - Deletar          |\n");
        System.out.print("| Opção 4 - Sair             |\n");
        System.out.print("|----------------------------|\n");
        System.out.print("\nInforme uma opção: ");
    }

    public static void main(String[] args) {
        ArvoreProjeto bt = new ArvoreProjeto();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menuzin();

            int opcao = scanner.nextInt();
            if (opcao == 4) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nOpção Procurar Treino Selecionada\n");
                    System.out.print("\nInforme o ID: ");

                    int id = scanner.nextInt();

                    if (bt.achou(id) == false) {
                        System.out.print("\nNão encontrado\n");
                    } else {
                        bt.achou(id);
                    }

                    System.out.print("\n");

                    break;

                case 2:
                    System.out.print("\nOpção Inserir Treino Selecionada\n");
                    System.out.print("\nInforme o ID: ");

                    int id2 = scanner.nextInt();
                    if (bt.achou(id2) == true) {
                        System.out.print("\nNão encontrado\n");

                    } 
                    
                    else {
                        bt.insertIn(id2);
                    }

                    break;

                case 3:
                    System.out.print("\nOpção Deletar Treino Selecionada\n");
                    System.out.print("\nInforme o ID: ");

                    int id3 = scanner.nextInt();

                    if (bt.achou(id3) == false) {
                        System.out.print("\nNão encontrado\n");
                    } else {
                        bt.deleteThis(id3);
                    }

                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}
