package com.example.demo.service;

import com.example.demo.domain.Distribuidor;
import com.example.demo.repository.DistribuidorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DistribuidorService {
    
    private final DistribuidorRepository distribuidorRepository;
    
    public DistribuidorService(DistribuidorRepository distribuidorRepository){
    this.distribuidorRepository = distribuidorRepository;
    }
    
    public List<Distribuidor> buscarTodos(){
    return distribuidorRepository.findAll();
    }
}
