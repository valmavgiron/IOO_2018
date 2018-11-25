package controlador;


import java.util.ArrayList;

import modelo.Actividad;
import modelo.Socio;

public class ActividadController 
{
	private ArrayList<ActividadVO> actividades;
	
	public ActividadController()
	{
		
	}
	
	public ArrayList<ActividadVO> getActividadesVO() {
		actividades = new ArrayList<ActividadVO>();
		Actividad actividad = new Actividad();
		ArrayList<Actividad> res = actividad.getActividades();
		for(Actividad act: res){
			actividades.add(new ActividadVO(act));
		}
		return actividades;
	}
	

	
	public void crearActividad(ActividadVO actividadVO)
	{
		Actividad a = new Actividad();
		a.crearActividad(actividadVO);		
	}
	
	public void modificarActividad(ActividadVO actividadVO)
	{
		Actividad a = new Actividad();
		a.modificarActividad(actividadVO);		
	}
			
	public void eliminarActividad(int codigoAct)
	{
		Actividad a = new Actividad();
		a.eliminarActividad(codigoAct);
		
	}	
	
	public ArrayList<Actividad> listarActividad()
	{
		Actividad a = new Actividad();
		return a.getActividades();
		
	}	
	
	public Actividad buscarActividad(int text) {
		// TODO Auto-generated method stub
		Actividad a = new Actividad();
		a = a.buscarActividad(text);
	
		return a;
	}
			
}

