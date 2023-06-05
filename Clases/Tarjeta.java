public class Tarjeta {
	//Atributos
	private int nroTarjeta;
	private String bancoEmisor, marca;
	//Constructor
	public Tarjeta(int nroTarjeta, String bancoEmisor, String marca) {
		super();
		this.nroTarjeta = nroTarjeta;
		this.bancoEmisor = bancoEmisor;
		this.marca = marca;
	}
	//Metodos
	public int getNroTarjeta() {
		return nroTarjeta;
	}
	public void setNroTarjeta(int nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}
	public String getBancoEmisor() {
		return bancoEmisor;
	}
	public void setBancoEmisor(String bancoEmisor) {
		this.bancoEmisor = bancoEmisor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
