import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potência");
            System.out.println("6. Raiz quadrada");
            System.out.println("Q. Sair");

            char opcao = scanner.next().charAt(0);

            if (opcao == 'Q' || opcao == 'q') {
                System.out.println("Encerrando programa.");
                break;
            }

            System.out.print("Informe o primeiro número: ");
            double numeroUm = scanner.nextDouble();

            if (opcao != '6') {
                System.out.print("Informe o segundo número: ");
                double numeroDois = scanner.nextDouble();

                switch (opcao) {
                    case '1':
                        System.out.println("Resultado: " + (numeroUm + numeroDois));
                        break;
                    case '2':
                        System.out.println("Resultado: " + (numeroUm - numeroDois));
                        break;
                    case '3':
                        System.out.println("Resultado: " + (numeroUm * numeroDois));
                        break;
                    case '4':
                        if (numeroDois == 0) {
                            System.out.println("Impossível realizar uma divisão por zero.");
                        } else {
                            System.out.println("Resultado: " + (numeroUm / numeroDois));
                        }
                        break;
                    case '5':
                        System.out.println("Resultado: " + Math.pow(numeroUm, numeroDois));
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } else {
                if (numeroUm < 0) {
                    System.out.println("Não existe raiz de número negativo.");
                } else {
                    System.out.println("Resultado: " + Math.sqrt(numeroUm));
                }
            }
        }

        scanner.close();
    }
}