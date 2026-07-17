import java.util.Scanner;

public class VerificarIdade {

    static boolean verificarIdade(int idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite a sua idade: ");
        int idade = scanner.nextInt();

        boolean idadeVerificada = verificarIdade(idade);
        if (idadeVerificada) {
            System.out.println("- Você é maior de idade!");
        } else {
            System.out.println("- Você é menor de idade!");
        }
    }
}
