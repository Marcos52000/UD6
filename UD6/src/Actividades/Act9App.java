/**
 * 
 */
package Actividades;

/**
 * @author Marcos
 *
 */
import javax.swing.JOptionPane;

public class Act9App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearArray();
	}

	public static void crearArray() {
		int array[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Indtroduce la longitud de la array"))];
		for (int i = 0; i < array.length; i++) {
			double random = Math.random() * (9 - 0) + 0;
			array[i] = (int) random;
		}
		mostrarArray(array);
	}

	public static void mostrarArray(int array[]) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("La posicion de la array: "+i+ " tiene un valor de "+array[i]);
			total=total+array[i];
		}
		System.out.println("Suma del total del array: "+total);
	}

}
