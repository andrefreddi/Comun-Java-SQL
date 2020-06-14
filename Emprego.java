package exemplo;

public class Emprego {
	private int id;
	private String nome;
	private int idemprego;
	
	public Emprego() { }
	
	public Emprego(int id, String nome, int idemprego) {
		this.id = id;
		this.nome = nome;
		this.idemprego = idemprego;
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

	public int getidemprego() {
		return idemprego;
	}

	public void setidemprego(int idemprego) {
		this.idemprego = idemprego;
	}

	@Override
	public String toString() {
		return "emprego [id=" + id + ", nome=" + nome + ", idemprego=" + idemprego + "]";
	}
	
	
	
}
