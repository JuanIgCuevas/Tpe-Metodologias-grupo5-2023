package plataforma;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
//from os import System;

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
		
		Pasajero pasajero1 = new Pasajero("12345678", "Santiago", "Rodriguez", "Aa123456", "santi@gmail.com");
		Pasajero pasajero2 = new Pasajero("13345678", "Camila", "Ferreras", "Aa123456", "cami@gmail.com");
		Pasajero pasajero3 = new Pasajero("14345678", "Juan", "Cuevas", "Aa123456", "juan@gmail.com");
		Pasajero pasajero4 = new Pasajero("15345678", "Enzo", "Heredia", "Aa123456", "enzo@gmail.com");
		plataforma.addPasajero(pasajero1);plataforma.addPasajero(pasajero2);
		plataforma.addPasajero(pasajero3);plataforma.addPasajero(pasajero4);    
    }
    
    public void limpiar(int lineas)
    {
    for (int i=0; i < lineas; i++)
    {
    System.out.println("");
    }
    }

    public void ingresarSistema(boolean invitado){
		System.out.println("\nIngrese su DNI para acceder");
		String dni = console.nextLine();
		registrado = plataforma.ingresarAlSistema(dni);

		if(registrado == null){
			System.out.println("\n No existe ningun pasajero con el dni provisto.\n Desea registrase? (Y/N)");
			String respuesta = console.nextLine();
			if(respuesta.equals("Y") || respuesta.equals("y"))
				if(invitado)
					this.registrar(true);
				else
					registrar(false);
			else
				showMenu();
		}else
		{
			System.out.println("\nIngrese su contraseña");
			String contra = console.nextLine();
			while(!registrado.getClave().equals(contra)) {
				System.out.println("\nContraseña incorrecta. Ingresela nuevamente");
				contra = console.nextLine();
			}
		}
		if(invitado) {
			System.out.println("Bienevenid@ " + registrado.getNombre() + " " + registrado.getApellido());
			showMenuLogueo(registrado);
		}
    }

    public void exit(){
        registrado = null;
        console.close();;
        System.out.println("\nHasta luego!");
        System.exit(0);
    }
    
    public void registrar(boolean nuevo) {
    	System.out.println("\nIngrese su DNI");
        String dni = console.nextLine();
        if (plataforma.usuarioExistente(dni)) {
        	//limpiar(10);
        	System.out.println("\nUsted ya esta registrado en el sistema");
        	showMenu();
        }
        else {
	    	System.out.println("\nIngrese su apellido y nombre");
	    	String apellido = console.nextLine();
	    	String nombre = console.nextLine();
	        System.out.println("\nIngrese una contraseña de 8 caracteres, que contenga una minuscula y una mayuscula como minimo:");
	        String contrasenia = console.nextLine();
	        while(!this.verificarPassword(contrasenia)) {
	        	 System.out.println("La contraseña no cumple los requisitos");
	        	 System.out.println("\nPor favor ingrese nuevamente una contraseña");
	        	 contrasenia = console.nextLine();
	        }
	        System.out.println("La contraseña es válida");
	        System.out.println("\nIngrese su email");
	        String email = console.nextLine();
	        Pasajero pasajeronuevo = new Pasajero(dni, nombre, apellido, contrasenia, email);
	        System.out.println("\n¿Quiere asociar una tarjeta?(Y/N)");
	        String respuesta = console.next();
            if(respuesta.equals("Y") || respuesta.equals("y")) {
            	pasajeronuevo.cargarTarjeta();
            }
            //limpiar(70);
            if(nuevo) {
            	plataforma.addPasajero(pasajeronuevo);
            	showMenuLogueo(pasajeronuevo);
            }
        }
        //verificar dni, verificar contra
    }

    public void showMenu(){
    	System.out.println("BIENVENIDO A PLATAFORMA 9 3/4\n 1- Registrarse \n 2- Ingresar \n 3- Ingresar como invitado\n 4- Salir.\n Elija una opcion: ");
    	String opcion = console.nextLine();
//    	int op = Integer.parseInt(opcion);
    	switch (opcion) {
	    case "1":
	        this.registrar(true);
	        break;
	    case "2":
	        this.ingresarSistema(true);
	        break;
	    case "3":
	    	buscarViajes(true,null);
	        break;
	    case "4":
	        this.exit();
	        break;
       default: limpiar(25);
    	   showMenu(); break;
        }
    }
    
    public void showMenuLogueo(Pasajero persona){
    	System.out.println("\nOpciones \n 1- Buscar Transporte \n 2- Administrar Tarjetas \n 3- Desloguearse\n Elija una opcion: ");
    	int op = console.nextInt();
    	switch (op) {
	    case 1:
	        buscarViajes(false, persona);
	        try {
	    		Thread.sleep (5000);
	    		} catch (Exception e) {
	    		// Mensaje en caso de que falle
	    		}
	    	this.showMenuLogueo(persona);
	        break;
	    case 2:
	        System.out.println("Ingrese que opcion desea realizar: \n 1- Cargar Tarjeta \n 2- Eliminar Tarjeta \n 3- Mostrar Tarjetas \n 4-  Volver.");
	        int opT = console.nextInt();
	    	switch (opT) {
	    		case 1: persona.cargarTarjeta(); break;
	    		case 2: persona.eliminarTarjeta(); break;
	    		case 3: persona.showTarjetas(); break;
	    		default: this.showMenuLogueo(persona); break;
	    	}
	    	try {
	    		Thread.sleep (5000);
	    		} catch (Exception e) {
	    		// Mensaje en caso de que falle
	    		}
	    	this.showMenuLogueo(persona);
	        break;
	    case 3:
	    	System.out.println("Se ha deslogueado exitosamente.");
	    	try {
	    		Thread.sleep (5000);
	    		} catch (Exception e) {
	    		// Mensaje en caso de que falle
	    		}
	    	showMenu();
	    	break;
	    default: this.showMenu(); break;
        }
    }
    
	public void buscarViajes(boolean Invitado, Pasajero pasajero) {
        System.out.println("\nIngrese un Origen para filtrar");
        String origen = console.next();
        System.out.println("\nIngrese un Destino para filtrar");
        String destino = console.next();
        
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
        System.out.println(coincidentes); 
        System.out.println("\n¿Como desea seguir?:\n1-Buscar viajes. \n2-Comprar. \n3-Volver.\nElija una opcion");
//        String opcion = console.nextLine();
//    	int op = Integer.parseInt(opcion);
        int op = console.nextInt();
    	switch (op) {
    	case 1:
    		buscarViajes(Invitado, pasajero);
    		break;
    	case 2:
    		if(Invitado) {
    			System.out.println("\nPara continuar debe: \n1-registrarse \n2-Loguearse\nElija una opcion:");
    			int opa = console.nextInt();
    			switch(opa) {
    			case 1:
    				registrar(false);break;
    			case 2:
    				this.ingresarSistema(false);
    			default: break;
    			}
    		}
    		comprarPasajes(coincidentes, pasajero);
    		break;
    	case 3:
    		if(Invitado)
    			showMenu();
    		else
    			showMenuLogueo(pasajero);
    		break;
    	default: break;
    	}
	}
	
 public void comprarPasajes(ArrayList<Viaje> viajes, Pasajero pasajero) {
		//
 }

 public boolean verificarPassword(String password) {
     if (password.length() < 8) {
         return false;
     }

     boolean tieneMinuscula = false;
     boolean tieneMayuscula = false;
     boolean tieneNumero = false;

     for (int i = 0; i < password.length(); i++) {
         char caracter = password.charAt(i);
         if (Character.isLowerCase(caracter)) {
             tieneMinuscula = true;
         } else if (Character.isUpperCase(caracter)) {
             tieneMayuscula = true;
         } else if (Character.isDigit(caracter)) {
             tieneNumero = true;
         }
     }

     return tieneMinuscula && tieneMayuscula && tieneNumero;
 }
}

