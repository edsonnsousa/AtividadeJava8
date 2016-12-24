package Cap3;
import javax.swing.JOptionPane;

public class Q4 {

	public static void main(String[] args) {
		int num;
		String result = "";
		num = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
		for (int i = 1; i <= 10; i++){
			result += num + " x " + i + " = " + (i * num) + "\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}

}