import java.util.Scanner;

public class CaptureAndGetAverage {
    public static void main(String[] args) {

        //Variables
        int numero = 0, suma = 0, cantidadNumeros = 0;
        double media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte números positivos y le daré la media de dichos números :)");
        System.out.println("\nInserte un número (positivo):");
        numero = sc.nextInt();

        while (numero > 0){ //Mientras 'numero' sea positivo se repite el bucle
            suma += numero;
            cantidadNumeros ++;
            System.out.println("Introduzca otro número (positivo):");
            numero = sc.nextInt();
        }

        if(cantidadNumeros == 0){ //Si no ingresamos números positivos no se puede hacer la media
            System.out.println("Lo siento, no puedo obtener la media de tus datos :(");
        } else {
            media = suma / cantidadNumeros; //Formula para calcular la media
            System.out.println("La media de tus números ingresados es: " + media);
        }
    //(PARA SALIR DEL PROGRAMA Y OBTENER LA MEDIA HAY QUE INGRESAR UN NÚMERO NEGATIVO)
    }
}
