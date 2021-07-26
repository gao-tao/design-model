package com.design.pattern.memento;

import java.util.Stack;

/**
 * 备忘录管理角色草稿箱
 */
public class DraftsBox {

    private final Stack<ArticleMemento> STACK = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento pop = STACK.pop();
        return pop;
    }

    public void addMemento(ArticleMemento articleMemento){
        STACK.push(articleMemento);
    }
}
