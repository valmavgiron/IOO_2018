package controlador;


import java.util.*;
import modelo.*;

public class SocioController 
{
	private ArrayList<SocioVO> socios;
	
	public SocioController()
	{
		
	}
	
	public ArrayList<SocioVO> getSocios() {
		socios = new ArrayList<SocioVO>();
		Socio a = new Socio();
		ArrayList<Socio> res = a.getSocios();
		
		for(Socio r : res) {
			SocioVO v = new SocioVO(r);
//			v.setId(r.getId());
//			v.setNombre(r.getNombre());
//			v.setApellido(r.getApellido());
//			v.setDomicilio(r.getDomicilio());
//			v.setTelefono(r.getTelefono());
//			v.setEmail(r.getEmail());
//			v.setCertificado(r.getCertificado());
			
			socios.add(v);
		}
		
		return socios;
	}
	
	public void agregarSocio(SocioVO socio)
	{
		Socio a = new Socio();
		a.agregarSocio(socio);		
	}
	
	public void modificarSocio(SocioVO socio)
	{
		socios = new ArrayList<SocioVO>();
		Socio a = new Socio();

//			a.setNombre(r.getApellido());
//			a.setDomicilio(r.getDomicio());
//			a.setTelefono(r.getHorario());
//			a.setEmail(r.getEmail());
//			
			a.modificarSocio(socio);
			
	}
		
	public void eliminarSocio(int id)
	{
		Socio a = new Socio();
		a.eliminarSocio(id);
		
	}	
	public Socio buscarSocio(String text) {
		// TODO Auto-generated method stub
		Socio a = new Socio();
		a = a.BuscarSocio(text);
	
		return a;
	}
	
}

