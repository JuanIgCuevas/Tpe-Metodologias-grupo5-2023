import java.util.*;
public class FiltroEmpresa {
	//Atributos
	private String empresa;
	//Constructor
	public FiltroEmpresa(String empresa) {
		this.empresa = empresa;
	}
	//Metodos
	public boolean cumple(Viaje v){
		return v.getMicro().getEmpresa() == empresa; 		
	}
}