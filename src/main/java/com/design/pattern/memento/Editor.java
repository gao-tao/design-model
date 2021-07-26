package com.design.pattern.memento;

import lombok.Data;

/**
 * 发起人角色编辑器
 */
@Data
public class Editor {

    private String title;

    private String content;

    private String img;

    public Editor(String title, String content, String img) {
        this.title = title;
        this.content = content;
        this.img = img;
    }

    public ArticleMemento saveMemento() {
        ArticleMemento articleMemento = new ArticleMemento(this.title, this.content, this.img);
        return articleMemento;
    }

    public void undoFormMemento(ArticleMemento articleMemento){
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.img = articleMemento.getImg();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
