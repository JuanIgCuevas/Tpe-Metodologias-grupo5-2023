import java.util.*;
public class FiltroHoraLlegada implements Filtro {
	//Atributos
	private int horaLlegada;
	//Constructor
	public FiltroHoraLlegada(int horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	//Metodos
	public boolean cumple(Viaje v){
		return v.getDiaHoraLlegada().getHours() == horaLlegada; 		}
}

