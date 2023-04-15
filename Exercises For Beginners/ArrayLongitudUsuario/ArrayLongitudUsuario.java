import java.util.Scanner;

public class ArrayLongitudUsuario {
    public static void main(String[] args) {

        System.out.println("Dame una longitud:");
        Scanner sc = new Scanner(System.in);
        int longitud = sc.nextInt();

        int numeros [] = new int[longitud];

        System.out.println("Inserta números del 0 al 10:");

        int num;
        for (int i = 0; i < numeros.length; i++){

            System.out.println("Inserte un número en la posición "+i);
            do {
                num = sc.nextInt();

                if(!(num >= 0 && num <= 10)){
                    System.out.println("Error!! Solo se admiten números del 0 al 10"
                    + " Inserte un número en la posición: " +i);
                }
            }while (!(num > 0 && num < 10));

            numeros[i] = num;
        }

        System.out.println("Estos son los números insertados por el usuario:");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}

