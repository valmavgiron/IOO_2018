package controlador;

import java.util.ArrayList;

import modelo.Actividad;

public class ActividadVO {
	
	private int codigoAct;
	private String titulo;
	private String descripcion;
	private String horario;
	private String dia;
	
	public ActividadVO() {
		
	}
	public ActividadVO(Actividad act) {
		this.codigoAct = act.getCodigoActividad();
		this.titulo = act.getTitulo();
		this.descripcion = act.getDescripcion();
		this.horario = act.getHorario();
		this.dia = act.getDia();
	}
	
	public int getCodigoAct() {
		return codigoAct;
	}
	public void setCodigoAct(int codigoAct) {
		this.codigoAct = codigoAct;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public ArrayList<Actividad> listarActividades() {
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		Actividad a = new Actividad();
		actividades = a.getActividades();
		return actividades;
	}
}