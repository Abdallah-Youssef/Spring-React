package com.cegedim.factions.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StringService implements IStringService{
    static private String lorem = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ultricies diam leo, a sodales lorem facilisis vitae. Morbi semper porta laoreet. Mauris consectetur lacus vitae augue pretium, sit amet varius quam tincidunt. Aliquam erat volutpat. Maecenas congue ullamcorper ultrices. Sed non odio nec leo faucibus imperdiet sit amet in orci. Vestibulum ligula sapien, malesuada non maximus vel, ultricies eget nisl. Praesent dignissim tortor et ipsum mattis rhoncus. Donec aliquam, ex at finibus consequat, tortor sapien tristique velit, at iaculis erat tellus nec ex. Proin pretium, quam sit amet accumsan iaculis, metus ipsum dignissim quam, sollicitudin porta lectus augue egestas tortor.");

    @Override
    public List<String> getStringList(){
        return new ArrayList<String>(Arrays.asList(lorem.split(" ")));
    }
}
