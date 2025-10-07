/* Ler 10 nomes digitados pelo usuário e armazená-los em um vetor de Strings.
Pedir ao usuário que digite um nome para busca.
Verificar se esse nome existe dentro do vetor.
Exibir: “Achei” → se o nome estiver no vetor.
“Não achei” → se o nome não estiver no vetor.*/

import java.util.Scanner;
public class BuscaNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[10];
        boolean achei = false;

        System.out.println("Digite 10 nomes para armazena-los: ");
        for(int i= 0; i < nomes.length; i++){
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();
        }

        System.out.println("Digite o nome que queira buscar: ");
        String nomeBusca = entrada.nextLine();

       for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                achei = true;
                break;
            }
        }

        if(achei){
            System.out.println("Achei!");
        }else{
            System.out.println("Não achei! ");
        }
    }
}

