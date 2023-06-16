package plataforma;
import java.util.*;
public class FiltroEmpresa implements Filtro{
	//Atributos
	private String empresa;
	//Constructor
	public FiltroEmpresa(String empresa) {
		this.empresa = empresa;
	}
	//Metodos
	public boolean cumple(Viaje v){
		return empresa.equals(v.getMicro().getEmpresa()); 
	}
}