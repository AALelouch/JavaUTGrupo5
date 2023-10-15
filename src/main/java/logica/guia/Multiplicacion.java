package logica.guia;/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "Multiplicacion.java."

import java.io.*;

public class Multiplicacion {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double num1;
		double num2;
		double num3;
		double producto;
		System.out.println(("Ingrese el primer n�mero:"));
		num1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println(("Ingrese el segundo n�mero:"));
		num2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println(("Ingrese el tercer n�mero:"));
		num3 = Double.parseDouble(bufEntrada.readLine());
		producto = num1*num2*num3;
		System.out.println("El resultado es:"+producto);
	}


}

