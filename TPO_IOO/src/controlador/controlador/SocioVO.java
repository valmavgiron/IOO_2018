package controlador.controlador;

import modelo.CertificadoMedico;

public class SocioVO {
	private int id;
	private String nombre;
	private String apellido;
	private String domicilio;
	private Double telefono;
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
	public Double getTelefono() {
		return telefono;
	}
	public void setTelefono(Double telefono) {
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