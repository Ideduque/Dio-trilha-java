//Exemplo de Try / Catch - Tratamento de exceções
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    @SuppressWarnings("resource")
    public static void main(String[] args) 
    {   
        try 
        {  //Criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            // Imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho  " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
        } 
        catch (Exception e) // Captura da possível exceção
        {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
        
    }
}