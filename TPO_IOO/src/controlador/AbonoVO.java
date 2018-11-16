package controlador.controlador;

import java.util.Date;

import modelo.Abono.Tipo;

public class AbonoVO {
	private int codAbono;
	private String nombre;
	private Float precio;
	private Date vigencia;
	private Tipo tipo;
	
	
	public int getCodAbono() {
		return codAbono;
	}
	public void setCodAbono(int codAbono) {
		this.codAbono = codAbono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
