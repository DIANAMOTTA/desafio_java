/*Lê duas notas de um aluno
Calcula a média
Informa se foi aprovado (média ≥ 7) ou reprovado (média < 7)
Pergunta se o usuário quer fazer novo cálculo ou encerrar */


import java.util.Scanner;
public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar = "S"; 

        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("\nDigite a Primeira nota: ");
            double nota1 = entrada.nextDouble();

            System.out.print("\nDigite a Segunda nota: ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2 ) /2;

            System.out.printf("\nMédia final: %.2f\n", media);

            if (media >= 7) {
                System.out.println("Situação: APROVADO");
            } else {
                System.out.println("Situação: REPROVADO");
            }

            System.out.print("\nDeseja calcular outra média? (S/N): ");
            continuar = entrada.next();
        }

        System.out.println("\nPrograma encerrado. Até mais!");
        entrada.close();
    }
    
}
