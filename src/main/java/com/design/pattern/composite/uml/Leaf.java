package com.design.pattern.composite.uml;

//叶子节点
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}