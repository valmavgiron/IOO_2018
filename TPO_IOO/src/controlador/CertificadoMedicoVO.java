package controlador;
import modelo.CertificadoMedico;
import java.util.Date;

public class CertificadoMedicoVO {
	Date fechaCertificado;
	String medico;
	String observaciones;
	int idSocio;
	
	public CertificadoMedicoVO()
	{	
	}
	
	
	public CertificadoMedicoVO(Date fechaCertificado, String medico, String observaciones, int idSocio) {
		super();
		this.fechaCertificado = fechaCertificado;
		this.medico = medico;
		this.observaciones = observaciones;
		this.idSocio = idSocio;
	}

	public CertificadoMedicoVO(CertificadoMedico cert) {
		this.fechaCertificado = cert.getFechaCertificado();
		this.medico = cert.getMedico();
		this.observaciones = cert.getObservaciones();
		this.idSocio = cert.getIdSocio();
	}


	public Date getFechaCertificado() {
		return fechaCertificado;
	}


	public void setFechaCertificado(Date fechaCertificado) {
		this.fechaCertificado = fechaCertificado;
	}


	public String getMedico() {
		return medico;
	}


	public void setMedico(String medico) {
		this.medico = medico;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public int getIdSocio() {
		return idSocio;
	}


	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
