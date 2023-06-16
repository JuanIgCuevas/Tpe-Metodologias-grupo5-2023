package plataforma;
public class Convenio {
	//Atributos
	private Empresa empresa;
	private float descuento;
	private int horaAvisa;
	private int cantAsientosLibres;
	//Constructor
	public Convenio(Empresa empresa, float descuento, int horaAvisa, int cantAsientosLibres){
		this.empresa = empresa;
		this.descuento = descuento;
		this.horaAvisa = horaAvisa;
		this.cantAsientosLibres = cantAsientosLibres; 
	}
	//Metodos
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	public int getHoraAvisa() {
		return horaAvisa;
	}
	public void setHoraAvisa(int horaAvisa) {
		this.horaAvisa = horaAvisa;
	}
	public int getCantAsientosLibres() {
		return cantAsientosLibres;
	}
	public void setCantAsientosLibres(int cantAsientosLibres) {
		this.cantAsientosLibres = cantAsientosLibres;
	}
	
	
}
