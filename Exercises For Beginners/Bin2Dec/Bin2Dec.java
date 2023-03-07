import java.util.Scanner;
//importamos la clase Scanner del paquete java.util, que se utiliza para leer la entrada
// del usuario desde la consola.

public class Bin2Dec{ //La clase principal se llama Bin2Dec y contiene el método main, que es el punto de
    // entrada del programa.
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de valores binarios (0 - 1) y los convertire a decimal:");
        String cadenaBinaria = sc.nextLine(); //utilizamos un objeto Scanner para leer la entrada del usuario y guardamos
        //la cadena binaria en la variable cadenaBinaria.

        // Validar la entrada del usuario
        if(!cadenaBinaria.matches("[01]{1,8}")){
            System.out.println("Los datos ingresados no son correctos! ERROR!!!");
            return;
            // valida la entrada del usuario para asegurarse de que la cadena solo contenga 0 y 1, y que la
            // longitud sea de entre 1 y 8 caracteres. Si la entrada del usuario es inválida, el programa termina
            // temprano y muestra un mensaje de error.
        }

        int decimal = 0;
        for(int i = 0; i < cadenaBinaria.length(); i++){
            // Convertir el carácter en el índice i a un dígito binario
            int digit = Character.getNumericValue(cadenaBinaria.charAt(i));
            // Calcular el valor decimal de este dígito binario
            decimal += digit * Math.pow(2, cadenaBinaria.length() -1 -i);
        }

        System.out.println("EL valor binario covertido a decimales es: " + decimal);

         /* La variable decimal se inicializa en cero y se utiliza en un bucle for para iterar sobre cada
            dígito binario en la cadena binaria. En cada iteración, se convierte el carácter en el índice i
            de la cadena en un número entero (0 o 1) utilizando el método Character.getNumericValue(). Luego,
            se calcula el valor decimal de este dígito binario mediante la fórmula 2^(n-i-1) donde n es la
            longitud de la cadena binaria.
            Por último, el programa imprime el equivalente decimal de la cadena binaria utilizando
            System.out.println().
        */
    }
}