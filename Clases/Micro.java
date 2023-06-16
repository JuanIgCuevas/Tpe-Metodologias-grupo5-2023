package plataforma;
import java.util.*;

public class Micro {
	//Atributos
	private int cantAsientos;
	private String empresa;
	private TipoDeAsiento tipo;
	private HashMap<Viaje, ArrayList<Asiento>> viajes;
	//Constructor
	public Micro (int cantAsientos, String empresa, TipoDeAsiento tipo) {
		this.cantAsientos = cantAsientos;
		this.empresa = empresa;
		this.tipo = tipo;
		this.viajes = new HashMap<Viaje, ArrayList<Asiento>>();
	}
	//Metodos
	public int getCantAsientos() {
		return cantAsientos;
	}

	public void setCantAsientos(int cantAsientos) {
		this.cantAsientos = cantAsientos;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public TipoDeAsiento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeAsiento tipo) {
		this.tipo = tipo;
	}

	public void addViaje(Viaje viaje, ArrayList<Asiento> asientos) {
		this.viajes.put(viaje, asientos);
	}
	@Override
	public String toString() {
		return "[cantAsientos=" + cantAsientos + ", empresa=" + empresa + ", tipo=" + tipo + ", viajes=" + viajes
				+ "]";
	}
	
	
	
}