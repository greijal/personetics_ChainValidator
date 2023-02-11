package com.personetics.node;

import java.util.List;
import java.util.Objects;

public class NodeInt  extends Node<Integer>{

    public NodeInt(Integer value) {
        super(value);
    }

    @Override
    public boolean isBaseValue() {
        return Math.abs(((Integer) value)) <= 9 ;
    }

    @Override
    public boolean contains(List<Node> baseNode) {
        if(Math.abs(((Integer) value)) <= 9) return baseNode.contains(value);
        var di1 = value%10;
        var di2 = (value - (value%10)) /10;
        return baseNode.contains(new NodeInt(di1)) && baseNode.contains(new NodeInt(di2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Node<Integer> node = (Node<Integer>) obj;
        return Objects.equals(value, node.value);
    }
}
