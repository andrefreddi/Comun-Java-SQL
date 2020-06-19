package exemplo;

public class CD {
	private int id_cd;
	private String nome_cd;
	private int id_artista;
	private int id_produtora;
	
	public CD() { }
	
	public CD(int id_cd, String nome_cd, int id_artista, int id_produtora) {
		this.id_cd = id_cd;
		this.nome_cd = nome_cd;
		this.id_artista = id_artista;
		this.id_produtora = id_produtora;
	}

	public int getId_cd() {
		return id_cd;
	}

	public void setId_cd(int id_cd) {
		this.id_cd = id_cd;
	}

	public String getNome_cd() {
		return nome_cd;
	}

	public void setNome_cd(String nome_cd) {
		this.nome_cd = nome_cd;
	}
	
	//==============================
	
	public int getId_artista() {
		return id_artista;
	}

	public void setId_artista(int id_artista) {
		this.id_artista = id_artista;
	}

	//==========================================
	
	public int getId_produtora() {
		return id_produtora;
	}

	public void setId_produtora(int id_produtora) {
		this.id_produtora = id_produtora;
	}
	
	// END
	@Override
	public String toString() {
		return "CD [id_cd=" + id_cd + ", nome_cd=" + nome_cd + ", id_artista" + id_artista + "id_produtora" + id_produtora + "]";
	}
	
	
	
}
