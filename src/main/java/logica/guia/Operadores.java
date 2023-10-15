package logica.guia;/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "Operadores.java."

import java.io.*;

public class Operadores {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String m;
		String s;
		String t;
		System.out.println("Introduce el valor de S");
		s = bufEntrada.readLine();
		System.out.println("Introduce el valor de M");
		m = bufEntrada.readLine();
		t = s;
		s = m;
		m = t;
		System.out.println("S vale "+s+" y M vale "+m);
	}


}

