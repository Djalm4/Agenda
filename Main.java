import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        printTitulo("Bem Vindo");

        System.out.println("Oque voce quer fazer no telefone hoje: ");
        System.out.println("1 - Ligar\n2 - Adicionar contato\n3 - Remover Contato\n4 - Ver contatos");
        System.out.println("Escolha: ");

        Scanner entrada = new Scanner(System.in);
        int decisao = entrada.nextInt();

        Agenda agenda = new Agenda();

        do {
            printTitulo("Bem Vindo");
            System.out.println("O que você quer fazer no telefone hoje:");
            System.out.println("1 - Ligar");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Remover contato");
            System.out.println("4 - Ver contatos");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            decisao = entrada.nextInt();
            entrada.nextLine(); // limpar buffer

            switch (decisao) {
                case 1:
                    printTitulo("Ligar");
                    agenda.ligarContato();
                    break;
                case 2:
                    printTitulo("Adicionar contato");
                    agenda.adicionarContato();
                    break;
                case 3:
                    printTitulo("Remover contato");
                    agenda.removerContatos();
                    break;
                case 4:
                    printTitulo("Ver contatos");
                    agenda.verContato();
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        } while (decisao != 5);

        entrada.close();
    }

    public static void printTitulo(String titulo) {
        System.out.println("-----------------------------------");
        System.out.printf("         %s%n", titulo.toUpperCase());
        System.out.println("-----------------------------------");
    }
}