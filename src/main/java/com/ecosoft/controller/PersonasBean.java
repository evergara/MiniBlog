package com.ecosoft.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.ecosoft.model.Persona;
import com.ecosoft.service.IpersonaService;
import com.ecosoft.service.impl.PersonaServiceImpl;

/**
 * @author emerson.vergara
 *
 */
@Named
@RequestScoped
public class PersonasBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
    Persona persona;
    IpersonaService service;
    List<Persona> lista;
 
	public PersonasBean() {
		this.persona = new Persona();
		this.service = new PersonaServiceImpl();
		this.listar();
	}
	
	public void registrar() {
		try {
			this.service.registrar(this.persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void listar() {
		try {
			this.lista = service.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    /**
     * 	
     * getters and setters
     */
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getLista() {
		return lista;
	}
}
