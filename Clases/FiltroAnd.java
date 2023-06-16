package plataforma;

public class FiltroAnd implements Filtro{
	//Atributos
	private Filtro f1;
	private Filtro f2;
	//Constructor
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	//Metodos
	public boolean cumple(Viaje v) {
		return f1.cumple(v) && f2.cumple(v);
	}
}
