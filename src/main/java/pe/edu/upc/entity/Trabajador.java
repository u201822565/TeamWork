package pe.edu.upc.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trabajador")
public class Trabajador implements Serializable {


	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idTrabajador;
	
	@Column(name="nameTrabajador",nullable= false, length=30)
	private String nombreTrabajador;
	
	@Column(name="nameServicio",nullable= false, length=30)
	private String nombreServ;
	
	@Column(name="precioServicio",nullable= false, length=30)
	private String precioServicio;

	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trabajador(int idTrabajador, String nombreTrabajador, String nombreServ, String precioServicio) {
		super();
		this.idTrabajador = idTrabajador;
		this.nombreTrabajador = nombreTrabajador;
		this.nombreServ = nombreServ;
		this.precioServicio = precioServicio;
	}

	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public String getNombreTrabajador() {
		return nombreTrabajador;
	}

	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}

	public String getNombreServ() {
		return nombreServ;
	}

	public void setNombreServ(String nombreServ) {
		this.nombreServ = nombreServ;
	}

	public String getPrecioServicio() {
		return precioServicio;
	}

	public void setPrecioServicio(String precioServicio) {
		this.precioServicio = precioServicio;
	}



}
