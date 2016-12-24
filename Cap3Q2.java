package Cap3;
import javax.swing.JOptionPane;

public class Q2 {
	public static void main(String[] args) {
		int[] valor = new int[4];
		int total = 0, max = 0, min;
		String resistencias = "";
		
		for (int i = 0; i < 4; i++){
			valor[i] = getInt("Insira o valor " + (i+1) + "º resistor: ");
			total += valor[i];
			resistencias += String.valueOf(valor[i]) + " ";
		}
		min = valor[0];
		for (int i = 0; i < valor.length; i++) {
	         if (min > valor[i]) {
	        	 min = valor[i];
	         }
	         if (max < valor[i]) {
	             max = valor[i];
	         }
	        }
		JOptionPane.showMessageDialog(null, "Resisencias: \n" + resistencias + 
				"\nMaior: " + max +
				"\n Menor: " + min +
				"\n Total : " + total);
		}
	
	
		
	private static int getInt(String msg){
		int valor = Integer.parseInt(JOptionPane.showInputDialog(msg));
		return valor;
	}
}
