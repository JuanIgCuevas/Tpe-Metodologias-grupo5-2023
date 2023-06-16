package plataforma;
import java.util.*;
public class FiltroHoraLlegada implements Filtro {
	//Attributes
	private int horaLlegada;
	//Constructor
	public FiltroHoraLlegada(int horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	//metodos
	public boolean cumple(Viaje v){
		return v.getDiaHoraLlegada().getHour() == horaLlegada; 		}
}

