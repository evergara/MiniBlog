package com.ecosoft.service;

import java.util.List;

import com.ecosoft.model.Persona;

public interface IpersonaService {
	
	public Integer registrar(Persona persona) throws Exception;
	public Integer modificar(Persona persona) throws Exception;
	public Integer eleiminar(Persona persona) throws Exception;
	public List<Persona> listar() throws Exception;
	public Persona listarPorId(Persona persona) throws Exception;
}
