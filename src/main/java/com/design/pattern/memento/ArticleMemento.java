package com.design.pattern.memento;

import lombok.Data;

/**
 * 备忘录角色
 */
@Data
public class ArticleMemento {

    private String title;

    private String content;

    private String img;

    public ArticleMemento(String title, String content, String img) {
        this.title = title;
        this.content = content;
        this.img = img;
    }
}
