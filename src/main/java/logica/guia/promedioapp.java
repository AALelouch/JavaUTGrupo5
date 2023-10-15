package logica.guia;/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PROMEDIOAPP.java."

import java.io.*;

public class promedioapp {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double nota1;
		double nota2;
		double nota3;
		double promedio;
		System.out.println(("�Cual es la califici�n 1?:"));
		nota1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println(("�Cual es la califici�n 2?:"));
		nota2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println(("�Cual es la califici�n 3?:"));
		nota3 = Double.parseDouble(bufEntrada.readLine());
		promedio = (nota1+nota2+nota3/3);
		System.out.println("El promedio obtenido por el estudiante de l�gica de sistemas es: "+promedio);
	}


}

