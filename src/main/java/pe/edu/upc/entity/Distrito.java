package pe.edu.upc.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="distrito")
public class Distrito implements Serializable {


	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idDistrito;
	
	@Column(name="nameDistrito",nullable= false, length=30)
	private String nombreDistrito;

	@ManyToOne
	@JoinColumn(name="idTrabajador",nullable= false)
	private Trabajador trabajador;

	public Distrito() {
		super();
		
	}

	public Distrito(int idDistrito, String nombreDistrito, Trabajador trabajador) {
		super();
		this.idDistrito = idDistrito;
		this.nombreDistrito = nombreDistrito;
		this.trabajador = trabajador;
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombreDistrito() {
		return nombreDistrito;
	}

	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}



}
