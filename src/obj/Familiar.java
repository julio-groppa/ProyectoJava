package obj;

public class Familiar extends Persona {

	private String parentesco;
	private Titular titular;

	public Familiar() {
	}

	public Familiar(String parentesco, Titular titular) {
		this.titular = titular;
		this.parentesco = parentesco;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

}
