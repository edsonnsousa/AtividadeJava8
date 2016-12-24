import java.util.Scanner;

public class Q2{
	public static void main(String[]args){
		Scanner info = new Scanner(System.in);
		int lider, lanterna, diferen;
		System.out.print("-Pontos lider: ");
		lider = info.nextInt();
		System.out.print("-Pontos laterna: ");
		lanterna = info.nextInt();
		diferen = lider - lanterna;
		System.out.printf("-O lanterna precisa de %d vitorias.", diferen/3);
	}
}