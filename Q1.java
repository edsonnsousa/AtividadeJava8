import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader info = new BufferedReader(new InputStreamReader(System.in));
        float ValorP, perc;
        String valor;
        System.out.print("-Valor Produto: ");
        valor = info.readLine();
        ValorP = Float.parseFloat(valor);
        System.out.print("-Porcentagem de Desconto: ");
        valor = info.readLine();
        perc = Float.parseFloat(valor);
        System.out.printf("-Desconto: R$ %.2f\n", (ValorP * (perc/100)));
        System.out.printf("-Valor com esconto: R$ %.2f\n", ValorP - (ValorP * (perc/100)));
    }
}