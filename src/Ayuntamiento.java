public class Ayuntamiento
{
	public Ayuntamiento(){

	}	

	String localidad;
	String provincia;
	String nombredepartamento;
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

	public String getNombredepartamento()
	{
		return nombredepartamento;
	}
	public void setNombredepartamento(String iddepartamento)
	{
		nombredepartamento=iddepartamento;
	}

	public int getCenso()
	{
		return censo;
	}
	public void setCenso(int idcenso)
	{
		censo=idcenso;
	}
}
