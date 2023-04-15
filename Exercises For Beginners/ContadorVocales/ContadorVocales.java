import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {

        String frase;
        int contadorV = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un texto y te cuento sus vocales:");
        frase = sc.nextLine();

        int i = 0;
        while (i < frase.length()){//Recorremos la frase
            char letra = frase.charAt(i);//Por cada iteración guardamos el caracter correspondiente de la frase en una varibale tipo char
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
                    || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){

                contadorV ++;//Si en la variable letra entra una vocal, contadorV aumenta en 1
            }
            i++;
        }
        //Una vez finaliza el blucle imprimimos las vocales encontradas
        System.out.println("Tú frase contiene: " + contadorV + " vocales");
    }
}
