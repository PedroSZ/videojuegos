package com.example.demo.repository;

import com.example.demo.domain.Desarrollador;
import com.example.demo.domain.Distribuidor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DesarrolladorRepository extends JpaRepository<Desarrollador, Integer>{
    
   @Query("from Desarrollador v order by v.nombre")
    List<Distribuidor> buscarTodos();
}
