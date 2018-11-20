package controlador;


import java.util.ArrayList;

import modelo.Abono;


public class AbonoController 
{
	private ArrayList<AbonoVO> abonos;
	
	public AbonoController()
	{
		
	}
	
	public ArrayList<AbonoVO> getAbonosVO() {
		abonos = new ArrayList<AbonoVO>();
		Abono abono = new Abono();
		ArrayList<Abono> res = abono.getAbonos();
		for(Abono a: res){
			abonos.add(new AbonoVO(a));
		}
		return abonos;
	}
	
	public void crearAbono(AbonoVO abonoVO)
	{
		Abono a = new Abono();
		a.crearAbono(abonoVO);		
	}
	
	public void modificarAbono(AbonoVO abonoVO)
	{
		Abono a = new Abono();
		a.modificarAbono(abonoVO);
			
	}

	public void eliminarAbono(int codAbono)
	{
		Abono a = new Abono();
		a.eliminarAbono(codAbono);
		
	}	
	
	
//Se comentan los metodos del controller si tuviera comunicacion de la DB
//	public void crearAbono(int codAbono, String nombre, Float precio, Date vigencia, Tipo tipo)
//	{
//		Conexion conn = Conexion.getInstance();
//		
//		PreparedStatement stmt = null; 
//		try {			
//			//setamos el ID con el sequence	   		
//	   		stmt = conn.getConnection().prepareStatement("SELECT seq_abono.nextval from DUAL");
//	   		stmt.execute();
//	   		
//	   		////
//	   		
//	   		//VERIFICAR INSERT
//			stmt = conn.getConnection().prepareStatement("INSERT INTO ABONO VALUES (seq_abono.currval, '"
//															+ nombre +"', '"
//															+ precio +"', "
//															+ vigencia +"', "
//															+ tipo + ")");
//			stmt.execute();
//			
//		}
//		catch(SQLException se) {
//			System.out.println(se);
//		}
//		catch(Exception ex) {
//			System.out.println(ex);
//		}
//		finally {
//			conn.desconectar();
//		}
//	}
//	
//	public void modificarAbono(Abono a){
//		Conexion conn = Conexion.getInstance();
//		
//		PreparedStatement stmt = null; 
//		try {		
//			
//	   		//VERIFICAR UPDATE
//	   		
//			stmt = conn.getConnection().prepareStatement("UPDATE ABONO SET "
//															
//															+"NOMBRE = '"+ a.getNombre() +"', "
//															+"PRECIO = '"+ a.getPrecio() +"', "
//															+"VIGENCIA = '"+ a.getVigencia() +"', "
//															+ "TIPO ='" +a.getTipo() + "' WHERE ID_ABONO = '"+ a.getCodAbono()+"'");
//			stmt.execute();
//			
//		}
//		catch(SQLException se) {
//			System.out.println(se);
//		}
//		catch(Exception ex) {
//			System.out.println(ex);
//		}
//		finally {
//			conn.desconectar();
//		}
//	}
//	
//	public void eliminarAbono(int codAbono){
//		Conexion conn = Conexion.getInstance();
//		
//		PreparedStatement stmt = null; 
//		try {		
//			
//	   		//VERIFICAR DELETE
//	   		
//			stmt = conn.getConnection().prepareStatement("DELETE FROM ABONO WHERE ID_ABONO = '"+ codAbono +"'");
//			stmt.execute();
//			
//		}
//		catch(SQLException se) {
//			System.out.println(se);
//		}
//		catch(Exception ex) {
//			System.out.println(ex);
//		}
//		finally {
//			conn.desconectar();
//		}
//	}

}



