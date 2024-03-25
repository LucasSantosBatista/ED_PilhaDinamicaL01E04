/**
 * 
 */
package controller;

import model.PilhaInt;

/**
 * @author Lucas Batista 23 de mar. de 2024
 */
public class ConverteController {
	PilhaInt PilhaInt = new PilhaInt();

	public String decToBin(int decimal) {
		String resultado = "";

		while (decimal > 0) {
			int resto = decimal % 2;
			PilhaInt.push(resto);
			decimal = decimal / 2;
		}

		while (!PilhaInt.isEmpty()) {
			resultado += Integer.toString(PilhaInt.pop());
		}

		return resultado;
	}

}
