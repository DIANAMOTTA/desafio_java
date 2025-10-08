/*Ler 20 nomes digitados pelo usuário e armazená-los em um vetor de Strings.
Verificar se há nomes repetidos.
Excluir (ou ignorar) os nomes duplicados.
Exibir na tela somente os nomes únicos (sem repetições). */


import java.util.ArrayList;
import java.util.Scanner;
public class ExluirNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[20];
        ArrayList<String> nomesUnicos = new ArrayList<>();

        System.out.print("Digite 20 nomes (podem repeti-los: )");

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Nome: " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();

            while (nomes[i].trim().isEmpty()) {
                System.out.print("nome inválido, digite novamente: ");
                nomes[i] = entrada.nextLine();
                
            }
        }
        for (String nome : nomes) {
            boolean jaExiste = false;

            for (String unico : nomesUnicos) {
                if (unico.equalsIgnoreCase(nome)) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                nomesUnicos.add(nome);
            }
        }
        System.out.println("\nNomes sem repetição:");
        for (String nome : nomesUnicos) {
            System.out.println(nome);
        }

        entrada.close();
    }
    
}
