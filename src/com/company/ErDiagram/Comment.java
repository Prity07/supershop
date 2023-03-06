package com.company.ErDiagram;

public class Comment {
    private int id;
    private String body;
    private User user;
    private Article article;

    public Comment(int id, String body,User user, Article article){
        this.id = id;
        this.body = body;
        this.user = user;
        this.article = article;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public User getUser() {
        return user;
    }

    public Article getArticle() {
        return article;
    }
}
