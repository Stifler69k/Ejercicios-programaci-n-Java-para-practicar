import java.util.Scanner;

public class AdderApp {
    public static void main(String[] args) {

        //Declaramos las varables necesarias para para el ejercicio
        int numeroUsuario = 0;
        int totalSuma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte sus números y los sumaré para darle el resultado ;)");
        System.out.println("(PARA OBTENER EL RESULTADO PRESIONE EL NÚMERO '0')");

        do{ //Bucle do{}while();
            System.out.println("\nInserte un número:");

            if(sc.hasNextInt()){ //Si la entrada de datos del usuario contiene un entero
                numeroUsuario = sc.nextInt(); //Guardamos el entero en la variable numeroUsuario
                totalSuma += numeroUsuario; //equivale a: totalSuma = totalSuma + numeroUsuario
            }else { //Si la entrada de datos no contiene un dato de tipo entero, salta un mensaje de ERROR
                System.out.println("ERROR! Only numbers are allowed!!!");
            }

        }while (numeroUsuario != 0); //Mientras el numero del usuario no sea un 0, el bucle se repite

        //Si el usuario ingresa un 0 el bucle termina y el programa imprime la suma de los números
        System.out.println("La suma total de los números ingresados es: " + totalSuma);
        sc.close(); //Liberamos el Scanner
    }
}