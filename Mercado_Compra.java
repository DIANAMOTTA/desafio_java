/*1. Mostrar uma mensagem perguntando a bebida desejada
2. Ler a bebida digitada pelo usuário
3. Se a bebida for "cerveja":
       3.1 Perguntar a idade
       3.2 Ler a idade
       3.3 Se idade < 18 -> mostrar "compra negada"
       3.4 Senão -> mostrar "compra efetuada com sucesso"
4. Se a bebida for "refrigerante" ou "água" -> mostrar "compra efetuada com sucesso"
 */

import java.util.Scanner;

public class Mercado_Compra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MERCADO DE BEBIDAS ===");
        System.out.println("1 - Cerveja");
        System.out.println("2 - Refrigerante");
        System.out.println("3 - Água");
        System.out.print("Escolha o tipo de bebida (1-3): ");

        if (scanner.hasNextInt()) {
            int opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.print("Digite sua idade: ");            
                if (scanner.hasNextInt()) {
                    int idade = scanner.nextInt();
                    
                    if (idade >= 18) {
                        System.out.println("Compra de Cerveja efetuada com sucesso!");
                    } else {
                        System.out.println("Compra negada! Menor de idade não pode comprar cerveja.");
                    }
                } else {
                    System.out.println("Erro: Idade deve ser um número!");
                    scanner.next(); 
                }
                
            } else if (opcao == 2) {
                System.out.println("Compra de Refrigerante efetuada com sucesso!");
                
            } else if (opcao == 3) {
                System.out.println("Compra de Água efetuada com sucesso!");
                
            } else {
                System.out.println("Opção inválida! Digite apenas 1, 2 ou 3.");
            }
        } else {
            System.out.println("Erro: Digite apenas números!");
            scanner.next();
        }
        scanner.close();
    }
}
    


