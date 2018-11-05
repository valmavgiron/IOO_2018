package modelo;

public class Socio {

	int    id;
	String nonbre;
	String apellido;
	String domicilio;
	String telefono;
	String email;
	CertificadoMedico certificado;
	
	public Socio(String nonbre, String apellido, String domicilio, String telefono, String email) {
		this.nonbre = nonbre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
	}
	
	public void AgregarSocio(String ap,String domi,String tel,String email ) 
	{
		
	}
	public void ModificarSocio(Socio x)
	{
		
	}
	public void EliminarSocio(int x)
	{
		
	}
	public void ModificarSocio(int x)
	{
		
	}
}
