public class  Partido
{
	//-- constructora --//
	public Partido()
	{

	}

	//-- variables miembro, atributos --//
	private String nombrepartido;
	private int nummilitantes;
	private int numafiliados;
	private String nombregerente;
	private String ideologia;
	private int financiacion;
	private int aniofundacion;
	
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
	public String getNombreGerente()
	{
		return nombregerente;
	}
	public void setNombreGerente(String idNombreGerente)
	{
		nombregerente=idNombreGerente;
	}
	public String getIdeologia()
	{
		return ideologia;
	}
	public void setIdeologia(String idIdeologia)
	{
		ideologia=idIdeologia;
	}


	public int getMilitantes()
	{
		return nummilitantes;
	}
	public void setMilitantes(int idnummilitantes)
	{
		nummilitantes=idnummilitantes;
	}

	public int getAfiliados()
	{
		return numafiliados;
	}
	public void setAfiliados(int idnumafiliados)
	{
		nummilitantes=idnumafiliados;
	}
	public int getFinanciacion()
	{
		return financiacion;
	}
	public void setFinanciacion(int idFinanciacion)
	{
		financiacion=idFinanciacion;
	}
	public int getAnioFundacion()
	{
		return aniofundacion;
	}
	public void setAnioFundacion(int idAnioFundacion)
	{
		aniofundacion=idAnioFundacion;
	}
	//-- otros metodos --//

	public void mostrarInfo()
	{
		System.out.println( "Partido :" + nombrepartido);
		System.out.println( "=====================================");
		System.out.println( "   Numero de Militantes: " + nummilitantes);
		System.out.println( "   Numero de Afiliados: " + numafiliados);
		System.out.println( "   Nombre del Gerente:" + nombregerente);
		System.out.println( "   Ideologia: " + ideologia);
		System.out.println( "   Financiación:" + financiacion);
		System.out.println( "   Año fundación:" + aniofundacion);
	}
	public double relacionAfiliadoMilitante()
	{
			// devuelve el número de afiliados por cada 100 militantes (tanto por ciento)
			return (numafiliados/nummilitantes) * 100;
	
	}
	
	
}
