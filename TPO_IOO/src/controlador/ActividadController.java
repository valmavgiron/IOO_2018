package controlador.controlador;


import java.util.*;
import modelo.*;

public class ActividadController 
{
	private ArrayList<ActividadVO> actividades;
	
	public ActividadController()
	{
		
	}
	
	public ArrayList<ActividadVO> GetActividades() {
		actividades = new ArrayList<ActividadVO>();
		Actividad a = new Actividad();
		ArrayList<Actividad> res = a.GetActividades();
		
		for(Actividad r : res) {
			ActividadVO v = new ActividadVO();
			v.setCodigoAct(r.getCodigoAct());
			v.setDescripcion(r.getDescripcion());
			v.setHorario(r.getHorario());
			
			actividades.add(v);
		}
		
		return actividades;
	}
	
	public void AgregarActividad(int codigoAct, String titulo, String descripcion, String horario)
	{
		Actividad a = new Actividad(codigoAct, titulo, descripcion, horario);
		a.AgregarActividad();		
	}
	
	public void ModificarActividad(int codigoAct, String titulo, String descripcion, String horario)
	{

	}
}
