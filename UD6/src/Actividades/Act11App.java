/**
 * 
 */
package Actividades;

import java.util.Iterator;

import javax.swing.JOptionPane;

/**
 * @author Marcos
 *
 */
public class Act11App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearArray();

	}
	public static void crearArray() {
		int array[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Indtroduce la longitud de las arrays"))];
		int array2[] = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			double random = Math.random() * (100 - 1) + 0;
			double random2 = Math.random() * (100 - 1) + 0;
			array[i]= (int) random;
			array2[i]= (int) random2;
		}
		
		mostrarArray(array, array2, multiplicarArrays(array, array2));
		
	}
	
	public static int[] multiplicarArrays(int array[],int array2[]) {
		int arrayMulti[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayMulti[i] = array[i] * array2[i];
		}	
		return arrayMulti;
	}
	
	public static void mostrarArray(int array[],int array2[],int array3[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("La posicion "+i+ "de la array 1: tiene un valor de "+array[i]);
			System.out.println("La posicion "+i+ "de la array 2: tiene un valor de "+array2[i]);
			System.out.println("La posicion "+i+" de la arrayMulti es: tiene un valor de "+array3[i]);
		}
		
		
	}
	
	

}
