package plataforma;
import java.util.*;

public class main {

	public static void main(String[] args) throws Exception {
		MenuPrincipal plataforma = new MenuPrincipal();
		
    	Scanner console = new Scanner(System.in);
        System.out.println("\nIngrese su DNI para acceder");
        String dni = console.nextLine();
        
		plataforma.ingresarSistema(dni);
	}
}
