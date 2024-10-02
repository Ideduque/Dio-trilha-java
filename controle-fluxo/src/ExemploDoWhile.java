import java.util.Random; // método para auxiliar

// João Vai ligar para seu amigo, aproposta é que enquanto ele tiver discando ou tocando, ele vai aguarda o amiga atender e quando seu amigo atender, ele vai conversar

public class ExemploDoWhile{
    public static void main(String[] args) 
    {
        System.out.println("Discando...");

        do 
        { 
            //Executa várias vezes até alguém atender
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô!!!");
        
    }
    //complemento do método auxiliador
    private static boolean tocando() 
    {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}