package controlador;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		Vector<Socio> res = a.GetSocios();
		
		for(Socio r : res) {
			SocioVO v = new SocioVO();
			v.setId(r.getId());
			v.setNombre(r.getNonbre());
			v.setApellido(r.getApellido());
			v.setDomicilio(r.getDomicilio());
			v.setTelefono(r.getTelefono());
			v.setEmail(r.getEmail());
			v.setCertificado(r.getCertificado());
			
			socios.add(v);
		}
		
		return socios;
	}
	
	public void AgregarSocio(int id, String nombre, String apellido, String domicilio, String telefono, String email, Date fechaCertificado,String cert_medico,String cert_obs)
	{
		Socio a = new Socio(0,nombre,apellido,domicilio,telefono,email,fechaCertificado,cert_medico,cert_obs);
		a.AgregarSocio();			
	}
	
	public void ModificarSocio(int id)
	{
		socios = new ArrayList<SocioVO>();
		Socio a = new Socio();

			//a.setNombre(r.getApellido());
			//a.setDomicilio(r.getDomicio());
			//a.setTelefono(r.getHorario());
			//a.setEmail(r.getEmail());
			
			//a.ModificarSocio();
			
	}
		
	public void EliminarSocio(int id)
	{
		Socio a = new Socio();
		//a.EliminarSocio();
		
	}

	public Socio buscarSocio(String text) {
		// TODO Auto-generated method stub
		Socio a = new Socio();
		a = a.BuscarSocio(text);
	
		return a;
	}	
	
}
