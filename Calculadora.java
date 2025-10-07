/*1. Ler o primeiro número 2. Ler o segundo número 3. Mostrar o menu de operações (+, -, *, /)
4. Ler a operação escolhida
5. Usar switch-case para:
     - Caso '+': somar os números
     - Caso '-': subtrair
     - Caso '*': multiplicar
     - Caso '/': dividir
     - Caso padrão: mostrar "operação inválida"
6. Mostrar o resultado na tela
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /): ");
        char operador = entrada.next().charAt(0);

        double resultado;
        
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

        entrada.close();
    }
}

