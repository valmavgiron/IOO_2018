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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNonbre() {
		return nonbre;
	}

	public void setNonbre(String nonbre) {
		this.nonbre = nonbre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CertificadoMedico getCertificado() {
		return certificado;
	}

	public void setCertificado(CertificadoMedico certificado) {
		this.certificado = certificado;
	}
	
	//
	
}
