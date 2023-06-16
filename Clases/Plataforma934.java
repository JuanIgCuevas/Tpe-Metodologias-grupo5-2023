package plataforma;
import java.util.*;
public class Plataforma934 {
	//Atributos
	private Admin admin;
	private ArrayList<Empresa> listEmpresa;
	private ArrayList<Convenio> convenios;
	private ArrayList<Pasajero> pasajeros;
	private ArrayList<Viaje> viajes;
	//Constructor
	public Plataforma934(Admin admin) {
		this.admin = admin;
		this.listEmpresa= new ArrayList<Empresa>();
		this.convenios= new ArrayList<Convenio>();
		this.pasajeros= new ArrayList<Pasajero>();
		this.viajes= new ArrayList<Viaje>();
	}
	//Metodos
	public void loguearse(){
		//Codigo hola
	}
	public Pasajero ingresarAlSistema(String dni){
		for(Pasajero pasajeroActual: pasajeros) {
    		if (pasajeroActual.getDNI().equals(dni)) return pasajeroActual;
    	}
    	return null;
	}
   
    public Pasajero registrarPasajero (String 	dni, String nombre, String apellido, String clave, String mail) {
    	return new Pasajero(dni,nombre, apellido,clave,mail);
    }
	
	public void compraPasaje(){
		//Codigo
	}
	
	public ArrayList<Viaje> buscarPasaje(Filtro filtro){
        ArrayList<Viaje> salida = new ArrayList<>();
        for(Viaje m: this.viajes){
        	if(filtro.cumple(m)) {
            	salida.add(m);
        }}
        return salida;
	}
	//public ArrayList<Viaje> filtrarMicros(Filtro filtro){
		//Codigo
	//}
	public void avisoSuscripcion() {
		//Codigo
	}
	public void addPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
	}
	public void addEmpresa(Empresa empresa) {
		this.listEmpresa.add(empresa);
	}
	public void addViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}
	
	public ArrayList<Viaje> getViajes(){
		return  new ArrayList<Viaje>(this.viajes);
	}
	
}
