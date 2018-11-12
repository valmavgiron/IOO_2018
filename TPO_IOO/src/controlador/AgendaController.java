package controlador;


import java.util.*;
import modelo.*;

public class AgendaController 
{
	private Vector<AgendaVO> agendas;
	
	public AgendaController()
	{
		
	}
	
	public Vector<AgendaVO> GetAgendas() {
		agendas = new Vector<AgendaVO>();
		Agenda a = new Agenda();
		Vector<Agenda> res = a.GetAgendas();
		
		for(Agenda r : res) {
			AgendaVO v = new AgendaVO();
			v.setDia(r.getDia());
			v.setHora(r.getHora());
			
			agendas.add(v);
		}
		
		return agendas;
	}
	
	public void AgregarAgenda(String dia, String hora)
	{
		Agenda a = new Agenda(dia, hora);
		a.AgregarAgenda();		
	}
	
	public void ModificarAgenda(String dia, String hora)
	{

	}
}
