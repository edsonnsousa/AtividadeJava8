package Cap3;
import javax.swing.JOptionPane;

public class Q3 {
	public static void main(String[] args) {
		final String Padrao = "teste123";
		
		for (int i = 2; i >= 0; i-- ){
			String user = JOptionPane.showInputDialog("-Login: ");
			String password = JOptionPane.showInputDialog("Senha: ");
			if (user.equals(Padrao) && password.equals(Padrao)){
				JOptionPane.showMessageDialog(null, "Dados Invalidos.");
				break;
			} else {
				if (i !=0){
				JOptionPane.showMessageDialog(null, "Erro!\n" + "Restam " + i + " tentativas");
				} else {
					JOptionPane.showMessageDialog(null, "Fim!");
				}
			}
		}
	}

}
