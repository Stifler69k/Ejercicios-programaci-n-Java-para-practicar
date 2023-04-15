public class FactorialDeUnNumero {
    public static void main(String[] args) {

        //Si metemos un número superior a 30 el programa se desborda
        //debido al gran cecimiento del número
        System.out.println(factorial(5));

    }

    public static int factorial (int numero){

        if(numero<0){
            System.out.println("No se puede calcular el factorial"+
                    " de un número negativo");
            return -1;
        }

        //El factorial de 0 y 1 es 1
        if(numero == 0 || numero == 1){
            return 1;
        }

        int resultado = numero;

        for (int i = (numero-1); i > 1; i--){
            resultado *= i;
        }

        return resultado;
    }
}