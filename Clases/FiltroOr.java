package plataforma;
public class FiltroOr implements Filtro{
	//Atributos
	private Filtro f1, f2;
	//Constructor
	public FiltroOr (Filtro f1, Filtro f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	//Metodos
	public boolean cumple(Viaje v) {
		return f1.cumple(v) || f2.cumple(v);
	}
}
