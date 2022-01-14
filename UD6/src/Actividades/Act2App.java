/**
 * 
 */
package Actividades;

/**
 * @author Marcos
 *
 */
import javax.swing.JOptionPane;
public class Act2App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dialogos();
	}
	
	public static void dialogos() {
		String text_repeticiones = JOptionPane.showInputDialog("Indroduce cuantas veces se va a hacer el random");
		int repeticiones = Integer.parseInt(text_repeticiones);
		String text_min = JOptionPane.showInputDialog("Indroduce el numero mas pequeno");
		int min = Integer.parseInt(text_min);
		String text_max = JOptionPane.showInputDialog("Indroduce el numero mas grande");
		int max = Integer.parseInt(text_max);
		rellenar(repeticiones, min, max);
		
	}
	 public static void rellenar(int rango,int num1,int num2) {
	        for(int i = 0; i < rango; i++) {
	            System.out.println(generarNum(num1, num2));
	        }
	    }
	    public static int generarNum(int num1, int num2){
	        return ((int)Math.floor(Math.random()*(num2-num1) + num1));
	    }

}
