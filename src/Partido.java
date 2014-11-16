public class  Partido
{
	//-- constructora --//
	public Partido()
	{

	}

	//-- variables miembro, atributos --//
	private String nombrepartido;
	private int nummilitantes;
	private int numsimpatizantes;
	private String nombregerente;
	
		
//-- MÉTODOS O FUNCIONES MIEMBRO --//

	//-- get y set --//
	public String getPartido()
	{
		return nombrepartido;
	}
	public void setPartido(String idpartido)
	{
		nombrepartido=idpartido;
	}
	public String getNombregerente()
	{
		return nombregerente;
	}
	public void setNombregerente(String idnombregerente)
	{
		nombregerente=idnombregerente;
	}
	
	public int getMilitantes()
	{
		return nummilitantes;
	}
	public void setMilitantes(int idnummilitantes)
	{
		nummilitantes=idnummilitantes;
	}

	public int getSimpatizantes()
	{
		return numsimpatizantes;
	}
	public void setSimpatizantes(int idnumsimpatizantes)
	{
		numsimpatizantes=idnumsimpatizantes;
	}
	
	//-- otros metodos --//

	public void mostrarInfo()
	{
		System.out.println( "Partido :" + nombrepartido);
		System.out.println( "=====================================");
		System.out.println( "   Numero de Militantes: " + nummilitantes);
		System.out.println( "   Numero de Simpatizantes: " + numsimpatizantes);
		System.out.println( "   Nombre del Gerente:" + nombregerente);
		
	}
	public double relacionSimpatizanteMilitante()
	{
			// devuelve el número de afiliados por cada 100 militantes (tanto por ciento)
			return (numsimpatizantes/nummilitantes) * 100;
	
	}
	
	
}
