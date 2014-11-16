import java.io.*;
import java.util.*;
/*
 *Programa para utilizar clases de la carpeta Elecciones.
 */

public class Main 
{
	public static void main (String args[]) 
	{

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
	partido.setSimpatizantes(100000);
	partido.setNombregerente("Arantza Quiroga");

	//Visualizar en pantalla los valores utilizando metodos get
	System.out.println("INFORMACION DE PARTIDO");
	System.out.println("Nombre: " + partido.getPartido());
	System.out.println("Numero de militantes: " + partido.getMilitantes());
	System.out.println("Numero de afiliados: " + partido.getSimpatizantes());
	System.out.println("Nombre del Presidente: " + partido.getNombregerente());
	System.out.println();

/*EJERCICIO 3.7*/
	try {
		String lecturapartidos;
		File ficherolectura=new File("listadopartidos.txt");
		FileReader lector=new FileReader(ficherolectura);
		BufferedReader br=new BufferedReader(lector);
		
		lecturapartidos=br.readLine();

/*Guardar los nombres de los partidos en el atributo nompartido (por medio del metodo set) en objetos tipo Partido. 
Y que a su vez se han añadido al ArrayList.*/

		//Instanciar un array con elementos de tipo <Partido>
		ArrayList <Partido> array=new ArrayList <Partido>();
				
		while (lecturapartidos!=null)
		{
				System.out.println(lecturapartidos);
				//Instancio un objeto de tipo Partido
				Partido p=new Partido();
				//Llamamos al metodo setPartido para modificar el atributo nompartido del objeto p
				p.setPartido(lecturapartidos);
				//Llamamos al metodo add para añadir la información de p (tipo partido) al array 
				array.add(p);

				lecturapartidos=br.readLine();

		}

/*EJERCICIO 3.8: Recuperar, leer y mostrar lo que hay en el array creado anteriormente*/

		//Para comprobar lo que tiene p: System.out.println ("El contenido de p "+p.getPartido());
		System.out.println ();
		System.out.println ("CONTENIDO DEL ARRAY:  "+ array.size() +" filas");
		
		int indicearray=0;
		while(indicearray<array.size())
		{

				String a= array.get(indicearray).getPartido();
				System.out.println ("El nombre del partido "+(indicearray+1) +" es: " +a);
				indicearray=indicearray +1;

		}
		//Vaciamos el ArrayList
		array.clear();
		} //fin del try
		
	catch (Exception er) {
		System.out.println("Ha habido un error Io:  "+er.getMessage());
	}
	}

}
