import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado = 0;
        char operacao;

        System.out.println("--- Calculadora com Bug ---");
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o operador (+, -, , /): ");
        operacao = sc.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                sc.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
