public class Operadores {
    public static void main(String [] args) {
        String nomeUm = "Lais";
        String nomeDois = "Lais";

        System.out.println(nomeUm.equals(nomeDois));

        int a = 1;
        int b = 3;

        if (b != a) {
            System.out.println("Não é igual"); 
        }

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das duas é verdadeira!clrar");
        }
    }
    
}
