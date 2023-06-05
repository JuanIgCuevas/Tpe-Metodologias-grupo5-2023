public class FiltroOrigen implements Filtro{
	//Atributos
	private String origen;
	//Constructor
	public FiltroOrigen (String origen){
		this.origen = origen;
	}
	//Metodos
	public boolean cumple(Viaje v) {
		return v.getOrigen()== origen;
	}
}
