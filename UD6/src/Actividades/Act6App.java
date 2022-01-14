/**
 * 
 */
package Actividades;

import javax.swing.JOptionPane;

/**
 * @author Marcos
 *
 */
public class Act6App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pedirNum();
	}

	public static void pedirNum() {
		String text_num = JOptionPane.showInputDialog("Indroduce un numero");
		lenNum(text_num);
	}

	public static void lenNum(String text_num) {
		int num = Integer.parseInt(text_num);
		int leng = text_num.length();
		if (num < 0) {
			System.out.println("Introduce un numero positivo");
		}else {
			System.out.println("La longitud de " + num + " es: " + leng);
		}		
	}

}
