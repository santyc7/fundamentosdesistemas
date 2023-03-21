package nuevoStv;


	import java.util.Scanner;

	public class ProcesoSolicitudTvDigital {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	     System.out.println("BIENVENIDO AL MENU DE SOLICITUD DE UN NUEVO SERVICIO DE TV DIGITAL");
	     System.out.println("A contunuacion presentamos los requisitos y costos del servicio");
	  //al no saber los requisitos y costos procedemos a simularlos
	     System.out.println("datos personales de la persona que solicita el servicio(nombre,celular,direccion)");
	     System.out.println("costo de instalacion");
	     System.out.println("costo mensual por la prestacion del servivcio");
	     System.out.println("tratamiento de datos personales");
	     
	     System.out.println("¿acepta los requisitos y costos? (si/no)");
	     String respuesta1=sc.nextLine();
	     if (respuesta1.equals("no")) {
			
	    	 System.exit(0);
		} else {
			
			//verificar si el cliente tiene morosidad
	      System.out.println("¿cliente tiene morosidad? (si/no):");
	      String respuesta2=sc.nextLine();
	      if (respuesta2.equals("si")) {
	    	  System.out.println("lo sentimos el cliente presenta morosidad debe pagar y realizar la solicitud de nuevo");
			System.exit(0);
		} else {
			System.out.println("cliente no presenta morosidad");
			System.out.println("ingrese nombre completo");
			String nombrecliente=sc.nextLine();
			System.out.println("ingrese direccion donde se encuentra establecido");
			String direccioncliente=sc.nextLine();
			System.out.println("ingrese numero telefonico");
			String numerotelefonicocliente=sc.nextLine();
			System.out.println("ingrese numero de identificacion del cliente");
			String identificacionC=sc.nextLine();  
			System.out.println("AVISO:la instalacion se realiza en los proximos 3 dias habiles despues de la solicitud");
	    	  System.out.println("ingrese fecha de solucitud (dd/mm/aaaa/):");
	    	  String fechaI=sc.nextLine();
	    	  System.out.println("Registrando la solicitud del nuevo servicio...");
	         int numeroSolicitud = (int)(Math.random()*1234567+1);
	         System.out.println("Su número de solicitud es: " + numeroSolicitud);
	         int numerodias = (int)(Math.random()*3+1);
	        	         System.out.println("Enviando la solicitud al Departamento de programación y control de trabajos...");
	         System.out.println("La fecha de instalación esta programada para " +numerodias+ " dia(s) despues del "+ fechaI);
	         // procede a simularse la instalacion
	         System.out.println("Instalacion del nuevo servicio...");
	         System.out.println("instalacion completada");
	         System.out.print("¿Está satisfecho con el nuevo servicio? (si/no): ");
	         String satisfaccion = sc.nextLine();
	         if (satisfaccion.equals("si")) {
	            System.out.println("Gracias por preferirnos");
	         } else {
	            System.out.println("Lo sentimos por no haber cumplido con sus expectativas. Haremos lo posible para mejorar nuestro servicio.");
	         System.exit(0);
	         }
	      }
	   }
	   }
	}
	
