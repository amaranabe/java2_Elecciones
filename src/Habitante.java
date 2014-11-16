public class Habitante
{
	public Habitante(){

	}	
	private String dni;
	private String nombreapellidos;
	private String direccion;
	private String localidad;
	private String provincia;
	private long fechanacimiento;
	private int edad;
	private long numtelefono;

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

	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int idedad)
	{
		edad=idedad;
	}

	public long getFecha()
	{
		return fechanacimiento;
	}
	public void setFecha(long idfechanacimiento)
	{
		fechanacimiento=idfechanacimiento;
	}

	public long getTelefono()
	{
		return numtelefono;
	}

	public void setTelefono(long idnumtelefono)
	{
		numtelefono=idnumtelefono;
	}

	public void infohabitante()
	{
		System.out.println( " Nombre y Apellidos:" + nombreapellidos);
		System.out.println( "    DNI: " + dni);
		System.out.println( "    Direccion: " + direccion);
		System.out.println( "    Localidad:" + localidad);
		System.out.println( "    Provincia: " + provincia);
		System.out.println( "    Edad: " + edad);
		System.out.println( "    Fecha de nacimiento:" + fechanacimiento);
		System.out.println( "    Telefono: " + numtelefono);


	}

}
