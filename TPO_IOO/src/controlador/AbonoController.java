package controlador;


import java.util.*;
import modelo.*;
import modelo.Abono.Tipo;


public class AbonoController 
{
	private ArrayList<AbonoVO> abonos;
	
	public AbonoController()
	{
		
	}
	
	public void crearAbono(int codAbono, String nombre, Float precio, Date vigencia, Tipo tipo)
	{
		Abono a = new Abono(codAbono, nombre, precio, vigencia, tipo);
		a.crearAbono();		
	}
	
	public void modificarAbono(int codAbono)
	{
		abonos = new ArrayList<AbonoVO>();
		Abono a = new Abono();
			a.setNombre(r.getNombre());
			a.setPrecio(r.getPrecio());
			a.setVigencia(r.getVigencia());
			a.setTipo(r.getTipo());
			
			a.modificarAbono();
			
	}

	public void eliminarAbono(int codAbono)
	{
		Abono a = new Abono(codAbono);
		a.eliminarAbono();
		
	}	

}

