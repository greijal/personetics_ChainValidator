package com.personetics.node;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NodeString extends Node<String> {
    public NodeString(String value) {
        super(value);
    }
    @Override
    public boolean isBaseValue() {
        return ((String) this.value).length() == 1;
    }


    @Override
    public boolean contains(List<Node> nodeList) {
        if(((String) value).length() == 1 ) return nodeList.contains(value);
        for(String s : ((String) value).split("")){
             if(!nodeList.contains(new NodeString(s))) return false;
         }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Node<String> node = (Node<String>) obj;
        return Objects.equals(value, node.value);
    }
}
