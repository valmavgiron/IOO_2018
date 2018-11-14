package modelo;

public class Actividad {
	
	int codigoActividad;
	String titulo;
	String descripcion;
	String horario;
	
	public Actividad(int codigoActividad, String titulo, String descripcion, String horario) {
		this.codigoActividad = codigoActividad;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.horario = horario;
	}
	
	public void CrarActividad(int codigoActividad, String titulo, String descripcion, String horario) {
		Actividad acti = new Actividad(codigoActividad, titulo, descripcion, horario);
	}
	
	public void modificarActividad(Actividad nuevaAct) {
		
	}
	
	public void eliminarActividad(int codigoAct) {
		
	}
	
	public Actividad buscarActividad(String codigoAct) {
		return null;
		
	}

	public int getCodigoActividad() {
		return codigoActividad;
	}

	public void setCodigoActividad(int codigoActividad) {
		this.codigoActividad = codigoActividad;
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
