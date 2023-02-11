package com.personetics;

import com.personetics.node.Node;
import com.personetics.node.NodeInt;
import com.personetics.node.NodeString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ChainValidator chainValidator = new ChainValidator();

        List<Node> nodeStr1 = new ArrayList<Node>();
        nodeStr1.add(new NodeString("p"));
        nodeStr1.add(new NodeString("aba"));
        nodeStr1.add(new NodeString("a"));
        nodeStr1.add(new NodeString("b"));
        nodeStr1.add(new NodeString("perso"));
        nodeStr1.add(new NodeString("o"));
        nodeStr1.add(new NodeString("r"));
        nodeStr1.add(new NodeString("e"));
        nodeStr1.add(new NodeString("s"));

        List<Node> nodeStr2 = new ArrayList<Node>();
        nodeStr2.add(new NodeString("car"));
        nodeStr2.add(new NodeString("city"));
        nodeStr2.add(new NodeString("c"));
        nodeStr2.add(new NodeString("a"));

        List<Node> nodeInt1 = new ArrayList<Node>();
        nodeInt1.add(new NodeInt(36));
        nodeInt1.add(new NodeInt(6));
        nodeInt1.add(new NodeInt(24));
        nodeInt1.add(new NodeInt(4));
        nodeInt1.add(new NodeInt(47));
        nodeInt1.add(new NodeInt(7));
        nodeInt1.add(new NodeInt(2));
        nodeInt1.add(new NodeInt(3));
        nodeInt1.add(new NodeInt(27));

        List<Node> nodeInt2 = new ArrayList<Node>();
        nodeInt2.add(new NodeInt(22));
        nodeInt2.add(new NodeInt(24));
        nodeInt2.add(new NodeInt(1));
        nodeInt2.add(new NodeInt(11));
        nodeInt2.add(new NodeInt(2));


        System.out.println( nodeStr1 + " is " + chainValidator.validate(nodeStr1));
        System.out.println( nodeStr2 + " is " + chainValidator.validate(nodeStr2));
        System.out.println( nodeInt1 + " is " + chainValidator.validate(nodeInt1));
        System.out.println( nodeInt2 + " is " + chainValidator.validate(nodeInt2));



    }
}