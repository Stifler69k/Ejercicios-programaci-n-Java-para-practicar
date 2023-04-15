public class ArrayDeCien {
    public static void main(String[] args) {

        int numeros [] = new int[100];
        int suma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
            suma += numeros[i];
        }

        media = (double) suma / numeros.length;
        System.out.println("La suma da como resultado: " + suma);
        System.out.println("La media da como resultado: " + media);
    }
}
