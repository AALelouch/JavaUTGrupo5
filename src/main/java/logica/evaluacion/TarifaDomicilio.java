package logica.evaluacion;

import java.util.Scanner;

public class TarifaDomicilio {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el nombre del domiciliario: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cantida de domicilios: ");
        Integer domicilios = scanner.nextInt();

        if (domicilios > 15){
            System.out.println("El domiciliario " + nombre + " tiene una tarifa" +
                    " del 20%");
        }else{
            System.out.println("El domiciliario " + nombre + " tiene una tarifa" +
                    " del 10%");
        }

    }

}
