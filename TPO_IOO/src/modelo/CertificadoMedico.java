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
}
