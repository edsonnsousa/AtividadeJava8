import javax.swing.JOptionPane;

public class Q4 {
	public static void main(String[] args) {
		float N1, N2, T, media;
		String info;
		
		info = JOptionPane.showInputDialog("Nota 1: ");
		N1 = Float.parseFloat(info);
		
		info = JOptionPane.showInputDialog("Nota 2: ");
		N2 = Float.parseFloat(info);
		
		info = JOptionPane.showInputDialog("Trabalho: ");
		T = Float.parseFloat(info);
		
		media = (float) ((N1 + N2 + T) / 3.0);
		
		if (media >= 6.0){
			JOptionPane.showConfirmDialog(null, "Aprovado!");
		} else {
			JOptionPane.showConfirmDialog(null, "Reprovado!");
		}

	}
}
