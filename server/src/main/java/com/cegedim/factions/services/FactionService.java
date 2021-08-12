package com.cegedim.factions.services;


import java.util.List;
import java.util.Optional;

import com.cegedim.factions.models.Faction;
import com.cegedim.factions.repository.FactionsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactionService implements IFactionService {

    @Autowired
    private FactionsRepository repository;
    
    public List<Faction> findAll() {
        return (List<Faction>) repository.findAll();
    }

    public Optional<Faction> findById(Long id){
        return repository.findById(id);
    }
}