//Explicaion 1
public class NumerosPrimos {
    //Explicaion 2
    public static void main(String[] args) {

        ////Explicaion 3
        esPrimnoOno(4);
    }

    public static boolean esPrimnoOno(int numero){
        //Explicaion 4
        if(numero <= 1){
            System.out.println("El 1 el 0 y los números negativos no son números primos!");
            return false;
        }

        //Explicaion 5
        for (int i = (int)Math.sqrt(numero); i > 1 ; i--) {
            //Explicaion 6
            if(numero % i == 0){
                System.out.println("El numero: " + numero + " NO es primo!");
                return false;
            }
        }
        ////Explicaion 7
        System.out.println("El numero: " + numero + " es primo!");
        return true;
    }
}