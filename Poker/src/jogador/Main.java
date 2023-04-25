package jogador;

public class Main {

	public static void main(String[] args) {
		
		double result;
		
		Jogador jogador = new Jogador(1, "Joao", 5 , 6);
		
		int vitorias = jogador.getVitorias();
		int derrotas = jogador.getDerrotas();
		
		result = jogador.calculaAproveitamento(vitorias, derrotas);
		
		System.out.printf("%.2f%%", result);
	}

}
