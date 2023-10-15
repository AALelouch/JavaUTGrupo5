package logica.evaluacion;

import java.util.Scanner;

public class EdadEntre0y100Age {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingree su edad: ");
        Double edad = scanner.nextDouble();

        if (edad < 0){
            throw new IllegalArgumentException("La edad no es valida");
        }

        Integer ceros = 0;

        do {
            edad = edad/9.9;
            ceros++;

        }while (edad > 1);

        System.out.println("Su edad tiene: " + ceros + " digitos");

    }

}
