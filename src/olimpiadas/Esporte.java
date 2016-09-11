package olimpiadas;

public abstract class Esporte {
	
	private int id;
	private String nome;
	
	public Esporte(int id, String nome){
		this.setId(id);
		this.setNome(nome);
	}
	
	public abstract double calculaPontuacao();

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
	
}