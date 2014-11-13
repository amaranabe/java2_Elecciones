
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
	ayuntamiento.setLocalidad(amurrio);
	ayuntamiento.setProvincia(bizkaia);
	ayuntamiento.setNumconcejales(23);
	ayuntamiento.setCenso(1050);

	//Visualizar en pantalla los valores utilizando metodos get
	System.out.println("El ayuntamiento esta en: " + ayuntamiento.getLocalidad());
	System.out.println("Provincia de: " + ayuntamiento.getProvincia());
	System.out.println("El numero de concejales es: " + ayuntamiento.getNumconcejales());
	System.out.println("El cense de este ayuntamiento es de: " + ayuntamiento.getCenso());


	//Instaciar clase EspacioPublico
	EspacioPublico espaciopublico=new EspacioPublico();
	//Asignar un valor con metodo set
	espaciopublico.setNombreespacio ();
	espaciopublico.setSuperficieespacio();
	espaciopublico.setFuncion();

	//Visualizar en pantalla los valores utilizando metodos get
	System.out.println("Nombre del Espacio Publico: " + espaciopublico.getNombreespacio());
	System.out.println("Superficie del Espacio Publico: " + ayuntamiento.getSuperficiespacio());
	System.out.println("El numero de concejales es: " + ayuntamiento.getFuncion());


	Habitante habitante=new Habitante ();
	habitante.setDni ();
	habitante.setNombreapellidos();
	habitante.setDireccion();
	habitante.setLocalidad();
	habitante.setProvincia();
	habitante.setFecha();
	habitante.setNumtelefono();

	




	Inmueble inmueble= new Inmueble ();

	Partido partido=new Partido ();	*/
	}

}
