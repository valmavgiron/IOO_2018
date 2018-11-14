package controlador.controlador;


import java.util.*;
import modelo.*;

public class GimnasioController 
{
	private ArrayList<GimnasioVO> gimnasios;
	
	public GimnasioController()
	{
		
	}
	
	public ArrayList<GimnasioVO> GetGimnasios() {
		gimnasios = new ArrayList<GimnasioVO>();
		Gimnasio a = new Gimnasio();
		ArrayList<Gimnasio> res = a.GetGimnasios();
		
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
		Gimnasio a = new Gimnasio();
		a.AgregarGimnasio();		
	}
	
	public void ModificarGimnasio(Socio socios, Actividad actividades, Abono abonos)
	{

	}
}
