package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HolaMundoSpring {
	
	@RequestMapping(path="/", method= RequestMethod.GET)
	public String holaMundo(@RequestParam(name= "nombre", defaultValue="defecto")String nombre) { //Lo que recibamos por parametro se va a guardar
																								//en la variable nombre
		return "Hola mundo con spring java2" + nombre;
	}
}
