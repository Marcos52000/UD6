/**
 * 
 */
package Actividades;

import javax.swing.JOptionPane;

/**
 * @author Marcos
 *
 */
public class Act4App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perdirNum();
	}

	public static void perdirNum() {
		String text_num = JOptionPane.showInputDialog("Indroduce un numero");
		int num = Integer.parseInt(text_num);
		System.out.println("El factorial de "+num+" es: "+factorial(num));
		
	}
	public static int factorial(int numero) {
		int resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}
}
