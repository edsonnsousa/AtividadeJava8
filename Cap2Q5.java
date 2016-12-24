import javax.swing.JOptionPane;



public class Q5 {
	public static void main(String[] args) {
		String info, msg;
		int anos;
		
		msg = "Bem Vindo!";
		
		Contribuinte contribuinte = new Contribuinte();
		info = JOptionPane.showInputDialog("Idade :");
		contribuinte.idade = Integer.parseInt(info);
		
		info = JOptionPane.showInputDialog("Sexo: ");
		contribuinte.sexo = info;
		
		info = JOptionPane.showInputDialog("-Anos de Contribuicao: ");
		contribuinte.anos = Integer.parseInt(info);
		
		if (contribuinte.sexo == "M"){
			if (contribuinte.idade > 65 || contribuinte.anos > 35){
				JOptionPane.showMessageDialog(null, msg);
			} else {
				anos = 35 - contribuinte.anos;
				JOptionPane.showMessageDialog(null, "Faltam " + anos + "Anos");
			}
		} else {
			if (contribuinte.idade > 60 || contribuinte.anos > 30){
				JOptionPane.showMessageDialog(null, msg);
			} else {
				anos = 30 - contribuinte.anos;
				JOptionPane.showMessageDialog(null, "Faltam " + anos + "ANos");
			}
		}
		}
		
	}
