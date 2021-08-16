package com.cegedim.factions.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StringService implements IStringService{
    private String lorem = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque faucibus finibus arcu eget semper. Nam congue elit et pharetra consequat. Maecenas at augue a risus fringilla feugiat quis a massa. Vestibulum libero tellus, malesuada ullamcorper augue in, vehicula ultrices sapien. Praesent at rutrum massa. Praesent tempor est nisi. Nullam purus elit, posuere a odio at, consequat ullamcorper orci. Vivamus eu elit eu lacus eleifend ultricies. Aenean tincidunt risus quis bibendum ultrices. Fusce accumsan ipsum quis sodales euismod. Cras velit quam, tempus nec lobortis at, placerat nec augue. Nulla lacinia ante nec purus molestie dapibus. Integer commodo dui vitae varius consequat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nam massa ex, sodales ac lobortis quis, consectetur id sem.");
    private ArrayList<String> array = new ArrayList<>(Arrays.asList(lorem.split(" ")));
    private Integer index = 0;
    private Integer batchSize = 20;
    private List<String> getMore(){
    	int nextIndex = Math.min(array.size() - 1, index+batchSize);
        List<String> batch = array.subList(index, nextIndex);
        index = nextIndex;
        return batch;
    }

    @Override
    public List<String> getStringList(){
        return getMore();
    }
}
