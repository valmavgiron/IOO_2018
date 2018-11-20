package controlador;

import java.util.Date;

import modelo.Abono;
import modelo.Abono.Tipo;

public class AbonoVO {
	private int codAbono;
	private String nombre;
	private Float precio;
	private Date vigencia;
	private Tipo tipo;
	
	public AbonoVO()
	{	
	}
	
	public AbonoVO(int codAbono, String nombre, Float precio, Date vigencia, Tipo tipo) {
		super();
		this.codAbono = codAbono;
		this.nombre = nombre;
		this.precio = precio;
		this.vigencia = vigencia;
		this.tipo = tipo;
	}
	public AbonoVO(Abono abono) {
		this.codAbono = abono.getCodAbono();
		this.nombre = abono.getNombre();
		this.precio = abono.getPrecio();
		this.vigencia = abono.getVigencia();
		this.tipo = abono.getTipo();
	}
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
