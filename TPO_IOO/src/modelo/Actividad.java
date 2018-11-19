package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Actividad {
	
	int codigoActividad;
	String titulo;
	String descripcion;
	String horario;
	//Constructores
	public Actividad(int codigoActividad, String titulo, String descripcion, String horario) {
		this.codigoActividad = codigoActividad;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.horario = horario;
	}
	
	public Actividad() {
	}
	
	//
	public void CrearActividad()
	{
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			//setamos el ID con el sequence	   		
	   		stmt = conn.getConnection().prepareStatement("SELECT seq_actividad.nextval from DUAL");
	   		stmt.execute();
	   		//// Hacemos el inbsert
	   		
			stmt = conn.getConnection().prepareStatement("INSERT INTO ACTIVIDAD VALUES (seq_actividad.currval, '"
															+ this.titulo +"', '"
															+ this.descripcion +"', "
															+ this.horario + ")");
			stmt.execute();
			
		}
		catch(SQLException se) {
			System.out.println(se);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		finally {
			conn.desconectar();
		}
	}
	
	public Vector<Actividad> GetActividades()
	{
		Vector<Actividad> actividades = new Vector<Actividad>();
		
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			stmt = conn.getConnection().prepareStatement("SELECT * FROM ACTIVIDADES");
			ResultSet rs = stmt.executeQuery();
	   		while (rs.next()) {
	   		    this.codigoActividad = Integer.parseInt(rs.getString("ID_ACTIVIDAD"));
	   		    this.titulo = rs.getString("TITULO");
	   		    this.descripcion = rs.getString("DESCRIPCION");
	   		    this.horario = rs.getString("HORARIO");
	   		    
	   		    actividades.add(new Actividad(this.codigoActividad,this.titulo,this.descripcion,this.horario));
	   		}	
		}
		catch(SQLException se) {
			System.out.println(se);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		finally {
			conn.desconectar();
		}
		
		return actividades;
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
