package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import controlador.CertificadoMedicoVO;
import controlador.SocioVO;

public class CertificadoMedico {

	Date fechaCertificado;
	String medico;
	String observaciones;
	int idSocio;
	
	public CertificadoMedico(Date fechaCertificado, String medico, String observaciones,int idSocio) {
		super();
		this.fechaCertificado = fechaCertificado;
		this.medico = medico;
		this.observaciones = observaciones;
		this.idSocio=idSocio;
		
	}

	public CertificadoMedico() {

		
	}
	public Date getFechaCertificado() {
		return fechaCertificado;
	}

	public void setFechaCertificado(Date fechaCertificado) {
		this.fechaCertificado = fechaCertificado;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	
	public void agregarCertificado(CertificadoMedicoVO cert)
	{
		Conexion conn = Conexion.getInstance();
		
		//Fecha
		String pattern = "yyyy-MM-dd";
        Date date = this.fechaCertificado;
        Date fecha = null;
        String fecha2 = null;
        try {
            DateFormat df = new SimpleDateFormat(pattern);
            fecha2 = df.format(date);
            fecha = df.parse(fecha2);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
		
		
		PreparedStatement stmt = null; 
		try {			
	   		//Insert en tabla Certificado
			stmt = conn.getConnection().prepareStatement("INSERT INTO CERTIFICADO VALUES ('"+ fecha2 +"', '"
															+ cert.getMedico() +"', '"															
															+ cert.getObservaciones() +"', '"
															+ cert.getIdSocio() + "')");
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
	
	public ArrayList<CertificadoMedico> getCertificados()
	{
		ArrayList<CertificadoMedico> certificados = new ArrayList<CertificadoMedico>();
		
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			stmt = conn.getConnection().prepareStatement("SELECT * FROM CERTIFICADO");
			ResultSet rs = stmt.executeQuery();
	   		while (rs.next()) {
	   		    Date certFecha = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("CERT_FECHA"));
	   		    String certMedico = rs.getString("CERT_MEDICO");
	   		    String certObs = rs.getString("CERT_OBS");
	   		    int idSocio = Integer.parseInt(rs.getString("ID_SOCIO_FK"));	   		    
	   		    
	   		    certificados.add(new CertificadoMedico(certFecha,certMedico,certObs,idSocio));
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
		
		return certificados;
	}
	
}
