package com.ecosoft.service.impl;

import java.util.List;

import com.ecosoft.dao.IPersonaDAO;
import com.ecosoft.dao.impl.PersonaDAOImpl;
import com.ecosoft.model.Persona;
import com.ecosoft.service.IpersonaService;

public class PersonaServiceImpl implements IpersonaService {

	private IPersonaDAO dao;
		
	public PersonaServiceImpl() {
		this.dao = new PersonaDAOImpl();
	}

	@Override
	public Integer registrar(Persona persona) throws Exception {
		return dao.registrar(persona);
	}

	@Override
	public Integer modificar(Persona persona) throws Exception {
		return dao.modificar(persona);
	}

	@Override
	public Integer eleiminar(Persona persona) throws Exception {
		return dao.eleiminar(persona);
	}

	@Override
	public List<Persona> listar() throws Exception {
		return dao.listar();
	}

	@Override
	public Persona listarPorId(Persona persona) throws Exception {
		return dao.listarPorId(persona);
	}
	
}
