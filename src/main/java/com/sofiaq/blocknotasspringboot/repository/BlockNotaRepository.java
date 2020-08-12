package com.sofiaq.blocknotasspringboot.repository;

import com.sofiaq.blocknotasspringboot.model.BlockNota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockNotaRepository extends JpaRepository<BlockNota, Integer>{
    
    
}
