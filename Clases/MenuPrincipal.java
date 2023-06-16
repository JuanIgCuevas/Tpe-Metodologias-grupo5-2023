package plataforma;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;

public class MenuPrincipal {
    private Plataforma934 plataforma;
    private Pasajero registrado;
    private Scanner console;

    public MenuPrincipal(){
    	registrado = null;
    	console = new Scanner(System.in);
        
    	Admin resp = new Admin("24467", "1234", "juanx16", "Juan", "Gomez");
    	Plataforma934 plataforma = new Plataforma934(resp);
        this.plataforma = plataforma;

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/M/yy HH:mm:ss");
        LocalDateTime fecha1 = LocalDateTime.of(2023, 6, 8, 15, 0, 0);
        LocalDateTime fecha2 = LocalDateTime.of(2023, 6, 8, 18, 0, 0);
        LocalDateTime fecha3 = LocalDateTime.of(2023, 6, 8, 11, 0, 0);
        LocalDateTime fecha4 = LocalDateTime.of(2023, 6, 8, 14, 0, 0);
        LocalDateTime fecha5 = LocalDateTime.of(2023, 6, 8, 21, 0, 0);
        LocalDateTime fecha6 = LocalDateTime.of(2023, 6, 8, 23, 0, 0);
		Micro m1 = new Micro(40, "condor", TipoDeAsiento.ejecutivo);
		Micro m2 = new Micro(50,"rapido", TipoDeAsiento.semicama);
		Viaje viaje1 = new Viaje(m1, 1, "tandil", "mardel", fecha1, fecha2, 7000);
		Viaje viaje2 = new Viaje(m2, 2,"azul", "mardel", fecha3, fecha4, 6000);
		Viaje viaje3 = new Viaje(m1, 3,"tandil", "mardel", fecha5, fecha6, 6500);
		plataforma.addViaje(viaje1);
		plataforma.addViaje(viaje2);
		plataforma.addViaje(viaje3);
		
		Pasajero pasajero1 = new Pasajero("12345678", "Santiago", "Rodriguez", "1234", "santi@gmail.com");
		Pasajero pasajero2 = new Pasajero("13345678", "Camila", "Ferreras", "1234", "cami@gmail.com");
		Pasajero pasajero3 = new Pasajero("14345678", "Juan", "Cuevas", "1234", "juan@gmail.com");
		Pasajero pasajero4 = new Pasajero("15345678", "Enzo", "Heredia", "1234", "enzo@gmail.com");
		plataforma.addPasajero(pasajero1);plataforma.addPasajero(pasajero2);
		plataforma.addPasajero(pasajero3);plataforma.addPasajero(pasajero4);    
    }

    public void ingresarSistema(String dni){
        registrado = plataforma.ingresarAlSistema(dni);

        if(registrado == null){
            System.out.println("\n No existe ningun pasajero con el dni provisto.\n Desea registrase? (Y/N)");
            String respuesta = console.next();
            if(respuesta.equalsIgnoreCase("N"))
                exit();
            //Se crea paciente por defecto
            registrado = plataforma.registrarPasajero(dni,"n","n","n","n"); 
        }
        showMenu();
    }

    public void exit(){
        registrado = null;
        console.close();;
        System.out.println("\nHasta luego!");
        System.exit(0);
    }


    public void showMenu(){
        System.out.println("\n Bienvenido: "+registrado.getNombre() + " " + registrado.getApellido());
        System.out.println("\nIngrese un Origen para filtrar");
        String origen = console.nextLine();
        System.out.println("\nIngrese un Destino para filtrar");
        String destino = console.nextLine();
        
        Filtro filtro = null;
        Filtro filtro1 = null;
        if(!origen.isEmpty()) {
        	filtro =  new FiltroOrigen(origen);
        }
        if(!destino.isEmpty()) {
        	filtro1 =  new FiltroDestino(destino);
        }
        Filtro filtro2 = new FiltroAnd(filtro, filtro1);
        
        ArrayList<Viaje> coincidentes = plataforma.buscarPasaje(filtro2);
        if(coincidentes.size() == 0){
            System.out.println("\n La busqueda no retorno resultados");
            exit();
        }
        System.out.println("\nResultado de la busqueda:\n");
        System.out.println(coincidentes); //Imprime todo?
     // se deberia seleccionar un viaje, que ingrese uno de la lista de coincidentes, 
    	System.out.println("\nSeleccione un viaje para comprar pasajes\n");
    	String nroViaje = console.nextLine();
    	int nroviaje = Integer.parseInt(nroViaje);
    	
    	Viaje viajeElegido = plataforma.getViajes().get(nroviaje-1);
    	if(viajeElegido == null)
    		System.out.println("\nEl viaje elegido no coincide con lo mostrado.\n");
    	else
    	{
    		System.out.println("\nGenial, viaje solicitado:\n");
    		System.out.println(viajeElegido);
    		System.out.println("\n¿Que metodo utilizara para pagar?\n");
    		System.out.println("\n1-Efectivo\n");
    		System.out.println("\n2-Tarjeta de credito\n");
    		System.out.println("\n3-Tarjeta de debito\n");
    		String metodoPago = console.nextLine();
    		switch (metodoPago) {
    	    case "1":
    	        System.out.println("Su pago en efectivo debe realizarse en la sucursal");
    	        break;
    	    case "2":
    	        System.out.println("El pago se acreditara a su tarjeta asociada");
    	        break;
    	    case "3":
    	        System.out.println("El pago se acreditara a su tarjeta asociada");
    	        break;
    	    default:
    	        System.out.println("Opción no válida");
    	        break;
    	}
        }
    }
}
    
//    public void comprarPasaje() {
//    	// se deberia seleccionar un viaje, que ingrese uno de la lista de coincidentes, 
//    	System.out.println("\nSeleccione un viaje para comprar pasajes\n");
//    	int nroViaje = console.nextLine();
//    	
//    }
 
   
  
        



   // private void seleccionaTurno(ArrayList<Turno> disponibles,Medico seleccionado){
     //   if(disponibles.isEmpty()){
        //    System.out.println("\n El medico no tiene turnos disponibles actualmente");
       //     exit();
     //   }

      //  System.out.println("\nTurnos disponibles");
    //    for(Turno t:disponibles)
  //          System.out.println("\n"+t.toString());
//
     //   System.out.println("\nIngrese el turno que desea registrar (1-" + disponibles.size() + ")\n");
       // int entrada = console.nextInt();
    //    if(entrada < 0 || entrada > disponibles.size()){
    //        System.out.println("\nValor invalido");
    //        exit();
      //  }
  //      Turno turnoSeleccionado = disponibles.get(entrada-1);
//
    //    if(inst.sacarTurno(this.registrado, turnoSeleccionado))
    //        System.out.println("\nTurno registrado exitosamente!");
    //}

