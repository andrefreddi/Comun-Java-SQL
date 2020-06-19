package exemplo;

public class Produtora {
	private int id_produtora;
	private String nome_produtora;
	
	public Produtora() { }
	
	public Produtora(int id_produtora, String nome_produtora) {
		this.id_produtora = id_produtora;
		this.nome_produtora = nome_produtora;
	}

	public int getId_produtora() {
		return id_produtora;
	}

	public void setId_produtora(int id_produtora) {
		this.id_produtora = id_produtora;
	}

	public String getNome_produtora() {
		return nome_produtora;
	}

	public void setNome_produtora(String nome_produtora) {
		this.nome_produtora = nome_produtora;
	}

	@Override
	public String toString() {
		return "Produtora [id_produtora=" + id_produtora + ", nome_produtora=" + nome_produtora + "]";
	}
	
	
	
}
