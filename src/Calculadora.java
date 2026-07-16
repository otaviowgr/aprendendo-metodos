import java.util.Scanner;

public class Calculadora {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String opcao;
        double numero1, numero2;
        int sair = 0;

        System.out.println("SEJA BEM VINDO A CALCULADORA");

        do {
            System.out.println("\n+ | Soma");
            System.out.println("- | Subtração");
            System.out.println("* | Multiplicação");
            System.out.println("/ | Divisão");

            System.out.print("Digite o caracter para selecionar a operação: ");
            opcao = scanner.nextLine();

            switch (opcao) {

                case "+":
                    System.out.print("\nDigite o 1º número: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Digite o 2º número: ");
                    numero2 = scanner.nextDouble();

                    System.out.println("\n- Soma: " + (numero1 + numero2));

                    break;

                case "-":
                    System.out.print("\nDigite o 1º número: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Digite o 2º número: ");
                    numero2 = scanner.nextDouble();

                    System.out.println("\n- Subtração: " + (numero1 - numero2));

                    break;

                case "*":
                    System.out.print("\nDigite o 1º número: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Digite o 2º número: ");
                    numero2 = scanner.nextDouble();

                    System.out.println("\n- Multiplicação: " + (numero1 * numero2));

                    break;

                case "/":
                    System.out.print("\nDigite o 1º número: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Digite o 2º número: ");
                    numero2 = scanner.nextDouble();

                    while (numero2 <= 0) {
                        System.out.print("\n- Número Inválido! Digite novamente: ");
                        numero2 = scanner.nextDouble();
                    }

                    System.out.println("\n- Divisão: " + (numero1 / numero2));

                    break;

                default:
                    System.out.println("\n- Opcão Inválida!");
            }

            System.out.println("\n- Deseja realizar outra operação?");
            System.out.println("1 - Sim | 2 - Não");
            sair = scanner.nextInt();
            scanner.nextLine();
        } while (sair != 2);
    }
}
