/**
 * 
 */
package Actividades;

/**
 * @author Marcos
 *
 */
import javax.swing.JOptionPane;

public class Act8App {

	/**
	 * @param args
	 */
	public static int valores[] = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rellenarArray(valores);
	}

	public static void mostrarArray(int valores[]) {
		for (int i = 0; i < valores.length; i++) {
			System.out.println("La posicion de la array: "+i+ " tiene un valor de "+valores[i]);
		}
	}

	public static void rellenarArray(int valores[]) {
		for (int i = 0; i < 10; i++) {
			String text_num = JOptionPane.showInputDialog("Introduce un numero");
			int num = Integer.parseInt(text_num);
			valores[i]=num;
		}
		mostrarArray(valores);
	}

}
