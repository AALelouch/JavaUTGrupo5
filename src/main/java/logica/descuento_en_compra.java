package logica;/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "DESCUENTO_EN_COMPRA.java."

import java.io.*;

public class descuento_en_compra {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double descuento;
		String porcentajedescuent = "";
		double porcentajedescuento;
		double preciopagado;
		double precioproducto;
		precioproducto = Double.parseDouble(bufEntrada.readLine());
		preciopagado = Double.parseDouble(bufEntrada.readLine());
		descuento = precioproducto-preciopagado;
		porcentajedescuento = descuento*100/precioproducto;
		System.out.println("Porcentaje de descuento "+porcentajedescuent);
	}


}

