import java.util.Scanner;

public class ArrayAbecedario {
    public static void main(String[] args) {

        //restamos La posicion mayor (Z, añadiendole 1) a la posicion menor
        char abecedario[] = new char[91 - 65];//En ASCII la A va desde 65 hasta la Z (90)

        //creamos el abecedario
        for (int i = 65, indice = 0; i < 91; i++, indice++) {
            abecedario[indice] = (char) i; //Casteamos el iterador de int a char
        }

        //Pedimos un número(seran las posiciopnes donde  buscaremos el caracter)
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte números entre 0 y " + (abecedario.length-1) +
                " .Le diré a que letras mayúsculas coreresponden sus números en el abecedario (0= A / 25= Z)"+
                "\nPresione (-1) para ver el resultado");

        int numeros = sc.nextInt();
        String letras = "";

        while (numeros!= -1){

            //Comprobamos que el número es correcto
            if(numeros >=0 && numeros < abecedario.length){
                letras += abecedario[numeros];
                System.out.println("Inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
            }else {
                System.out.println("Número no válido. Inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
            }

            numeros = sc.nextInt();
        }

        //Si el usuario teclea un (-1) el blucle termina y procedemos a imprimir las letras
        System.out.println("Las letras correspondientes a sus números insertados son: " + letras);
    }
}
