package exemplo;

public class LocalEmpresa {
	private int idemprego;
	private String local;
	
	public LocalEmpresa() { }
	
	public LocalEmpresa(int idemprego, String local) {
		this.idemprego = idemprego;
		this.local = local;
	}

	public int getidemprego() {
		return idemprego;
	}

	public void setidemprego(int idemprego) {
		this.idemprego = idemprego;
	}

	public String getlocal() {
		return local;
	}

	public void setlocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "LocalEmpresa [idemprego=" + idemprego + ", local=" + local + "]";
	}
	
	
	
}
