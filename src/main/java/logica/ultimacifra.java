package logica;/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "ULTIMACIFRA.java."

import java.io.*;

public class ultimacifra {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double numero;
		System.out.println("Introduzca cualquier n�mero entero :");
		numero = Double.parseDouble(bufEntrada.readLine());
		System.out.println("La �ltima cifra es : "+numero%10);
	}
	
}

