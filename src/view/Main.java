/**
 * 
 */
package view;

import controller.ConverteController;

/**
 * @author Lucas Batista 23 de mar. de 2024
 */
public class Main {
	public static void main(String[] args) {
		ConverteController converteCtrl = new ConverteController();

		int num = (int) (Math.random() * 1000) + 1;
		System.out.println("O numero é " + num);

		String resultado = converteCtrl.decToBin(num);
		System.out.println("Conversão para Binário " + resultado);

	}

}
