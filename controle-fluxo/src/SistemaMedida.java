public class SistemaMedida {
    public static void main(String[] args) {
        //Exemplos para diferenciar o uso do IF e Switch case
        
         //USO DO IF
        String sigla = "P";

        if(sigla == "P")
                System.out.println("PEQUENO");
        else if(sigla == "M")
                System.out.println("MEDIO");
        else if(sigla == "G")
                System.out.println("GRANDE");
        else
                System.out.println("INDEFINIDO");
                
    }

    /* USANDO O SWITCH CASE 
    
String sigla = "M";

switch (sigla){
    case "P":{
        System.out.println("PEQUENO");
        break;
    }
    case "M":{
        System.out.println("MEDIO");
        break;
    }
    case "G":{
        System.out.println("GRANDE");
        break;
    }
    default:
        System.out.println("INDEFINIDO");
}
*/
}
     