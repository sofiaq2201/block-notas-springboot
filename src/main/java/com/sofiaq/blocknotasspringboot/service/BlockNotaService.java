package com.sofiaq.blocknotasspringboot.service;

import com.sofiaq.blocknotasspringboot.model.BlockNota;
import com.sofiaq.blocknotasspringboot.repository.BlockNotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlockNotaService {
    
    @Autowired
    private BlockNotaRepository bnRepository;
    
    public List<BlockNota> getAll(){
        return bnRepository.findAll();
    }
    
    public BlockNota save(BlockNota b){
      return bnRepository.save(b);
    }
    
    public void deleteBlock(int id){
        BlockNota block = bnRepository.findById(id).get();
        bnRepository.delete(block);
    }
    
    
}
