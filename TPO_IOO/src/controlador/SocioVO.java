package controlador;

import modelo.CertificadoMedico;
import modelo.Socio;

public class SocioVO {
	public SocioVO(Socio socio) {
		super();
		this.id = socio.getId();
		this.nombre = socio.getNombre();
		this.apellido = socio.getApellido();
		this.domicilio = socio.getDomicilio();
		this.telefono = socio.getDomicilio();
		this.email = socio.getEmail();
		this.certificado = socio.getCertificado();
	}
	private int id;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String telefono;
	private String email;
	private CertificadoMedico certificado;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return this.telefono;
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
	
}