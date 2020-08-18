package com.sofiaq.blocknotasspringboot.service;

import com.sofiaq.blocknotasspringboot.model.BlockNota;
import com.sofiaq.blocknotasspringboot.repository.BlockNotaRepository;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlockNotaService {
    
    @Autowired
    private BlockNotaRepository bnRepository;
    
    public List<BlockNota> getAllByModified(){
        return bnRepository.findByOrderByModifiedDesc();
      
    }
    
    public BlockNota save(BlockNota b){
      b.setModified(new Timestamp(System.currentTimeMillis()));
      return bnRepository.save(b);
    }
    
    public BlockNota deleteNota(int id) throws Exception{
        BlockNota nota = bnRepository.findById(id).orElseThrow( () -> new Exception("No existe nota con id" + id));
        bnRepository.delete(nota);
        return nota;
    }
    
    public BlockNota getNoteById(int id) throws Exception{
        BlockNota nota = bnRepository.findById(id).orElseThrow( () -> new Exception("No existe nota con id" + id));
        return nota;
    }  
    
    public BlockNota updateNota(BlockNota bn) throws Exception{
        bn.setModified(new Timestamp(System.currentTimeMillis()));
        return bnRepository.save(bn);
    }
    
    
}
