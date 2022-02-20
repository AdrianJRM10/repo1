package com.pruebaAPIREST.pruabaREST.rest;
import com.pruebaAPIREST.pruabaREST.repository.PersonasDAO;

import javax.websocket.server.PathParam;

import com.pruebaAPIREST.pruabaREST.models.Personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List; //Define Lista Java, para trabajar con el modelo creado.

//import antlr.collections.List;


@RestController
@RequestMapping ("/personas")
public class PersonasRest {
    @Autowired
    private PersonasDAO personaDAO;
    
    //Metodos HTTP, para solicitud al servidor.
    //GET, POST, PUT, DELETE -> 200(OK),500(ERROR DE LOGICA),404 (ERROR DE SENTENCIA EN RUTAS)
    @PostMapping ("/guardar")
    public void guardarPersona (@RequestBody Personas persona) { 
    //@RequestBody se utiliza para recibir objeto JSON y convertirlo al objeto JAVA definido en la clase.
        personaDAO.save(persona);  
    }
    
    @PutMapping ("/actualizar")
    public void actualizarPersona (@RequestBody Personas persona) {
        personaDAO.save(persona);
    }

    @GetMapping ("/listar")
    public List<Personas> listarPersonas () {
        return personaDAO.findAll();
    }

    @DeleteMapping ("/eliminar")
    public void eliminarPersona (@PathParam ("id") Integer id) {
        personaDAO.deleteById(id);
    }

}
