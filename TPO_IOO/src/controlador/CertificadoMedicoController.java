package controlador;


import java.util.*;
import modelo.*;

public class CertificadoMedicoController 
{
	private Vector<CertificadoMedicoVO> certificadosMedicos;
	
	public CertificadoMedicoController()
	{
		
	}
	
	public Vector<CertificadoMedicoVO> GetCertificadosMedicos() {
		certificadosMedicos = new Vector<CertificadoMedicoVO>();
		CertificadoMedico a = new CertificadoMedico();
		Vector<CertificadoMedico> res = a.GetCertificadosMedicos();
		
		for(CertificadoMedico r : res) {
			CertificadoMedicoVO v = new CertificadoMedicoVO();
			v.setFechaCertificado(r.getFechaCertificado());
			v.setMedico(r.getMedico());
			v.setObervaciones(r.getObservaciones());
			
			certificadosMedicos.add(v);
		}
		
		return certificadosMedicos;
	}
	
	public void AgregarCertificadoMedico(Date fechaCertificado, String medico, String observaciones)
	{
		CertificadoMedico a = new CertificadoMedico(fechaCertificado, medico, observaciones);
		a.AgregarCertificadoMedico();		
	}
	
	public void ModificarCertificadoMedico(Date fechaCertificado, String medico, String observaciones)
	{

	}
}
