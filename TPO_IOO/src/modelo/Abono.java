package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import controlador.AbonoVO;

public class Abono {

	int codAbono;
	String Nombre;
	float precio;
	Date vigencia;
	Tipo tipo;
	
	public enum Tipo {
	    Normal,Corporativo 
	}

	public Abono() {

		
	}
	public Abono(int codAbono, String nombre, float precio, Date vigencia, Tipo tipo) {
		super();
		this.codAbono = codAbono;
		this.Nombre = nombre;
		this.precio = precio;
		this.vigencia = vigencia;
		this.tipo = tipo;
		
	}
	
	
	public ArrayList<Abono> getAbonos()
	{
		ArrayList<Abono> abonos = new ArrayList<Abono>();
		
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			stmt = conn.getConnection().prepareStatement("SELECT * FROM ABONO");
			ResultSet rs = stmt.executeQuery();
	   		while (rs.next()) {
	   		    this.codAbono = Integer.parseInt(rs.getString("ID_ABONO"));
	   		    this.Nombre = rs.getString("NOMBRE");
	   		    this.precio = Float.parseFloat(rs.getString("PRECIO"));
	   		    this.tipo = Tipo.valueOf(rs.getString("TIPO"));
	   		    this.vigencia = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("VIGENCIA"));
	   		    
	   		    abonos.add(new Abono(this.codAbono, this.Nombre,this.precio,this.vigencia,this.tipo));
	   		    System.out.println(this.toString());
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
		
		return abonos;
	}
	
	public void crearAbono(AbonoVO a)
	{
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {			
			//setamos el ID con el sequence	   		
	   		stmt = conn.getConnection().prepareStatement("SELECT seq_abono.nextval from DUAL");
	   		stmt.execute();
	   		
	   		////
	   		
	   		//VERIFICAR INSERT
			stmt = conn.getConnection().prepareStatement("INSERT INTO ABONO VALUES (seq_abono.currval, '"
															+ a.getNombre() +"', '"
															+ a.getPrecio() +"', "
															+ a.getVigencia() +"', "
															+ a.getTipo() + ")");
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
	
	public void modificarAbono(AbonoVO a){
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {		
			
	   		//VERIFICAR UPDATE
	   		
			stmt = conn.getConnection().prepareStatement("UPDATE ABONO SET "
															
															+"NOMBRE = '"+ a.getNombre() +"', "
															+"PRECIO = '"+ a.getPrecio() +"', "
															+"VIGENCIA = '"+ a.getVigencia() +"', "
															+ "TIPO ='" +a.getTipo() + "' WHERE ID_ABONO = '"+ a.getCodAbono()+"'");
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
	
	public void eliminarAbono(int codAbono){
		Conexion conn = Conexion.getInstance();
		
		PreparedStatement stmt = null; 
		try {		
			
	   		//VERIFICAR DELETE
	   		
			stmt = conn.getConnection().prepareStatement("DELETE FROM ABONO WHERE ID_ABONO = '"+ codAbono +"'");
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
	
	@Override
	public String toString() {
		return "Abono [codAbono=" + codAbono + ", Nombre=" + Nombre + ", precio=" + precio + ", vigencia=" + vigencia
				+ ", tipo=" + tipo + "]";
	}
	public int getCodAbono() {
		return codAbono;
	}
	public void setCodAbono(int codAbono) {
		this.codAbono = codAbono;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Date getVigencia() {
		return vigencia;
	}
	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}	

}
