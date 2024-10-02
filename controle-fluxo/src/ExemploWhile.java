import java.util.concurrent.ThreadLocalRandom;

public  class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        
        while(mesada > 0) 
        {
            double valorDoce = valorAleatorio();
            //verificação para não precisar fazer novas verificações de valores e não deixar o valor negativo
            if(valorDoce > mesada)
                valorDoce = mesada; 
            
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            //A variável que seja condicional, precisa ser tratada, para encerrar o fluxo
            mesada = mesada - valorDoce;
        } 
        System.out.println("Mesada:" + mesada);
        System.out.println("João gastou toda sua mesada em doce");
        
    }
    // Método para auxiliar no valor aleatorio
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}