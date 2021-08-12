package com.cegedim.factions.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "factions")
public class Faction implements Serializable{
    @Id
    @Column(name="faction_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long faction_id;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "ruler")
    private String ruler;

    @Column(name = "claimant")
    private String claimant;

    
    @Column(name = "capital")
    private String capital;
    
    @Override
    public String toString(){
        return name + " " + ruler;
    }
    
}


