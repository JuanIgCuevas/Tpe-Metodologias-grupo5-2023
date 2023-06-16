package plataforma;
import java.util.*;

public class Pasajero extends Usuario {
	// Atributos
	private Pasaje pasaje;
	private boolean suscripto;
	private ArrayList<Tarjeta> tarjeta;
	private ArrayList<Suscripcion> suscripciones;

	// Constructor
	public Pasajero(String dni, String nombre, String apellido, String clave, String mail) {
		super(dni, nombre, apellido, clave, mail);
		this.pasaje = null;
		this.suscripto = false;
		this.tarjeta = new ArrayList<Tarjeta>();
		this.suscripciones = new ArrayList<Suscripcion>();
	}

	public Pasaje getPasaje() {
		return pasaje;
	}

	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}

	public boolean isSuscripto() {
		return suscripto;
	}

	public void setSuscripto(boolean suscripto) {
		this.suscripto = suscripto;
	}

	public ArrayList<Tarjeta> getTarjeta() {
		return tarjeta;
	}

	public ArrayList<Suscripcion> getSuscripciones() {
		return suscripciones;
	}

	// Metodos
	public void verPasaje() {
		// Codigo
	}

	public void cancelarPasaje(Pasaje p) {
		// Codigo
	}

	public void cargarTarjeta() {
		// Codigo
	}

	public void eliminarTarjeta() {
		// Codigo
	}

	public void asignarPasajes(Pasajero p) {
		// Codigo
	}

	public void seleccionarAsiento(Asiento a) {
		// Codigo
	}

	public void realizarPago() {
		// Codigo
	}

	public void addSuscripcion(Suscripcion s) {
		// Codigo
	}

	public void eliminarSuscripcion(Suscripcion s) {
		// Codigo
	}

	@Override
	public boolean equals(Object obj) {
		Pasajero pasajero = (Pasajero) obj;
		return pasajero.getDNI() == super.getDNI();
	}

}