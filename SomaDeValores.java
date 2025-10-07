import java.util.Scanner;

public class SomaDeValores {
    public static void main(String[] args) {
        int soma = 0;

        for(int i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.print("A soma dos números de 1 a 100 é: " + soma);
    }   
    
}
