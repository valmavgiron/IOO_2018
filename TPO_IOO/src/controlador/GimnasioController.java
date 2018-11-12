package controlador;


import java.util.*;
import modelo.*;

public class GimnasioController 
{
	private Vector<GimnasioVO> gimnasios;
	
	public GimnasioController()
	{
		
	}
	
	public Vector<GimnasioVO> GetGimnasios() {
		gimnasios = new Vector<GimnasioVO>();
		Gimnasio a = new Gimnasio();
		Vector<Gimnasio> res = a.GetGimnasios();
		
		for(Gimnasio r : res) {
			GimnasioVO v = new GimnasioVO();
			v.setSocios(r.getSocios());
			v.setActividades(r.getActividades());
			v.setAbonos(r.getAbonos());
			
			gimnasios.add(v);
		}
		
		return gimnasios;
	}
	
	public void AgregarGimnasio(Socio socios, Actividad actividades, Abono abonos)
	{
		Gimnasio a = new Gimnasio(socios, actividades, abonos);
		a.AgregarGimnasio();		
	}
	
	public void ModificarGimnasio(Socio socios, Actividad actividades, Abono abonos)
	{

	}
}
