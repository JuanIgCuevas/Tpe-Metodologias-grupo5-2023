package plataforma;
import java.util.Date;
public class FiltroDiaSalida implements Filtro{
	//Atributos
		private int diaSalida;
		//Constructor
		public FiltroDiaSalida(int dia) {
			this.diaSalida = diaSalida;
		}
		//Metodos
		public boolean cumple(Viaje v) {
			return v.getDiaHoraSalida().getDay() == diaSalida;
		}
}
