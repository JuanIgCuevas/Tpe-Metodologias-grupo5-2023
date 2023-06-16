package plataforma;
public class Usuario {
	//Atributos
	private String dni;
	private String nombre, apellido, clave, mail;
	//Constructor
	public Usuario (String dni,String nombre,String apellido,String clave,String mail) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.mail = mail;
	}
	//Metodos
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
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