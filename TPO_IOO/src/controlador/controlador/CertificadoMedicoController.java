package controlador.controlador;


import java.util.*;
import modelo.*;

public class CertificadoMedicoController 
{
	private ArrayList<CertificadoMedicoVO> certificadosMedicos;
	
	public CertificadoMedicoController()
	{
		
	}
	
	public ArrayList<CertificadoMedicoVO> GetCertificadosMedicos() {
		certificadosMedicos = new ArrayList<CertificadoMedicoVO>();
		CertificadoMedico a = new CertificadoMedico();
		ArrayList<CertificadoMedico> res = a.GetCertificadosMedicos();
		
		for(CertificadoMedico r : res) {
			CertificadoMedicoVO v = new CertificadoMedicoVO();
			v.setFechaCertificado(r.getFechaCertificado());
			v.setMedico(r.getMedico());
			v.setObservaciones(r.getObservaciones());
			
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
