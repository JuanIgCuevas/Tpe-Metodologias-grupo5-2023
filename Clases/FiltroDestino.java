package plataforma;
import java.util.*;
public class FiltroDestino implements Filtro {
	//Atributos
	private String destino;
	//Constructor
	public FiltroDestino(String destino){
		this.destino = destino;
	}
	//Metodos
	public boolean cumple(Viaje v) {
		return v.getDestino().equals(destino);
	}
}
