
/*
 *Programa para utilizar clases de la carpeta Elecciones.
 */

public class Main 
{
	public static void main (String args[]) {

	/*String localidad= amurrio;
	String provincia= bizkaia;
	int numconcejales=23;
	int censo=1050;
	*/
	
	//Instaciar clase Ayuntamiento
	Ayuntamiento ayuntamiento=new Ayuntamiento();
	//Asignar un valor con metodo set
	ayuntamiento.setLocalidad("Amurrio");
	ayuntamiento.setProvincia("Bizkaia");
	ayuntamiento.setNumconcejales(23);
	ayuntamiento.setCenso(1050);

	//Visualizar en pantalla los valores utilizando metodos get
	System.out.println();
	System.out.println("INFORMACION SOBRE UN AYUNTAMIENTO");
	System.out.println("El ayuntamiento esta en: " + ayuntamiento.getLocalidad());
	System.out.println("Provincia de: " + ayuntamiento.getProvincia());
	System.out.println("El numero de concejales es: " + ayuntamiento.getNumconcejales());
	System.out.println("El censo de este ayuntamiento es de: " + ayuntamiento.getCenso());
	System.out.println();

	
	//Instaciar clase EspacioPublico
	EspacioPublico espaciopublico=new EspacioPublico();
	//Asignar un valor con metodo set
	espaciopublico.setNombreespacio ("Gipuzkoa");
	espaciopublico.setSuperficieespacio(900);
	espaciopublico.setFuncion("Plaza");

	//Visualizar en pantalla los valores utilizando metodos get
	System.out.println("INFORMACION SOBRE UN ESPACIO PUBLICO");
	System.out.println("Nombre del Espacio Publico: " + espaciopublico.getNombreespacio());
	System.out.println("Superficie del Espacio Publico (m2): " + espaciopublico.getSuperficieespacio());
	System.out.println("El numero de concejales es: " + espaciopublico.getFuncion());
	System.out.println();

	//Instaciar clase Habitante
	Habitante habitante=new Habitante ();
	//Asignar un valor con metodo set
	habitante.setDni ("34109798Q");
	habitante.setNombreapellidos("Amaia Maraña Bermejo");
	habitante.setDireccion("Duque de Mandas 42, 4F");
	habitante.setLocalidad("Donostia");
	habitante.setProvincia("Gipuzkoa");
	habitante.setFecha(1011975);
	habitante.setTelefono(943010101);

	//Visualizar en pantalla los valores utilizando metodos get
	System.out.println("INFORMACION DE HABITANTE");
	System.out.println("DNI: " + habitante.getDni());
	System.out.println("Nombre y Apellidos: " + habitante.getNombreapellidos());
	System.out.println("Direccion: " + habitante.getDireccion());
	System.out.println("Localidad: " + habitante.getLocalidad());
	System.out.println("Provincia: " + habitante.getProvincia());
	System.out.println("Fecha de nacimiento: " + habitante.getFecha());
	System.out.println("Telefono: " + habitante.getTelefono());
	System.out.println();

	//Instaciar clase Inmueble
	Inmueble inmueble= new Inmueble ();
	//Asignar un valor con metodo set
	inmueble.setNumhabitantes(4);
	inmueble.setNumhuecos(4);
	inmueble.setSuperficie(59);
	inmueble.setDireccion("Sancho el Sabio 24, 3D");
	inmueble.setLocalidad("Donostia");
	//Visualizar en pantalla los valores utilizando metodos get
	System.out.println("INFORMACION DE INMUEBLE");
	System.out.println("Personas que viven en el inmueble: " + inmueble.getNumhabitantes());
	System.out.println("Numero de huecos del inmueble: " + inmueble.getNumhuecos());
	System.out.println("Superficie del inmueble (m2): " + inmueble.getSuperficie());
	System.out.println("Direccion: " + inmueble.getDireccion());
	System.out.println("Localidad: " + inmueble.getLocalidad());
	System.out.println();

	//Instaciar clase Partido
	Partido partido=new Partido ();
	//Asignar un valor con metodo set
	partido.setPartido("Partido Popular Vasco");
	partido.setMilitantes(725000);
	partido.setAfiliados(100000);
	partido.setNombregerente("Arantza Quiroga");

	//Visualizar en pantalla los valores utilizando metodos get
	System.out.println("INFORMACION DE PARTIDO");
	System.out.println("Nombre: " + partido.getPartido());
	System.out.println("Numero de militantes: " + partido.getMilitantes());
	System.out.println("Numero de afiliados: " + partido.getAfiliados());
	System.out.println("Nombre del Presidente: " + partido.getNombregerente());
	System.out.println();

	}

}
