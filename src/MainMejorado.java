import java.io.*;
import java.util.ArrayList;
/*
 *-----------------------------------EJERCICIO 3.9.---------------------------------------------
 *Programa para lectura de datos por fichero y uso de clases de clases previamente definidas en el proyecto Elecciones.
 */

public class MainMejorado 
{
	public static void main (String args[]) 
	{

	try {

		/*-----LEER FICHERO LISTRADO DE PARTIDOS Y GUARDAR EN UN ARRALYST------*/
		//Leer el fichero listadopartidosmejorado así como los atributos que lo componen
		String lecturapartidos2;
		File fichero=new File("listadopartidosmejorado.txt");
		FileReader lecturafichero=new FileReader(fichero);
		BufferedReader br=new BufferedReader(lecturafichero);
		
		lecturapartidos2=br.readLine();
		//Para comprobar error: System.out.println(lecturapartidos2);
		String[] atributospartido;//=lecturapartidos2.split(", ");

		/*Una traza para comprobar error
		int i=0;
		while(i<atributospartido.length)
		{
			System.out.println("Posicion " +i +" tiene: " +atributospartido[i]);
			i=i+1;
			
		}*/
		

        
/*Guardar los atributos (por medio del metodo set) en objetos tipo Partido. 
Y que a su vez se han añadido al ArrayList.*/

		//Instanciar un array con elementos de tipo <Partido>
		ArrayList <Partido> array=new ArrayList <Partido>();
				
		while (lecturapartidos2!=null)
		{
				
				atributospartido=lecturapartidos2.split(", ");
				//Instancio un objeto de tipo Partido
				Partido p=new Partido();


				//RELLENAR LOS DATOS DEL OBJETO P DE TIPO PARTIDO 
				//Llamamos al metodo set los atributos del objeto p
				p.setPartido(atributospartido[0]);
				p.setMilitantes(Integer.parseInt(atributospartido[1]));
				p.setSimpatizantes(Integer.parseInt(atributospartido[2]));
				p.setNombregerente(atributospartido[3]);


				//Llamamos al metodo add para añadir el objeto p (tipo partido) al array (la información de p al array)
				array.add(p);
				lecturapartidos2=br.readLine();
				System.out.println(lecturapartidos2);
				
		}

		/*--------------------MOSTRAR CONTENIDO DEL ARRAY---------------------
		 *Recuperar, leer y mostrar lo que hay en el array creado anteriormente
		 */

		//Para comprobar lo que tiene p: System.out.println ("El contenido de p "+p.getPartido());
		System.out.println ();
		System.out.println ("-------------------------------------");
		System.out.println ("CONTENIDO DEL PARTIDO:  ("+ array.size() +" filas)");
		System.out.println ("-------------------------------------");
		System.out.println ();
		int indicearray=0;

		while(indicearray<array.size())
		{

			array.get(indicearray).mostrarInfo();//llamamos a metodo de las clase partido
		
			indicearray=indicearray +1;
			System.out.println ();

		}

		//Vaciamos el ArrayList
		array.clear();
		} //fin del try

	catch (Exception er) {
		System.out.println("Ha habido un error Io:  "+er.getMessage());
	}

	/*-----------------LEER FICHERO CENSO Y GUARDAR EN UN ARRALYST-----------*/
	try{

		//Lectura linea a linea del fichero censo
		String lecturacenso;
		File ac=new File("censo.txt");
		FileReader lc= new FileReader(ac);
		BufferedReader bff= new BufferedReader(lc);

		lecturacenso=bff.readLine();
		String[] separador;

		ArrayList <Habitante> array2=new ArrayList <Habitante>();

		while (lecturacenso!=null) 
		{
			
			separador= lecturacenso.split(", ");

			/* Mostrar contenido del array separador para comprobar
			int k;
			for(k=0;k<separador.length;k++)
			{

				System.out.println(separador[k]);

			}*/


			Habitante h=new Habitante();
			int edadauxiliar=Integer.parseInt(separador[6]);
			if (edadauxiliar>18)
			{
				h.setDni(separador[0]);
				h.setNombreapellidos(separador[1]);
				h.setDireccion(separador[2]);
				h.setLocalidad(separador[3]);
				h.setProvincia(separador[4]);
				h.setFecha(Long.parseLong(separador[5]));
				h.setEdad(edadauxiliar);
				h.setTelefono(Long.parseLong(separador[7]));
				array2.add(h);

			}
			lecturacenso=bff.readLine();

		}

		/*------------MOSTRAR CONTENIDO DEL ARRAY---------*/	

		
		System.out.println ();
		System.out.println ("-------------------------------------");
		System.out.println ("CENSO MAYORES DE 18:  ("+ array2.size() +" filas)");
		System.out.println ("-------------------------------------");
		System.out.println ();

		int indice2;
		for(indice2=0;indice2<array2.size();indice2++)
		{

			array2.get(indice2).infohabitante();
			System.out.println ();

		}

		//Vaciamos el ArrayList
		array2.clear();
	}

	catch (Exception e) {
		System.out.println("Ha habido un error Io:  "+e.getMessage());
	}

	}//fin del main

}//fin de la clase
