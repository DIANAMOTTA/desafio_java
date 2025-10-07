/*1. Criar um vetor de tamanho 10. 2. Criar variável contadorImpares = 0.
3. Para i de 0 até 9:
     3.1 Pedir ao usuário para digitar o número na posição i.
     3.2 Ler o número e armazenar no vetor[i].
     3.3 Se o número for ímpar (numero % 2 != 0):
           incrementar contadorImpares.
4. Ao final, exibir "Quantidade de números ímpares: " + contadorImpares.
 */
import java.util.Scanner;
public class ValoresImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorImpares = 0;

        System.out.println("Digite 10 números inteiros: ");

        for(int i = 0; i < 10; i++){
            System.out.print("Número: " + (i + 1) + ":");
            numeros[i] = entrada.nextInt();
            
            if(numeros[i] % 2!= 0){
                contadorImpares++;
            }
        }
        System.out.println("Quantidade de números ímpares: " + contadorImpares);
        
        entrada.close();  
    }

}
