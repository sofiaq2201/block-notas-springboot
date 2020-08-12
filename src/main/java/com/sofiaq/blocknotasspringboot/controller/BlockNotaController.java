package com.sofiaq.blocknotasspringboot.controller;

import com.sofiaq.blocknotasspringboot.model.BlockNota;
import com.sofiaq.blocknotasspringboot.service.BlockNotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/blocknotas")
public class BlockNotaController {
    
    @Autowired
    private BlockNotaService bnService;
    
    @GetMapping("/")
    public List<BlockNota> listar(){
        return bnService.getAll();
    }
    
}
