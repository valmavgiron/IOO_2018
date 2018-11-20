package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import controlador.ActividadVO;
import controlador.SocioVO;

public class Socio {

	int    id;
	String nombre;
	String apellido;
	String domicilio;
	String telefono;
	String email;
	CertificadoMedico certificado;
	
	public Socio(int id,String nombre, String apellido, String domicilio, String telefono, String email,java.util.Date fechaCertificado,String cert_medico,String cert_obs) {
		this.id=id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
		this.certificado = new CertificadoMedico(fechaCertificado, cert_medico, cert_obs);
//		this.certificado.fechaCertificado=fechaCertificado;
//		this.certificado.medico=cert_medico;
//		this.certificado.observaciones=cert_obs;
				
	}
	public Socio() {
				
	}
	
	public ArrayList<Socio> getSocios()
	{
		ArrayList<Socio> socios = new ArrayList<Socio>();
		
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			stmt = conn.getConnection().prepareStatement("SELECT * FROM SOCIO");
			ResultSet rs = stmt.executeQuery();
	   		while (rs.next()) {
	   		    Integer id = Integer.parseInt(rs.getString("ID_SOCIO"));
	   		    String nombre = rs.getString("NOMBRE");
	   		    String apellido = rs.getString("APELLIDO");
	   		    String domicilio = rs.getString("DOMICILIO");
	   		    String telefono = rs.getString("DOMICILIO");
	   		    String email = rs.getString("DOMICILIO");
//	   		    Date fechaCertificado = rs.getDate("CERT_FECHA");
	   		    Date fechaCertificado = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("CERT_FECHA"));
	   		    String certMedico = rs.getString("CERT_MEDICO");
	   		    String certObs = rs.getString("CERT_OBS");
	   		    
	   		    socios.add(new Socio(id,nombre,apellido,domicilio,telefono,email,fechaCertificado,certMedico,certObs));
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
		
		return socios;
	}
	
	public void agregarSocio(SocioVO socio)
	{
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			//setamos el ID con el sequence	   		
	   		stmt = conn.getConnection().prepareStatement("SELECT seq_socio.nextval from DUAL");
	   		stmt.execute();
	   		////
	   		//Insert en tabla Socio
			stmt = conn.getConnection().prepareStatement("INSERT INTO SOCIO VALUES(seq_socio.currval, '"
															+ socio.getNombre() +"', '"
															+ socio.getApellido() +"', '"
															+ socio.getDomicilio() +"', "
															+ socio.getTelefono() +"', "
															+ socio.getEmail() +"', "
															+ socio.getCertificado().getFechaCertificado() +"', "
															+ socio.getCertificado().getMedico() +"', "
															+ socio.getCertificado().getObservaciones() + ")");
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
	
	public void modificarSocio(SocioVO socio)
	{
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
	   		
			stmt = conn.getConnection().prepareStatement("UPDATE SOCIO SET "
															+"NOMBRE = '"+ socio.getNombre() +"', "
															+"APELLIDO = '" + socio.getApellido() +"', "
															+"DOMICILIO = '"+ socio.getDomicilio() +"', "
															+"TELEFONO = '"+ socio.getTelefono() +"', "
															+"EMAIL = '"+ socio.getEmail() +"', "
															+"CERT_FECHA = '"+ socio.getCertificado().getFechaCertificado() +"', "
															+"CERT_MEDICO = '"+ socio.getCertificado().getMedico() +"', "
															+"CERT_OBS = '"+ socio.getCertificado().getObservaciones() +"' "
															+"WHERE ID_SOCIO = '"+ socio.getId() +"'");
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
	
	public void eliminarSocio(int id){
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {		
			
	   		//VERIFICAR DELETE
	   		
			stmt = conn.getConnection().prepareStatement("DELETE FROM SOCIO WHERE ID_SOCIO = '"+ id +"'");
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CertificadoMedico getCertificado() {
		return certificado;
	}

	public void setCertificado(CertificadoMedico certificado) {
		this.certificado = certificado;
	}
	
	//
	
}
