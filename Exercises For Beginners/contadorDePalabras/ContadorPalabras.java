import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {

        System.out.println("Dame un texto y te cuento sus palabras:"); //paso 1
        Scanner sc = new Scanner(System.in);
        String textoUsuario = sc.nextLine(); //paso 2

        boolean esTexto = false; //paso 3
        int contadorP = 0; //paso 4

        for (int i = 0; i < textoUsuario.length(); i++){ //paso 5
            char c = textoUsuario.charAt(i); //paso 6
            if(Character.isWhitespace(c)){
                esTexto = false; //paso 7
            } else if (!esTexto) {
                contadorP ++;
                esTexto = true;
            }
        }

        System.out.println("En total encontré: " + contadorP + " palabras en el texo."); //paso 8
    }
}