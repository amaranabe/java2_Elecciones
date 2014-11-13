public class Habitante
{
	public Habitante(){

	}	
	private String dni;
	private String nombreapellidos;
	private String direccion;
	private String localidad;
	private String provincia;
	private int fechanacimiento;
	private int numtelefono;

	public String getDni()
	{
		return dni;
	}
	public void setDni(String identificacion)
	{
		dni=identificacion;
	}

	public String getNombreapellidos()
	{
		return nombreapellidos;
	}
	public void setNombreapellidos(String idnombre)
	{
		nombreapellidos=idnombre;
	}

	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String iddireccion)
	{
		direccion=iddireccion;
	}

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

	public int getFecha()
	{
		return fechanacimiento;
	}
	public void setFecha(int idfechanacimiento)
	{
		fechanacimiento=idfechanacimiento
	}

	public int getTelefono()
	{
		return telefono;
	}

	public void setTelefono(int idtelefono)
	{
		telefono=idtelefono;
	}
}
