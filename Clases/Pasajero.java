import java.util.*;
public class Pasajero extends Usuario{
	//Atributos
	private Pasaje pasaje;
	private boolean suscripto;
	private ArrayList<Tarjeta> tarjeta;
	private ArrayList<Suscripcion> suscripciones;
	//Constructor
	public Pasajero(int DNI, String nombre, String apellido, String clave, String mail,
			Pasaje pasaje, Suscripcion suscripcion) {
		super(DNI, nombre, apellido, clave, mail);
		this.pasaje = pasaje;
		this.suscripto = false;
		ArrayList<Tarjeta> tarjeta = new ArrayList<Tarjeta>();
		ArrayList<Suscripcion> suscripciones = new ArrayList<Suscripcion>() ;
	}
	//Metodos
	public void verPasaje(){
		//Codigo	
	}
	public void cancelarPasaje(Pasaje p){
		//Codigo
	}
	public void cargarTarjeta(){
		//Codigo
	}
	public void eliminarTarjeta(){
		//Codigo
	}
	public void asignarPasajes(Pasajero p){
		//Codigo
	}
	public void seleccionarAsiento(Asiento a){
		//Codigo
	}
	public void realizarPago(){
		//Codigo
	}
	public void addSuscripcion(Suscripcion s) {
		//Codigo
	}
	public void eliminarSuscripcion(Suscripcion s) {
		//Codigo
	}
}
