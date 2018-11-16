package controlador.controlador;

import modelo.Abono;
import modelo.Actividad;
import modelo.Socio;

public class GimnasioVO {
	private Socio socios;
	private Actividad actividades;
	private Abono abonos;
	
	
	public Socio getSocios() {
		return socios;
	}
	public void setSocios(Socio socios) {
		this.socios = socios;
	}
	public Actividad getActividades() {
		return actividades;
	}
	public void setActividades(Actividad actividades) {
		this.actividades = actividades;
	}
	public Abono getAbonos() {
		return abonos;
	}
	public void setAbonos(Abono abonos) {
		this.abonos = abonos;
	}
	

}