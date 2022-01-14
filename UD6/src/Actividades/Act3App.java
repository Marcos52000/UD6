/**
 * 
 */
package Actividades;

/**
 * @author Marcos
 *
 */
import javax.swing.JOptionPane;

public class Act3App {

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
		if (numPrimo(num)) {
			System.out.println(num + " es un numero primo");
		} else {
			System.out.println(num + " no es un numero primo");
		}
		
	}

	public static boolean numPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

}
