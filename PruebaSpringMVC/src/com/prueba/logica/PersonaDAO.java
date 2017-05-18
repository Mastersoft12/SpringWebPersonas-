package com.prueba.logica;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.prueba.model.Persona;

@Component("PersonaDAO")
public class PersonaDAO {
	
	private List<Persona> listGlobal;
	
	public List<Persona> obtenerPersonasAll(){
		if(listGlobal == null || listGlobal.isEmpty()){
			listGlobal = iniciarLista();
		}
		return listGlobal;
	}
	
	public Persona obtenerPersona(String cedula){
		List<Persona> listaPersonas = obtenerPersonasAll();
		Persona resultado = new Persona();
		for(Persona person: listaPersonas){
			if(person.getCedula().equals(cedula)){
				resultado = person;
			}
		}
		return resultado;
	}
	
	public void agregarPersona(Persona person){
		if(listGlobal == null || listGlobal.isEmpty()){
			listGlobal = iniciarLista();	
		}
		this.listGlobal.add(person);
	}
	
	public List<Persona> iniciarLista(){
		List<Persona> resultado = new ArrayList<>();
		resultado.add(new Persona("1069468689", "Fabio", "Martinez", 29));
		resultado.add(new Persona("1069468686", "Pedro", "Torres", 30));
		return resultado;
	}

	public List<Persona> getListGlobal() {
		return listGlobal;
	}

	public void setListGlobal(List<Persona> listGlobal) {
		this.listGlobal = listGlobal;
	}
	
	

}
