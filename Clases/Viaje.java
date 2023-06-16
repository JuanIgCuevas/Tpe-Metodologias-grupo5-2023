package plataforma;
import java.time.LocalDateTime;
import java.util.*;
public class Viaje implements Comparable {
	//Atributos
	private int numViaje;
	private String origen, destino;
	private LocalDateTime diaHoraSalida;
	private LocalDateTime diaHoraLlegada;
	private float precio;
	private Micro micro;
	//Constructor
	public Viaje(Micro micro, int numViaje, String origen, String destino, LocalDateTime fecha1, LocalDateTime fecha2, float precio) {
		this.numViaje = numViaje;
		this.origen = origen;
		this.destino = destino;
		this.diaHoraSalida = fecha1;
		this.diaHoraLlegada = fecha2;
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
	public LocalDateTime getDiaHoraSalida() {
		return diaHoraSalida;
	}
	public void setDiaHoraSalida(LocalDateTime diaHoraSalida) {
		this.diaHoraSalida = diaHoraSalida;
	}
	public LocalDateTime getDiaHoraLlegada() {
		return diaHoraLlegada;
	}
	public void setDiaHoraLlegada(LocalDateTime diaHoraLlegada) {
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
	@Override
	public String toString() {
		return "\n numViaje=" + numViaje + "\n origen=" + origen + "\n destino=" + destino + "\n diaHoraSalida="
				+ diaHoraSalida + "\n diaHoraLlegada=" + diaHoraLlegada + "\n precio=" + precio + "\n";
	}
	
	
	
}
