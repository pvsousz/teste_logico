import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        char letra = 0;
        int quantidade = 0;
        String palavra = teclado.nextLine();

        for(int i = 0; i<palavra.length();i++){
          letra = palavra.charAt(i);
          
          if (letra == 'a'||letra == Character.toUpperCase('a')) {
            quantidade = quantidade +1;
          }
          
        }
        System.out.println(quantidade);

    }
    
}
