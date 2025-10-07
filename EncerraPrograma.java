/* 1. Abrir leitor (Scanner). 2. Repetir para sempre: 2.1 Exibir "Digite um número inteiro entre 1 e 10:"
   2.2 Se entrada não for inteiro: mostrar "Entrada inválida" e continuar o loop
   2.3 Ler o inteiro 
   2.4 Se inteiro < 1 ou inteiro > 10: mostrar "Número fora do intervalo" e continuar o loop
   2.5 Mostrar "Você digitou: X"
   2.6 Se inteiro == 10: mostrar "Encerrando..." e sair do loop
3. Fechar leitor
*/

import java.util.Scanner;
    public class EncerraPrograma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Digite um número inteiro entre 1 e 10: ");

            if (!entrada.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                entrada.next(); 
                continue;
            }

            numero = entrada.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Número fora do intervalo! Digite entre 1 e 10.");
                continue;
            }

            System.out.println("Você digitou: " + numero);

            if (numero == 10) {
                System.out.println(" Encerrando o programa...");
                break;
            }
        }

        entrada.close();
    }
    
}

