import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        double saldo = 237.48;
        
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
    
        System.out.println(" Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println(" Digite o número da agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        
        System.out.println(" Agora, digite o número da conta: ");
        int conta = scanner.nextInt();
        
        //Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é  " + agencia + ", conta " + conta +  " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();

        
        
        /* Conta = "1021";
        Ag = "067-8";
        nomeCliente = "MARIO ANDRADE";
        */

    }
}