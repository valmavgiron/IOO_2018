package controlador;


import java.util.*;
import modelo.*;

public class ActividadController 
{
	private Vector<ActividadVO> actividades;
	
	public ActividadController()
	{
		
	}
	
	public Vector<ActividadVO> GetActividades() {
		actividades = new Vector<ActividadVO>();
		Actividad a = new Actividad();
		Vector<Actividad> res = a.GetActividades();
		
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
