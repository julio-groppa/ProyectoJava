package obj;

public abstract class Persona {

	private int dni, edad;
	private String nombre, apellido;
	private char sexo;

	public Persona() {
	}

	public Persona(int dni, int edad, String nombre, String apellido, char sexo) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
