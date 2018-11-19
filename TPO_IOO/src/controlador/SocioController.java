package controlador;


import java.util.*;
import modelo.*;

public class SocioController 
{
	private ArrayList<SocioVO> socios;
	
	public SocioController()
	{
		
	}
	
	public ArrayList<SocioVO> GetSocios() {
		socios = new ArrayList<SocioVO>();
		Socio a = new Socio();
		ArrayList<Socio> res = a.GetSocios();
		
		for(Socio r : res) {
			SocioVO v = new SocioVO();
			v.setId(r.getId());
			v.setNombre(r.getNombre());
			v.setApellido(r.getApellido());
			v.setDomicilio(r.getDomicilio());
			v.setTelefono(r.getTelefono());
			v.setEmail(r.getEmail());
			v.setCertificado(r.getCertificado());
			
			socios.add(v);
		}
		
		return socios;
	}
	
	public void AgregarSocio(int id, String nombre, String apellido, String domicilio, double telefono, String email, CertificadoMedico certificado)
	{
		Socio a = new Socio();
		a.AgregarSocio();		
	}
	
	public void ModificarSocio(int id)
	{
		socios = new ArrayList<SocioVO>();
		Socio a = new Socio();

			a.setNombre(r.getApellido());
			a.setDomicilio(r.getDomicio());
			a.setTelefono(r.getHorario());
			a.setEmail(r.getEmail());
			
			a.ModificarSocio();
			
	}
		
	public void EliminarSocio(int id)
	{
		Socio a = new Socio();
		a.EliminarSocio();
		
	}	
	
}
