package com.cegedim.factions.controllers;

import com.cegedim.factions.services.FactionService;
import com.cegedim.factions.services.StringService;
import com.cegedim.factions.models.Faction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class Controller {
    @Autowired
    private FactionService factionService;

    @Autowired
    private StringService stringService;

    @GetMapping("/")
    public String index(){
        return "Hello world";
    }


    @GetMapping("list")
    public List<String> getStringList(){
        return stringService.getStringList();
    }

    @GetMapping("/factions")
    public List<Faction> findFactions() {
        return factionService.findAll();
    }

    @GetMapping("/factions/{faction_id}")
    public Faction findFaction(@PathVariable Long faction_id) {
        return factionService.findById(faction_id).orElse(null);
    }
    
}
