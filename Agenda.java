import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private ArrayList<Contato> contatos = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);

    public void adicionarContato(){
        System.out.println("Qual o nome: ");
        String nome = entrada.next();

        System.out.println("Qual o numero: ");
        String telefone = entrada.next();

        System.out.println("Qual o email: ");
        String email = entrada.next();

        Contato novoContato = new Contato(nome, email, telefone);
        contatos.add(novoContato);
        System.out.println("Contato Adicionado");

    }

    public void removerContatos(){
        verContato();
        System.out.println("Digite o numero que deseja remover: ");
        int remover = entrada.nextInt() - 1;

        if(remover >= 0 && remover < contatos.size()){
            contatos.remove(remover);
            System.out.println("Contato Removido");
        }
        else{
            System.out.println("Contato Invalido!");
        }
    }

    public void ligarContato(){
        verContato();
        System.out.println("Para quem deseja ligar: ");
        int ligar = entrada.nextInt() - 1;

        if(ligar >= 0 && ligar < contatos.size()){
            Contato c = contatos.get(ligar);
            System.out.println("Ligando para contato: " + c.getNome());
        }
        else{
            System.out.println("Contato Invalido!");
        }
    }

    public void verContato(){
        if(contatos.isEmpty()){
            System.out.println("Nenhum contato selecionado");
        }
        else{
            for(int i = 0; i < contatos.size(); i++){
                Contato c = contatos.get(i);
                System.out.printf("[%d] %s - %s - %s%n", i + 1, c.getNome(), c.getTelefone(), c.getEmail());
            }
        }
    }

}
