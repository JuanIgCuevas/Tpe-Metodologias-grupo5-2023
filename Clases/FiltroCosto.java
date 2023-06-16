package plataforma;
import java.util.Date;
public class FiltroCosto implements Filtro{
	//Atributos
	private float costo;
	//Constructor
	public FiltroCosto (float costo) {
		this.costo = costo;
	}
	//Metodos
	public boolean cumple(Viaje v) {
		return v.getPrecio() == costo;
	}
}
