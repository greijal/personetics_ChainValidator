package com.personetics.node;

import java.util.List;
import java.util.Objects;

public abstract class Node<T> {
    protected T value;
    public Node(T value) {
        this.value=value;
    }

    public abstract boolean isBaseValue();
    public abstract boolean contains(List<Node> values);

    @Override
    public String toString() {
        return value.toString();
    }
}
