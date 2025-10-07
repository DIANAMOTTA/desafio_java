/*Ler dois números (numero1 e numero2).
Verificar se o divisor (numero2) é zero.
Se for zero, repetir a entrada até receber um número válido.
Calcular a divisão: resultado = numero1 / numero2.
Exibir o resultado no console. */

import java.util.Scanner;

public class DivisaoDeValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Digite o primeiro valor (que será divido):");
        double dividendo = entrada.nextDouble();

        System.out.print("Digite o segundo valor (o divisor):");
        double divisor = entrada.nextDouble();

        while (divisor == 0) {
            System.out.print("\nERRO: Divisão por zero não é permitida!");
            System.out.print("Por favor, digite um novo valor para o divisor: ");
            divisor = entrada.nextDouble();
        }

        double resultado = dividendo / divisor;

        System.out.printf("\nResultado da divisão: %.2f / %.2f = %.2f\n", 
                         dividendo, divisor, resultado);
        
        entrada.close();
            
    }
}

