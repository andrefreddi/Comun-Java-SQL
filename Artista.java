package exemplo;

public class Artista {
	private int id_artista;
	private String nome_artista;
	
	public Artista() { }
	
	public Artista(int id_artista, String nome_artista) {
		this.id_artista = id_artista;
		this.nome_artista = nome_artista;
	}

	public int getId_artista() {
		return id_artista;
	}

	public void setId_artista(int id_artista) {
		this.id_artista = id_artista;
	}

	public String getNome_artista() {
		return nome_artista;
	}

	public void setNome_artista(String nome_artista) {
		this.nome_artista = nome_artista;
	}

	@Override
	public String toString() {
		return "Artista [id_artista=" + id_artista + ", nome_artista=" + nome_artista + "]";
	}
	
	
	
}
