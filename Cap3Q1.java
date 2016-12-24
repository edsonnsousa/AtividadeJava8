package Cap3;

import javax.swing.JOptionPane;

public class Q1 {
	  public static void main(String[] args) {
				String nome;
				float valor, Final, Desconto;
				int reducao = 0;
				nome = JOptionPane.showInputDialog("Nome ");
				valor = Float.parseFloat(JOptionPane.showInputDialog("Valor: "));
				if (valor > 0) {
					if (valor >= 50 && valor < 200){
						reducao = 5;
					}
					if (valor >= 200 && valor < 500){
						reducao = 6;
					}
					if (valor >= 500 && valor < 1000){
						reducao = 7;
					} else {
						reducao = 8;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Incorreto");
				}
				Desconto = (valor * reducao) / 100;
				Final = valor - Desconto;
				JOptionPane.showMessageDialog(null, "Nome : " + nome +  "\nValor Sem  desconto : R$" + valor + "\nValor  com desconto: R$" + Final);
		  }
	  } 
