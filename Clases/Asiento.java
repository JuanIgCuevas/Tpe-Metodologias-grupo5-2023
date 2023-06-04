public class Asiento {
	//Atributos
	private boolean disponible;
	private int numero, piso;
	private TipoDeAsiento tipo;
	//Constructor
	public Asiento(int numero, int piso, TipoDeAsiento tipo){
		this.disponible = true;
		this.numero = numero;
		this.piso = piso;
		this.tipo = tipo;
	}
	//Metodos
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public TipoDeAsiento getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeAsiento tipo) {
		this.tipo = tipo;
	}
}
