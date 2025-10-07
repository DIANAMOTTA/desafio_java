/*1. Perguntar o nome do produto  2. Perguntar o preço unitário 3. Perguntar a quantidade
4. Calcular o valor total (preço * quantidade) 5. Verificar qual desconto se aplica:
   - Se até 10 unidades → 0%
   - Se entre 11 e 20 → 10%
   - Se entre 21 e 50 → 20%
   - Se acima de 50 → 25%
6. Calcular o valor do desconto
7. Calcular o valor final (total - desconto)
8. Mostrar o valor final ao cliente*/
import java.util.Scanner;

public class Mercado_Compra_com_Desconto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o nome do Produto? ");
        String nomeProduto = entrada.nextLine();

        System.out.println("Qual o valor do produto?");
        double preco = entrada.nextDouble();

        System.out.println("Qual a quantidade que deseja levar?");
        int quantidade =  entrada.nextInt();


        double total = preco * quantidade;
        double desconto = 0;

        if (quantidade <= 10){
            desconto = 0; 
        }else if(quantidade <= 20){
            desconto = total * 0.10;
        }else if(quantidade <= 50){
            desconto = total * 0.20;
        }else{
            desconto = total * 0.25;
        }

        double valorFinal = total - desconto;
        System.out.println("\n=== RESUMO DA COMPRA ===");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço unitário: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final a pagar: R$ " + valorFinal);

        entrada.close();
    }

    
}
