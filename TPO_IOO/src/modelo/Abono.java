package modelo;

import java.util.Date;

public class Abono {

	int codAbono;
	String Nombre;
	float precio;
	Date vigencia;
	Tipo tipo;
	
	public enum Tipo {
	    Normal,Corporativo 
	}

	public Abono(int codAbono, String nombre, float precio, Date vigencia, Tipo tipo) {
		super();
		this.codAbono = codAbono;
		Nombre = nombre;
		this.precio = precio;
		this.vigencia = vigencia;
		this.tipo = tipo;
		
	}
	

}
