/**
 * 
 */
package Actividades;

import javax.swing.JOptionPane;

/**
 * @author Marcos
 *
 */
public class Act7App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pedirNum();
	}

	public static void pedirNum() {
		String text_num = JOptionPane.showInputDialog("Indroduce la cantidad de euros");
		int num = Integer.parseInt(text_num);

		String dia = JOptionPane.showInputDialog("introduce que desea convertir (libra / dolar / yen)");
		switch (dia) {

		case "libra":
			System.out.println(num+" euros son "+convertirLib(num)+" libras"); 
			break;
		case "dolar":
			System.out.println(num+" euros son "+convertirDol(num)+" dolares"); 
			break;
		case "yen":
			System.out.println(num+" euros son "+convertirYen(num)+" yenes"); 
			break;
		default:
			System.out.println("Introduce una divisa correcta");
			break;
		}

	}

	public static double convertirLib(int cantidad) {
		return cantidad * 0.86;
	}

	public static double convertirDol(int cantidad) {
		return cantidad * 1.28611;
	}

	public static double convertirYen(int cantidad) {
		return cantidad *129.852;
	}

}
