import java.util.Random;

public class NumerosAleatoriosArray {
    public static void main(String[] args) {

        Random r = new Random(); //Instanciamos la clase Random
        int numeros [] = new int[10];//La longitud del array será de 10 posiciones

        for (int i = 0; i < numeros.length; i++) { //Recorremos el Array entero
            int numAlestorio = r.nextInt(11);// Generamos un número aleatorio entre 0 (inclusive) y 11 (exclusivo)
            numeros[i] = numAlestorio;//Por cada iteración guardamos un numero aleatorio del 0 al 10 en el array
        }

        System.out.println("Los números aleatorios del 0 al 10 en el Array son: ");
        for (int i = 0; i < numeros.length; i++) { //Imprimimos lo que hay en cada posicion del Array
            System.out.println(numeros[i]);
        }
    }
}
