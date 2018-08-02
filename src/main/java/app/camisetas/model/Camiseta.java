package app.camisetas.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="camisetas")
public class Camiseta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)   
	private int id;
	private String marca;
	private double precio;
	private String talle;
	private String color;
	private String imagen = "camiseta.png";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Camiseta [id=" + id + ", marca=" + marca + ", precio=" + precio + ", talle=" + talle + ", color="
				+ color + ", imagen=" + imagen + "]";
	}
	
}
