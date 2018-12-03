package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controlador.ActividadVO;

public class Actividad {
	
	int codigoActividad;
	String titulo;
	String descripcion;
	String horario;
	String dia;
	//Constructores
	public Actividad(int codigoActividad, String titulo, String descripcion, String horario, String dia) {
		this.codigoActividad = codigoActividad;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.horario = horario;
		this.dia = dia;
	}
	
	public Actividad() {
	}
	
	//
	
	public ArrayList<Actividad> getActividades()
	{
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			stmt = conn.getConnection().prepareStatement("SELECT * FROM ACTIVIDAD ORDER BY \r\n" + 
					"     CASE \r\n" + 
					"       WHEN DIA = 'LUNES' THEN 1 \r\n" + 
					"       WHEN DIA = 'MARTES' THEN 2 \r\n" + 
					"       WHEN DIA = 'MIERCOLES' THEN 3 \r\n" + 
					"       WHEN DIA = 'JUEVES' THEN 4 \r\n" + 
					"       WHEN DIA = 'VIERNES' THEN 5 \r\n" + 
					"       WHEN DIA = 'SABADO' THEN 6 \r\n" + 
					"       WHEN DIA = 'DOMINGO' THEN 7 \r\n" + 
					"     END ASC,HORARIO");
			ResultSet rs = stmt.executeQuery();
	   		while (rs.next()) {
	   		    Integer codigoActividad = Integer.parseInt(rs.getString("ID_ACTIVIDAD"));
	   		    String titulo = rs.getString("TITULO");
	   		    String descripcion = rs.getString("DESCRIPCION");
	   		    String horario = rs.getString("HORARIO");
	   		    String dia = rs.getString("DIA");
	   		    
	   		    actividades.add(new Actividad(codigoActividad,titulo,descripcion,horario, dia));
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
	
	public void crearActividad(ActividadVO act)
	{
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			//setamos el ID con el sequence	   		
	   		stmt = conn.getConnection().prepareStatement("SELECT seq_actividad.nextval from DUAL");
	   		stmt.execute();
	   		//// Hacemos el inbsert
	   		
			stmt = conn.getConnection().prepareStatement("INSERT INTO ACTIVIDAD VALUES (seq_actividad.currval, '"
															+ act.getTitulo() +"', '"
															+ act.getDescripcion() +"', '"
															+ act.getDia() + "', '"
															+ act.getHorario() + ""
																	+ "')");
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
	
	public void modificarActividad(ActividadVO act)
	{
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
	   		
			stmt = conn.getConnection().prepareStatement("UPDATE ACTIVIDAD SET "
															+"TITULO = '"+ act.getTitulo() +"', "
															+"DESCRIPCION = '"+ act.getDescripcion() +"', "
															+"DIA = '"+ act.getDia() +"', "
															+"HORA = '"+ act.getHorario() +"' "
															+"WHERE ID_ACTIVIDAD = '"+ act.getCodigoAct()+"'");
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
	
	public void eliminarActividad(int codigoActividad){
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {		
			
	   		//VERIFICAR DELETE
	   		
			stmt = conn.getConnection().prepareStatement("DELETE FROM ACTIVIDAD WHERE ID_ACTIVIDAD = '"+ codigoActividad +"'");
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

	public Actividad buscarActividad(int codigoAct) {
		Actividad acti = new Actividad();
		
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
  			
			stmt = conn.getConnection().prepareStatement("SELECT * FROM ACTIVIDAD WHERE ID_ACTIVIDAD = '"+codigoAct+"'" );
			ResultSet rs = stmt.executeQuery();
	   		while (rs.next()) {
	   			acti.codigoActividad = Integer.parseInt(rs.getString("ID_ACTIVIDAD"));
	   			acti.titulo = rs.getString("TITULO");
	   			acti.descripcion = rs.getString("DESCRIPCION");
	   			acti.horario = rs.getString("HORA");
	   			acti.dia = rs.getString("DIA");

	   		    //socios = new Socio(this.id, this.nonbre,this.apellido,this.domicilio, this.telefono, this.email, this.certificado.fechaCertificado,this.certificado.medico,this.certificado.observaciones);
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
		
		return acti;
		
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

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
	
}
