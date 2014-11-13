public class Ayuntamiento
{
	public Ayuntamiento(){

	}	

	String localidad;
	String provincia;
	int numconcejales;
	int censo;	

	public String getLocalidad()
	{
		return localidad;
	}
	public void setLocalidad(String idlocalidad)
	{
		localidad=idlocalidad;
	}

	public String getProvincia()
	{
		return provincia;
	}
	public void setProvincia(String idprovincia)
	{
		provincia=idprovincia;
	}

	public int getNumconcejales()
	{
		return numconcejales;
	}
	public void setNumconcejales(int idnumconcejales)
	{
		numconcejales=idnumconcejales;
	}

	public int getCenso()
	{
		return censo;
	}
	public void setCenso(int idcenso)
	{
		censo=idcenso;
	}
	public void mostrarInfo()
	{
		System.out.println( "Localidad :" + localidad);
		System.out.println( "Provincia :" + provincia);
		System.out.println( "Numero de concejales:" + numconcejales);
		System.out.println( "Censo :" + censo);

	}
}
