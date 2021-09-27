package com.example.demo.repository;

import com.example.demo.domain.Distribuidor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer>{
    
   @Query("from Distribuidor v order by v.nombre")
    List<Distribuidor> buscarTodos();
}
