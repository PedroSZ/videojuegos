package com.example.demo.repository;

import com.example.demo.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
    @Query("from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();
    
    @Query("from Videojuego v where v.distribuidor.id = ?1 order by v.nombre")
    List<Videojuego> buscarPorDistribuidor(int destribuidorId);
    
    //@Query("from Videojuego v where v.nombre like %?1%")
    //List<Videojuego> buscar(String consulta);
    
     //esto hace los mismo que JPA con @query lo cual es lo mismo que una consulta de Msql pero sobre una clase no sobre la base de datos
    //solo que en este caso spring data hace lo que JPA
    List<Videojuego> findByNombreContaining(String consulta);
    
}
