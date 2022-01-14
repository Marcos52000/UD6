/**
 * 
 */
package Actividades;

import javax.swing.JOptionPane;

/**
 * @author Marcos
 *
 */
public class Act5App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pedirNum();
	}

	public static void pedirNum() {
		String text_num = JOptionPane.showInputDialog("Indroduce un numero");
		int num = Integer.parseInt(text_num);
		System.out.println(num + " convertido a binario es: " + pasarBinario(num));
	}

	public static String pasarBinario(int numero) {
		int binario[] = new int[40];
		String bin = "";
		int index = 0;
		while (numero > 0) {
			binario[index++] = numero % 2;
			numero = numero / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			bin = bin + binario[i];
		}
		return bin;
	}

}
