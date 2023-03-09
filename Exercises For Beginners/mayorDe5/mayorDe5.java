import java.util.Scanner;

public class MayorDe5 {
    public static void main(String[] args) {

        int arrayDe5 [] = new int[5]; //Creamos un array de 5 posiciones
        System.out.println("Dame 5 números y te digo cuál es el mayor");
        Scanner sc = new Scanner(System.in); //Instanciamos un objeto Scanner

        int numeroMayor = arrayDe5[0]; //Guaradmos la posiocion 0 del array en la variable numeroMayor


        for (int i = 0; i < arrayDe5.length; i++){ //Recorremos el arreglo
            System.out.println("Inserte 1 número:"); //Pedimos 1 número 5 veces
            arrayDe5[i] = sc.nextInt(); //Guardamos el número del usuario en la posición actual del iterador en el arrray

            if(arrayDe5[i] > numeroMayor){ //Si la posicion actual del iterador (i) es mayor que el valor de numeroMayor
                numeroMayor = arrayDe5[i]; //Guardamos el valor de la posicion que supera al anterior valor
            }
        }

        System.out.println("El mayor de los números insertados es: " + numeroMayor); //Imprimimos el resultado
    }
}