import java.util.*;
public class FiltroDestino {
	//Atributos
	private String destino;
	//Constructor
	public FiltroDestino(String destino){
		this.destino = destino;
	}
	//Metodos
	public boolean cumple(Viaje v) {
		return v.getDestino() == destino;
	}
}
