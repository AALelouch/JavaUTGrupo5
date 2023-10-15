package logica.guia;/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "OPERADORESARITMETICOS.java."

import java.io.*;

public class operadoresaritmeticos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double numero1;
		double numero2;
		numero1 = Double.parseDouble(bufEntrada.readLine());
		numero2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("n�mero1 + n�mero2 = "+numero1+numero2);
		System.out.println("n�mero1 - n�mero2 = "+ (numero1-numero2));
		System.out.println("n�mero2 - n�mero1 = "+ (numero2-numero1));
		System.out.println("n�mero1 * n�mero2 = "+numero1*numero2);
		System.out.println("n�mero1 / n�mero2 = "+numero1/numero2);
		System.out.println("n�mero2 / n�mero1 = "+numero2/numero1);
		System.out.println("n�mero1 mod n�mero2 = "+numero1%numero2);
		System.out.println("n�mero2 mod n�mero1 = "+numero2%numero1);
	}


}

