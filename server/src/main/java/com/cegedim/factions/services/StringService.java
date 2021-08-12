package com.cegedim.factions.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StringService implements IStringService{
    private String lorem = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque faucibus finibus arcu eget semper. Nam congue elit et pharetra consequat. Maecenas at augue a risus fringilla feugiat quis a massa. Vestibulum libero tellus, malesuada ullamcorper augue in, vehicula ultrices sapien. Praesent at rutrum massa. Praesent tempor est nisi. Nullam purus elit, posuere a odio at, consequat ullamcorper orci. Vivamus eu elit eu lacus eleifend ultricies. Aenean tincidunt risus quis bibendum ultrices. Fusce accumsan ipsum quis sodales euismod. Cras velit quam, tempus nec lobortis at, placerat nec augue. Nulla lacinia ante nec purus molestie dapibus. Integer commodo dui vitae varius consequat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nam massa ex, sodales ac lobortis quis, consectetur id sem. Aliquam ipsum purus, pharetra quis metus ut, facilisis suscipit urna. Fusce faucibus est sed diam lacinia, eget varius quam egestas. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Aliquam nec consequat libero. Aenean consequat velit magna, at blandit urna scelerisque vitae. Pellentesque dui turpis, fringilla non pretium ac, consequat eu quam. Ut pretium dignissim purus et eleifend. Sed quis sem et eros tincidunt maximus et eget urna. Curabitur non facilisis tortor. Donec tellus justo, mollis sed tincidunt rhoncus, blandit in nisi. Nunc risus magna, lobortis sit amet sodales sit amet, porta a nisi. Curabitur egestas vulputate turpis, sed maximus leo tempor non. Integer vulputate lacus ut iaculis dapibus. Integer vitae dui nisl. In et nulla sed arcu vulputate elementum eu ac mauris. Praesent nisl nisl, auctor auctor luctus at, faucibus vitae elit. Nunc malesuada egestas euismod. Mauris malesuada tellus nec ornare rutrum. Maecenas lobortis enim ut nisi porta aliquam. Nullam blandit maximus sollicitudin. Fusce sodales odio diam, in mattis augue dapibus sit amet. Nulla ornare pretium mauris ac dignissim. Sed luctus consectetur dolor sit amet tristique. Nullam libero risus, laoreet in justo ac, sagittis varius nisi. In at vehicula nisi. Nulla facilisi. Praesent et dictum erat, ut varius augue. Vestibulum nibh velit, ultricies mollis lectus in, scelerisque auctor dui. Nunc laoreet cursus metus vehicula posuere. Nullam aliquet porta ligula, ut condimentum orci ornare eget. Donec ac sapien id neque ultricies dignissim. Proin vulputate augue elit, fringilla accumsan nunc viverra non. Ut mollis lacus nec nisi fermentum iaculis. Sed finibus sodales quam, vitae convallis neque scelerisque vehicula. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec faucibus, ligula quis sodales pulvinar, justo risus vestibulum turpis, in sodales dolor libero id libero. Fusce sit amet nisl nibh. Vivamus tellus eros, fermentum vitae sollicitudin vitae, pellentesque eget enim. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec sollicitudin pellentesque felis id aliquet. Cras semper lacus erat, a feugiat nibh pretium ac. Aliquam porttitor sollicitudin mollis. Sed volutpat justo dolor, gravida accumsan dui ultrices id. Cras mattis neque id turpis cursus posuere. Donec non mauris vehicula, condimentum enim vitae, finibus metus. Praesent in dapibus odio. Ut vehicula egestas lorem, ullamcorper maximus tellus. Sed lorem augue, gravida nec urna vel, pretium tincidunt erat. Etiam ut congue nunc. Nunc pharetra, mi et elementum vulputate, libero est laoreet est, quis euismod dui ipsum in justo. In fermentum dignissim viverra. Integer tincidunt egestas ultrices. Maecenas tristique est id erat rutrum, in mollis est ultrices. Phasellus eget eros sed augue congue vulputate eget at mauris. Nullam vitae tincidunt nunc, in rhoncus mauris. Morbi dignissim ultricies lorem eget dapibus. Vivamus id ullamcorper lectus. Ut vel pretium urna, quis feugiat leo. Etiam cursus feugiat fermentum. Phasellus pretium sem tortor, vel sollicitudin neque posuere et. Quisque vel augue ullamcorper, fringilla augue eu, bibendum mi.");
    private ArrayList<String> array = new ArrayList<>(Arrays.asList(lorem.split(" ")));
    private Integer index = 0;
    private Integer batchSize = 20;
    private List<String> getMore(){
        if (index+batchSize >= array.size())
            index = 0;
        List<String> batch = array.subList(index, index+batchSize);
        index+= batchSize;
        return batch;
    }

    @Override
    public List<String> getStringList(){
        return getMore();
    }
}
