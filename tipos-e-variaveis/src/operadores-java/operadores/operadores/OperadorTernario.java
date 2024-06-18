public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

        //forma abreviada usando operador ternário
        String resultado = a==b ? "verdadeiro" : "Falso";
        
        //UTILIZANDO IF
       /* String resultado = "";
         if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
       
        System.out.println(resultado);

    }
}
