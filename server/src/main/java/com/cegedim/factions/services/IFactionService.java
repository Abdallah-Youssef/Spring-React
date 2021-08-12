package com.cegedim.factions.services;

import java.util.List;

import com.cegedim.factions.models.Faction;

public interface IFactionService {

    List<Faction> findAll();
}