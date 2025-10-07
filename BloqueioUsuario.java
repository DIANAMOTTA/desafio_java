/*Solicitar o usuário e a senha. 
Verificar se correspondem aos valores corretos:
Usuário esperado: "aluno"
Senha esperada: "segredo"
Se o login estiver correto → mostrar mensagem de sucesso. 
Se o login estiver incorreto → permitir tentar novamente
Se errar 3 vezes, bloquear o acesso. */

import java.util.Scanner;
public class BloqueioUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final String usuarioCorreto = "aluno";
        final String senhaCorreta = "segredo";
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Digite o usuário: ");
            String usuario = entrada.nextLine();

            System.out.print("Digite a senha: ");
            String senha = entrada.nextLine();

        if (usuario.equals(usuarioCorreto) && senhaCorreta.equals(senhaCorreta)) {
            System.out.println("\n Bem-vindo!");
            break;           
        }else{
            tentativas++;
            System.out.println("Usuário ou senha inválidos. Tentativas restantes: " + (3 - tentativas));
            System.out.println();
       }
       if (tentativas == 3){
        System.out.println("Usuário bloqueado por excesso de tentativas!");
       }
    } 
    entrada.close();
  }
    
}
