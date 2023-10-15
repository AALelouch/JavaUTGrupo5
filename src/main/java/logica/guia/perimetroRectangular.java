package logica.guia;/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PERIMETRORECTANGULAR.java."

import java.io.*;

public class perimetroRectangular {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura = 0;
		double base = 0;
		double perimetro;
		double superficie;
		System.out.println(base);
		base = Double.parseDouble(bufEntrada.readLine());
		System.out.println(altura);
		altura = Double.parseDouble(bufEntrada.readLine());
		superficie = base*altura;
		System.out.println(("La superficie es:")+superficie);
		perimetro = (base+altura)*2;
		System.out.println(("El per�metro del lote es:")+perimetro);
	}


}

