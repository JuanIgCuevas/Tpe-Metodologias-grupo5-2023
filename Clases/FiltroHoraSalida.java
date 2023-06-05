import java.util.*;
public class FiltroHoraSalida implements Filtro{
	//Atributos
	private int horaSalida;
	//Constructor
	public FiltroHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	//Metodos
	public boolean cumple(Viaje v){
		return v.getDiaHoraSalida().getHours() == horaSalida; 
	}
}
