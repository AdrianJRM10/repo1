package com.pruebaAPIREST.pruabaREST.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pruebaAPIREST.pruabaREST.models.Personas;

public interface PersonasDAO extends JpaRepository <Personas, Integer> {
    
}
