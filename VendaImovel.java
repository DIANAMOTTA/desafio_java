/*1. Ler o nome do vendedor . Ler o valor do imóvel
3. Se o valor do imóvel >= 50000
       comissão = valorImovel * 0.20
   Senão se o valor do imóvel >= 30000
       comissão = valorImovel * 0.15
   Senão
       comissão = valorImovel * 0.10
4. Mostrar nome do vendedor 5. Mostrar valor do imóvel 6. Mostrar valor da comissão
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class VendaImovel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do Vendedor: ");
        String nomeVendedor = entrada.nextLine();

        double valorImovel = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try{
                 System.out.print("Digite o valor do imóvel: R$ ");
                 valorImovel =  entrada.nextDouble();

                 if(valorImovel <= 0){
                    System.out.printf("Valor inválido! O valor deve ser maior que zero. \n");
                 }else{
                    entradaValida = true;
                 }
            }catch(InputMismatchException e){
                System.out.printf("Entrada inválida! Digite apenas números (use ponto, não vírgula)");
                entrada.nextLine();
            }         
        }
       
        double comissao;

        if (valorImovel >= 50000) {
            comissao = valorImovel * 0.20;   
        }else if (valorImovel >= 30000) {
            comissao = valorImovel * 0.15;         
        }else{
            comissao = valorImovel * 0.10;          
        }
       System.out.println("\n===== RESULTADO DA VENDA =====");
        System.out.println("Vendedor: " + nomeVendedor);
        System.out.printf("Valor do imóvel: R$ %.2f%n", valorImovel);
        System.out.printf("Valor da comissão: R$ %.2f%n", comissao);

        entrada.close();  

    }
    
}
