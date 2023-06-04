public class Usuario {
	//Atributos
	private int DNI;
	private String nombre, apellido, clave, mail;
	//Constructor
	public Usuario (int DNI,String nombre,String apellido,String clave,String mail) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.mail = mail;
	}
	//Metodos
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
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
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
