package com.prontmed.projeto.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	public class NovopacienteController {
		
		@RequestMapping("/novopaciente")
	   	public String novopaciente() {	
	   		return "novopaciente";
	       }
}
