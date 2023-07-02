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
		System.out.println("Ingrese Nro de Tarjeta: ");
		String nroTarjeta = console.nextLine();
    	int numTarj = Integer.parseInt(nroTarjeta);
		System.out.println("Ingrese Banco emisor: ");
		String banco = console.nextLine();
		System.out.println("Ingrese Marca: ");
		String marca = console.nextLine();
		Tarjeta tarj = new Tarjeta(numTarj, banco, marca);
		this.tarjetas.add(tarj);
		System.out.println("La tarjeta fue ingresada exitosamente.");
	}

	public void eliminarTarjeta() {
		System.out.println("Ingrese Nro de Tarjeta que desea eliminar: ");
		String nroTarjeta = console.nextLine();
		int numTarj = Integer.parseInt(nroTarjeta); 
		for(int i=0; i< tarjetas.size(); i++) {
			if(numTarj == tarjetas.get(i).getNroTarjeta()) {
				tarjetas.remove(i);
			}
		}
		System.out.println("La tarjeta fue eliminada corectamente.");
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

	public void showTarjetas() {
		if(tarjetas.size()==0) {
			System.out.println("No tiene ninguna tarjeta asociada.");
		}
		else {
			System.out.println("Tarjetas asociadas:");
			for(Tarjeta t: tarjetas) {
				System.out.println(t.toString());
			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		Pasajero pasajero = (Pasajero) obj;
		return pasajero.getDNI() == super.getDNI();
	}

}