public class PlanoOperadora {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
       //USANDO SWITCH CASE
       
        String plano = "M"; // B = Basico, M = Midia, T = Turbo
        
        switch (plano) {
            case "T": {
                System.out.println("5GB YouTube");
            }
            case "M": {
                System.out.println("whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}

//USANDO IF 

/* 
public class PlanoOperadora {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String plano = "M"; // B = Basico, M = Midia, T = Turbo
        
        if(plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if(plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("whats e Instagram grátis");
        } else if(plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("whats e Instagram grátis");
            System.out.println("5GB YouTube");
        }
    }
}*/