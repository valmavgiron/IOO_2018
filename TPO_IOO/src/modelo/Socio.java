package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Socio {

	int    id;
	String nonbre;
	String apellido;
	String domicilio;
	String telefono;
	String email;
	CertificadoMedico certificado;
	
	public Socio() {
		
	}
	
	public Socio(int id,String nonbre, String apellido, String domicilio, String telefono, String email,java.util.Date fechaCertificado,String cert_medico,String cert_obs) {
		this.id=id;
		this.nonbre = nonbre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
		this.certificado = new CertificadoMedico(fechaCertificado, cert_medico, cert_obs);
		//this.certificado.fechaCertificado=null;
		//this.certificado.medico=cert_medico;
		//this.certificado.observaciones=cert_obs;
				
	}
	
	public void AgregarSocio() 
	{
		Conexion conn = Conexion.getInstance();
		PreparedStatement stmt = null; 
		
		String pattern = "yyyy-MM-dd";
        Date date = this.certificado.fechaCertificado;
        Date fecha = null;
        String fecha2 = null;
        try {
            DateFormat df = new SimpleDateFormat(pattern);
            fecha2 = df.format(date);
            fecha = df.parse(fecha2);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
		try {			
			//setamos el ID con el sequence	   		
	   		stmt = conn.getConnection().prepareStatement("SELECT seq_socio.nextval from DUAL");
	   		stmt.execute();
	   		////
	   		//Insert en tabla Socio
			stmt = conn.getConnection().prepareStatement("INSERT INTO SOCIO VALUES(seq_socio.currval, '"
															+ this.nonbre +"', '"
															+ this.apellido +"', '"
															+ this.domicilio +"', '"
															+ this.telefono +"', '"
															+ this.email +"', '"
															+ fecha2 +"', '"
															+ null +"', '"
															+ null + "')");
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
	
	public Vector<Socio> GetSocios()
	{
		Vector<Socio> socios = new Vector<Socio>();
		
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			stmt = conn.getConnection().prepareStatement("SELECT * FROM SOCIO");
			ResultSet rs = stmt.executeQuery();
	   		while (rs.next()) {	   			
	   		    this.id = Integer.parseInt(rs.getString("ID_SOCIO"));
	   		    this.nonbre = rs.getString("NOMBRE");
	   		    this.apellido = rs.getString("APELLIDO");
	   		    this.domicilio = rs.getString("DOMICILIO");
	   		    this.telefono = rs.getString("TELEFONO");
	   		    this.email = rs.getString("EMAIL");
	   		    this.certificado.fechaCertificado = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("CERT_FECHA"));
	   		    this.certificado.medico = rs.getString("CERT_MEDICO");
	   		    this.certificado.observaciones = rs.getString("CERT_OBS");
	   		    
	   		    socios.add(new Socio(this.id, this.nonbre,this.apellido,this.domicilio, this.telefono, this.email, this.certificado.fechaCertificado,this.certificado.medico,this.certificado.observaciones));
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
	public void ModificarSocio(Socio x)
	{
		
	}
	public void EliminarSocio(int x)
	{
		
	}
	public void ModificarSocio(int x)
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNonbre() {
		return nonbre;
	}

	public void setNonbre(String nonbre) {
		this.nonbre = nonbre;
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

	public Socio BuscarSocio(String text) {
		// TODO Auto-generated method stub
		Socio socios = new Socio();
		
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			stmt = conn.getConnection().prepareStatement("SELECT * FROM SOCIO WHERE ID_SOCIO = '"+text+"'" );
			ResultSet rs = stmt.executeQuery();
	   		while (rs.next()) {	   			
	   		    socios.id = Integer.parseInt(rs.getString("ID_SOCIO"));
	   		    socios.nonbre = rs.getString("NOMBRE");
	   		    socios.apellido = rs.getString("APELLIDO");
	   		    socios.domicilio = rs.getString("DOMICILIO");
	   		    socios.telefono = rs.getString("TELEFONO");
	   		    socios.email = rs.getString("EMAIL");
	   		    //this.certificado.fechaCertificado = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("CERT_FECHA"));
	   		    socios.certificado.medico = rs.getString("CERT_MEDICO");
	   		    socios.certificado.observaciones = rs.getString("CERT_OBS");
	   		    
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
		
		return socios;
		
		
	}
}
