import java.util.*;
public class Viaje implements Comparable {
	//Atributos
	private int numViaje;
	private String origen, destino;
	private Date diaHoraSalida, diaHoraLlegada;
	private float precio;
	private Micro micro;
	//Constructor
	public Viaje(Micro micro, int numViaje, String origen, String destino, Date diaHoraSalida, Date diaHoraLlegada, float precio) {
		this.numViaje = numViaje;
		this.origen = origen;
		this.destino = destino;
		this.diaHoraSalida = diaHoraSalida;
		this.diaHoraLlegada = diaHoraLlegada;
		this.precio = precio;
		this.micro = micro;
	}
	//Metodos
	public int getNumViaje() {
		return numViaje;
	}
	public void setNumViaje(int numViaje) {
		this.numViaje = numViaje;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Date getDiaHoraSalida() {
		return diaHoraSalida;
	}
	public void setDiaHoraSalida(Date diaHoraSalida) {
		this.diaHoraSalida = diaHoraSalida;
	}
	public Date getDiaHoraLlegada() {
		return diaHoraLlegada;
	}
	public void setDiaHoraLlegada(Date diaHoraLlegada) {
		this.diaHoraLlegada = diaHoraLlegada;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int compareTo(Viaje v) {
		return this.getNumViaje() - v.getNumViaje();
	}
	public Micro getMicro() {
		return micro;
	}
}
