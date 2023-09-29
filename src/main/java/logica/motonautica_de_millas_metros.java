package logica;/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "MOTONAUTICA_DE_MILLAS_METROS.java."

import java.io.*;

public class motonautica_de_millas_metros {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double recorridometros;
		double recorridomillas;
		System.out.println("Distancia en millas: ");
		recorridomillas = Double.parseDouble(bufEntrada.readLine());
		recorridometros = recorridomillas*1852;
		System.out.println(("Recorrido en metros ha sido de :")+recorridometros);
	}


}

