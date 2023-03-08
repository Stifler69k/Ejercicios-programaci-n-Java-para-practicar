import java.util.Scanner;

public class TopVentas {
    public static void main(String[] args) {

        double ventas [] = new double[10]; //Creamos un Array que se llama 'ventas' de 10 posiciones
        Scanner sc = new Scanner(System.in); //Instanciamos un objeto tipo Scanner
        System.out.println("Ingrese 10 ventas y le digo cuáles superna los 2000$");

        for (int i = 0; i < ventas.length; i++){ //Recorremos el array ventas
            System.out.println("Venta: " + (i+1)); //Pedimos al usuario que ingrese ventas
            ventas[i] = sc.nextDouble(); //Guardamos las ventas del usuario en el array 'ventas' en la posicion de [i]

        }

        int k = 0;
        int total = 0;

        System.out.println("Ventas que superan los 2000$: ");
        while (k < 10){ //Mientras k sea menor a 10, el bucle while itera
            if(ventas[k] >= 2000){
                System.out.println("$" + ventas[k]);
                total ++; //Si la venta es de 2000 o superior total incrementa
            }
            k++;
        }

        System.out.println("El total de ventas igual o mayor a 2000$ es: " + total); //Imprimimos el total de ventas
                                                                                     // que llega o supera a 2000
    }
}
