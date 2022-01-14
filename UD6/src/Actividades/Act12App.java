/**
 * 
 */
package Actividades;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Marcos
 *
 */
public class Act12App {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamano = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el tamano del array"));
		int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero en el que acabe"));
		int array[] = new int[tamano];
		rellenarArray(array);
		mostrarArray(array, numFinal);
	}

	public static void rellenarArray(int array[]) {

		Random claseRandom = new Random(); 

		for (int i = 0; i < array.length; i++) {
			int n1 = claseRandom.nextInt(300);
			array[i] = n1;
		}
	}

	public static void mostrarArray(int array[], int numfinal) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == numfinal) {
				System.out.println(array[i] + " acaba en " + numfinal);
			}
		}
	}

}
