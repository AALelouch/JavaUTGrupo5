package logica.evaluacion;

import java.util.Scanner;

public class TapabocasDotCom {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int cantidadDeTababocas = 500;

        while (cantidadDeTababocas > 0){

            System.out.println("Ingrese cuantos tapabocas va a solicitar: ");
            Integer solicitudTapabocas = scanner.nextInt();

            if (solicitudTapabocas < 0){
                throw new IllegalArgumentException("Cantidad de tapabocas invalida");
            }

            if (solicitudTapabocas > cantidadDeTababocas){
                throw new IllegalArgumentException("Cantidad invalida de tapabocas");
            }

            cantidadDeTababocas = cantidadDeTababocas - solicitudTapabocas;

            if (cantidadDeTababocas < 50){
                System.out.println("Las existencias han bajado de 50, actualmente quedan: " + cantidadDeTababocas);
            }

        }

    }

}
