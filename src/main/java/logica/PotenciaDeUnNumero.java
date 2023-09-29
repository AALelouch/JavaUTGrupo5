package logica;/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PotenciaDeUnNumero.java."

import java.io.*;
import java.math.*;

public class PotenciaDeUnNumero {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cuad;
		int cubo;
		int nume;
		System.out.println(" Que n�mero desea potenciar");
		nume = Integer.parseInt(bufEntrada.readLine());
		cuad = (int) Math.pow(nume, 2);
		cubo = (int) Math.pow(nume, 3);
		System.out.println("Numero al cuadrado sera = "+cuad);
		System.out.println("N�mero al cubo ser� = "+cubo);
	}


}

