/*1. Ler a primeira nota 2. Ler a segunda nota 3. Ler a terceira nota
4. Calcular a média (somar as três notas e dividir por 3)
5. Se média >= 7 → mostrar "Aprovado"
6. Senão se média >= 5 → mostrar "Recuperação"
7. Senão → mostrar "Reprovado"
 */

import java.util.Scanner;

public class CalculoNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média: %.2f%n", media); // Formata com 2 casas decimais + quebra linha

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
