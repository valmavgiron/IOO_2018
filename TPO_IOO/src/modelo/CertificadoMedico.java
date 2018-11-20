package modelo;

import java.util.Date;

public class CertificadoMedico {

	Date fechaCertificado;
	String medico;
	String observaciones;
	
	public CertificadoMedico(Date fechaCertificado, String medico, String observaciones) {
		super();
		this.fechaCertificado = fechaCertificado;
		this.medico = medico;
		this.observaciones = observaciones;
		
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
}
