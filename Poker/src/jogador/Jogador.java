package jogador;

public class Jogador {
	
	private int id;
	private String nome;
	private int vitorias;
	private int derrotas;
	
	public double calculaAproveitamento(int vitorias, int derrotas){
		double soma = vitorias+derrotas;
		double divisao = vitorias/soma;
		
		return divisao*100;
	}
	
	public Jogador(int id, String nome, int vitorias, int derrotas) {
		this.id = id;
		this.nome = nome;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

}
