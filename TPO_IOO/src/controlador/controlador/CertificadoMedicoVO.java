package controlador.controlador;

import java.util.Date;

public class CertificadoMedicoVO {
	private Date fechaCertificado;
	private String medico;
	private String observaciones;
	
	
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