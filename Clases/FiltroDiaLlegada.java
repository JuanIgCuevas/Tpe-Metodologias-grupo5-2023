import java.util.*;
public class FiltroDiaLlegada implements Filtro{
	//Atributos
	private int diaLlegada;
	//Constructor
	public FiltroDiaLlegada (int dia) {
		this.diaLlegada = dia;
	}
	//Metodos
	public boolean cumple(Viaje v) {
		return v.getDiaHoraLlegada().getDay() == diaLlegada;
	}
}
