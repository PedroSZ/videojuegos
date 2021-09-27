package com.example.demo.service;

import com.example.demo.domain.Desarrollador;
import com.example.demo.repository.DesarrolladorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DesarrolladorService {
    
    private final DesarrolladorRepository desarrolladorRepository;
    
    public DesarrolladorService(DesarrolladorRepository desarrolladorRepository){
    this.desarrolladorRepository = desarrolladorRepository;
    }
    
    public List<Desarrollador> buscarTodos(){
    return desarrolladorRepository.findAll();
    }
}
