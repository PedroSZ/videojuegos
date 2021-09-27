package com.example.demo.controller;

import com.example.demo.domain.Videojuego;
import com.example.demo.service.DesarrolladorService;
import com.example.demo.service.DistribuidorService;
import com.example.demo.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegoAbmController {
    
    private final DesarrolladorService desarrolladorService;
    private final DistribuidorService distribuidorService;
    private final VideojuegoService videojuegoService;

    public VideojuegoAbmController(DesarrolladorService desarrolladorService, DistribuidorService distribuidorService, VideojuegoService videojuegoService) {
        this.desarrolladorService = desarrolladorService;
        this.distribuidorService = distribuidorService;
        this.videojuegoService = videojuegoService;
    }
     
    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model){
        model.addAttribute("desarrolladores", desarrolladorService.buscarTodos());
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new Videojuego());
        return "formViedeojuego";
    }
    
    @PostMapping("/videojuegos/guardar")
    public String guardar(Videojuego videojuego){
        videojuegoService.guardar(videojuego);
        System.out.print(videojuego);
        return"redirect:/";
    }
    
}
