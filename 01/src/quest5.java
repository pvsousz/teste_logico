import java.util.Scanner;

public class quest5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra:");

        String palavra = teclado.nextLine();
        String invertida = "";

        for(int i = palavra.length()-1; i>= 0; i--){
            invertida = invertida + palavra.charAt(i);

        }
        System.out.println("Palavra digitada: "+ palavra +"\nPalavra invertida: " +invertida);
    }
       
}
