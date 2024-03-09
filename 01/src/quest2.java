import java.util.Scanner;
public class quest2 {
    public static void main(String[] args) {
    
        

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int numero_digitado = teclado.nextInt();

        if (verificarNumero(numero_digitado)) {
            System.out.println("É um número fibonacci");
            
        }else{
            System.out.println("Não é um número Fibonacci");
        }

    }

        public static boolean verificarNumero(int numero){
            int n1 = 0;
            int n2 = 1;

            while (n2 < numero) {
                int variavel = n2;
                n2 = n1 + n2;
                n1 = variavel;
                if (n2 == numero) {
                    return true;
                }
            
            }
            return false;
        }
}