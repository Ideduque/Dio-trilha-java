public class ResultadoEscolar {
    public static void main(String[] args) {
         //USANDO CONDIÇÃO TERNÁRIA
        
        //EX 2
         int nota = 6;
         String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
         System.out.println("resultado");
        
        /*EX 1
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println("resultado");
        */
       

      /*  // usando if e else
       
      int nota = 10;
       
       if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
        System.out.println("Prova de recuperação");

       else
        System.out.println("Reprovado");
        */
    }
}
