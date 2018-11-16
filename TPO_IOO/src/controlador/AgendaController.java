package controlador.controlador;


import java.util.*;
import modelo.*;

public class AgendaController 
{
	private ArrayList<AgendaVO> agendas;
	
	public AgendaController()
	{
		
	}
	
	public ArrayList<AgendaVO> GetAgendas() {
		agendas = new ArrayList<AgendaVO>();
		Agenda a = new Agenda();
		ArrayList<Agenda> res = a.GetAgendas();
		
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
