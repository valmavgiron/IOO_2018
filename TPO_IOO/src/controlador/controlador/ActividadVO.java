package controlador.controlador;


public class ActividadVO {
	private int codigoAct;
	private String titulo;
	private String descripcion;
	private String horario;
	
	
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
	
}