public class Habitante
{
	public Habitante(){

	}	
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String localidad;
	private String provincia;
	private int cp;
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

	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String idnombre)
	{
		nombre=idnombre;
	}

	public String getApellido1()
	{
		return apellido1;
	}
	public void setApellido1(String idapellido1)
	{
		apellido1=idapellido1;
	}

	public String getApellido2()
	{
		return apellido2;
	}
	public void setApellido2(String idapellido2)
	{
		apellido1=idapellido2;
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

	public int getCp()
	{
		return cp;
	}
	public void setCp(int idcp)
	{
		cp=idcp;
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
