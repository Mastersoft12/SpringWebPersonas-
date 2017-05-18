package com.prueba.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.logica.PersonaDAO;
import com.prueba.model.Persona;

@Controller
public class PersonaController {
	
	@Autowired
	public PersonaDAO dao;
	
	@RequestMapping( value = "/personasAll", method=RequestMethod.GET)
	public String obtenerPersonasAll(Model model){
	    model.addAttribute("PersonaList",dao.obtenerPersonasAll());
		return "personaAll";
	}
	
	@RequestMapping( value = "/personas", method=RequestMethod.GET)
	public String obtenerPersona(@RequestParam("cedula") String cedula, Model model){
		 model.addAttribute("PersonBD",dao.obtenerPersona(cedula));
		 //Ejemplo de peticion http://localhost:8080/PruebaSpringMVC/personas?cedula=1069468686
		return "personaId";
	}
	
	@RequestMapping( value = "/irRegistrarPersona", method=RequestMethod.GET)
	public String irRegistarPersona(){
		return "registrarPersona";
	}
	
	@RequestMapping( value = "/irRegistrarPersona", method=RequestMethod.POST)
	public String registarPersona(Persona person){
		dao.agregarPersona(person);
		return "redirect:/personasAll/";
		
	}
	
	
	
	

}
