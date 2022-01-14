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
import javax.swing.JOptionPane;

public class Act10App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearArray();
	}

	public static void crearArray() {
		int array[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Indtroduce la longitud de la array"))];
		randomPrimos(array.length, array);
	}

	public static void randomPrimos(int numero, int array[]) {
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero minimo del random"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero maximo del random"));
		int primos[] = new int[array.length];

		for (int i = 0; i < primos.length; i++) {
			double random = Math.random() * (max - min) + 0;
			if (numPrimo((int) random)) {
				primos[i] = (int) random;
			} else {
				i--;
			}
		}
		mostrar(primos);
	}

	public static void mostrar(int array[]) {
		int max=0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("La posicion de la array: " + i + " tiene un valor de " + array[i]);
			for (int j = 0; j < array.length; j++) {
				if (max < array[i]) {
					max=array[i];
				}
			}
		}
		System.out.println("El numero primo mas grande es: "+ max);

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
