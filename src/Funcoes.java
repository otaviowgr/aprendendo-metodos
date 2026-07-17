import java.util.Scanner;

public class Funcoes {
    static void mensagem(String nome) {
        System.out.println("\nSeja bem vindo " + nome + "!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;

        System.out.print("\nDigite o seu nome: ");
        nome = scanner.nextLine();
        mensagem(nome);
    }
}
