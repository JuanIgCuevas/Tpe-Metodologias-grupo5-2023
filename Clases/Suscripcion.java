package plataforma;
public class Suscripcion {
	//Atributos
	private String origen, destino;
	//Constructor
	public Suscripcion(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
	}
	//Metodos
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
	
}
