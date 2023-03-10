import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args) {

        int cantPan = 0;
        double precioFinal = 0;

        System.out.println("Bienvenido a BakeryApp!");
        Scanner sc = new Scanner(System.in); //Instanciamos un objeto tipo Scanner
        System.out.println("\nDescuentos: -0.50$  por unidad a partir de una compra de más de 50 unidades" +
                           "\n -1.00$ por unidad por una compra superior a las 100 unidades");
        System.out.println("\nInserte la cantidad de unidades deseadas: ");
        cantPan = sc.nextInt(); //Guardamos la cantidad que el usuario ingresa

        if(cantPan > 50 && cantPan <= 100){ //si la compra supera las 50 unidades y es menor o igual al 100
            precioFinal = cantPan * 4.5;    //El precio x unidad es de 4.50$
        } else if (cantPan > 100) {
            precioFinal = cantPan *4; //Si la compra supera las 100 unidades, el precio x unidad es de 4.50$
        }else {
            precioFinal = cantPan * 5; //Si no es ninguna de las opciones de arriba el precio por unidad será de 5$
        }

        if(cantPan > 50 && cantPan <= 100){
            System.out.println("Usted compró: " +cantPan + " panes." + " Se le aplicará un descuento de 0.50$ por unidad :)");
            System.out.println("Precio final: " + precioFinal + "$");
        } else if (cantPan > 100) {
            System.out.println("Usted compró: " +cantPan + " panes." + " Se le aplicará un descuento de 1.00$ por unidad ;)");
            System.out.println("Precio final: " + precioFinal + "$");
        }else {
            System.out.println("Usted compró: " +cantPan + " panes." + " No se le aplicará ningún descuento :(");
            System.out.println("Precio final: " + precioFinal + "$");
        }


    }
}