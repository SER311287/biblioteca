package biblioteca.uspg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.uspg.model.Usuario;
import biblioteca.uspg.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private IUsuarioService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) public
	 ResponseEntity<List<Usuario>> listar(){ 
	try {return new ResponseEntity<List<Usuario>>(service.listar(), HttpStatus.OK);
	}catch (Exception e) { 
		
	}	
	return null;
		 
	 }
	

}
