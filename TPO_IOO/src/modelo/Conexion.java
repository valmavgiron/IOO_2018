package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:~/test";  
	static final String bd = "GIMNASIO";
	static final String USER = "sa"; 
    static final String PASS = "sa"; 
    
    Connection conn = null;
    
    private static Conexion _instance; 

    private Conexion() {
    	
    }
   
    public static Conexion getInstance(){
        if(_instance == null){
            _instance = new Conexion();
        }
        return _instance;
    }
    

	public Connection getConnection(){
		try{
			if(conn == null) {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
			}	
			if (conn!=null){
				System.out.println("Conecci�n a base de datos " + bd + " OK");
			}
		}
		catch(SQLException e){
			System.out.println(e);
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		return conn;
	}
	
	public void desconectar(){
		try
		{
			if(conn != null)
				conn.close();
			conn = null;
		}
		catch(Exception e)
		{
			
		}
	}
}
