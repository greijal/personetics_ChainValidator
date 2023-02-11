package com.personetics;

import com.personetics.node.Node;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChainValidator {

    boolean validate(List<Node> nodes) {

        Map<Boolean, List<Node>> nodeMap = nodes.stream()
                .collect(Collectors.partitioningBy(Node::isBaseValue));

        var baseNode = nodeMap.get(true);
        var complexNode = nodeMap.get(false);

        if(baseNode.isEmpty() && complexNode.isEmpty()) return true;
        if(baseNode.isEmpty()) return false;
        if(complexNode.isEmpty()) return true;

        for(Node node : complexNode){
            if(!node.contains(baseNode)) return false;
        }

        return true;
    }
}
