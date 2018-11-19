package controlador;


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
		
		return actividades;
	}
	
	public void crearActividad(int codigoAct, String titulo, String descripcion, String horario)
	{
		Actividad a = new Actividad(codigoAct, titulo, descripcion, horario);
		a.crearActividad();		
	}
	
	public void modificarActividad(int codigoAct)
	{
		actividades = new ArrayList<ActividadVO>();
		Actividad a = new Actividad();

			a.setTitulo(r.getTitulo());
			a.setDescripcion(r.getDescripcion());
			a.setHorario(r.getHorario());
			
			a.modificarActividad();
			
	}
		
	public void eliminarActividad(int codigoAct)
	{
		Actividad a = new Actividad(codigoAct);
		a.eliminarActividad();
		
	}	
	
	public void listarActividad(int codigoAct)
	{
		Actividad a = new Actividad(codigoAct);
		a.listarActividad();
		
	}	
			
}

