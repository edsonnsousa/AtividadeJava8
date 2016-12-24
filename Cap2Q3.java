import javax.swing.JOptionPane;

public class Q3 {
	public static void main(String[]args){
		double renal, transacao,percentImposto, valorImposto;
		
		renal          =   getDouble("Valor venal: ");
		transacao      =   getDouble("Valor transacao: ");
		percentImposto  =   getDouble("Porcentagem imposto: ");
		
		if(renal >= transacao){
			valorImposto = Imposto(renal, percentImposto);
		}else
			valorImposto = Imposto(transacao, percentImposto);
		
		showMsg("Imposto: " + valorImposto);
		
	}
	
	private static double Imposto(double valor,double taxa){
		return valor * (taxa / 100);
	}
	
	private static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	private static double getDouble(String msg){
		String result = JOptionPane.showInputDialog(msg);
		return Double.valueOf(result);
	}
}
