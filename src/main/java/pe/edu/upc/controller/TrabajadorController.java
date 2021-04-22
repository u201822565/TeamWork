package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Trabajador;
import pe.edu.upc.service.ITrabajadorService;

@Named
@RequestScoped

public class TrabajadorController implements Serializable {


	private static final long serialVersionUID = 1L;

	@Inject
	private ITrabajadorService mService;
	private Trabajador trabajador;
	List<Trabajador> listaTrabajadores;
	
	@PostConstruct
	public void init() {
		this.listaTrabajadores = new ArrayList<Trabajador>();
		this.trabajador = new Trabajador();
		this.listar();
	}
	
	
	public String nuevoTrabajador(){
		this.setTrabajador(new Trabajador());
		return "trabajador.xhtml";
	}
	
	public void insertar() {
		mService.insertar(trabajador);
		limpiarTrabajador();
	}
	
	public void listar() {
		listaTrabajadores = mService.listar();
	}
	
	public void limpiarTrabajador() {
		this.init();
	}
	
	public void eliminar(Trabajador trabajador) {
		mService.eliminar(trabajador.getIdTrabajador());
		this.listar();
	}


	public Trabajador getTrabajador() {
		return trabajador;
	}


	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}


	public List<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}


	public void setListaTrabajadores(List<Trabajador> listaTrabajadores) {
		this.listaTrabajadores = listaTrabajadores;
	}

	
	
}
