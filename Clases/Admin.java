package plataforma;

public class Admin extends Usuario{
	//Atributos
	//Constructor
	public Admin(String dni, String nombre, String apellido, String clave, String mail) {
		super(dni, nombre, apellido, clave, mail);
	}
	
	
	
	//Metodos
	public void agregarEmpresa(Empresa empresa) {
		//Codigo
	}
	public void quitarEmpresa(String nombre) {
		//Codigo
	}
	public void agregarMicro(Micro m, Empresa empresa){
		//Codigo
	}
	public void quitarMicro(Micro m, Empresa empresa){
		//Codigo
	}
	public void agregarConvenio(Empresa empresa){
		//Codigo
	}
	public void quitarConvenio(Empresa empresa){
		//Codigo
	}
}