package com.ecosoft.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.ecosoft.dao.IPersonaDAO;
import com.ecosoft.model.Persona;

public class PersonaDAOImpl implements IPersonaDAO{

	@Override
	public Integer registrar(Persona persona) throws Exception {
		System.out.println(persona.getNombre());
		return null;
	}

	@Override
	public Integer modificar(Persona persona) throws Exception {
		return null;
	}

	@Override
	public Integer eleiminar(Persona persona) throws Exception {
		return null;
	}

	@Override
	public List<Persona> listar() throws Exception {
		List<Persona> personas = new ArrayList<>();
		Persona person = new Persona();
		person.setIdPersona(1);
		person.setNombre("Maria");
		personas.add(person);
		
		Persona person1 = new Persona();
		person1.setIdPersona(2);
		person1.setNombre("Juana");
		personas.add(person1);
		return personas;
	}

	@Override
	public Persona listarPorId(Persona persona) throws Exception {
		return null;
	}

}
