package com.sofiaq.blocknotasspringboot.controller;

import com.sofiaq.blocknotasspringboot.model.BlockNota;
import com.sofiaq.blocknotasspringboot.service.BlockNotaService;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        return bnService.getAllByModified();
    }
    
    @PostMapping("/")
    public BlockNota save(@RequestBody BlockNota b){
        
        return bnService.save(b);
    }
    
    @GetMapping("/{id}")
    public BlockNota getNoteById(@PathVariable("id") int id) throws Exception{
        return bnService.getNoteById(id);
    }
    
    @PutMapping("/{id}")
    public BlockNota updateNota(@PathVariable("id") int id, @RequestBody BlockNota bn) throws Exception{
        return bnService.updateNota(id, bn);
    }
    
    @DeleteMapping("/{id}")
    public BlockNota deleteNota(@PathVariable("id") int id) throws Exception{
        return bnService.deleteNota(id);
    }
    
}
