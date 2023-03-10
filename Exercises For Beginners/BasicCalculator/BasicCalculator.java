import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        //1.-Declarar variables para almacenar dos números y una operación matemática:
        double num1, num2;
        char operacion;

        Scanner sc = new Scanner(System.in);

        //2.-Pedir al usuario que ingrese los números y la operación deseada utilizando la clase Scanner:
        System.out.println("Ingrese el 1er número:");
        num1 = sc.nextDouble();
        System.out.println("Ingrese la operación (+, -, *, /): ");
        operacion = sc.next().charAt(0);
        System.out.println("Ingrese el 2do número:");
        num2 = sc.nextDouble();

        //3.-Utilizar una estructura de control de flujo switch para ejecutar la operación matemática deseada
        double resultado;

        switch (operacion){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Opearación inválida! ERROR!");
                return;
        }

        //4.-Mostrar el resultado en pantalla
        System.out.println("Resultado: " + resultado);

        //5.-Cerrar el objeto Scanner para liberar recursos
        sc.close();
    }
}