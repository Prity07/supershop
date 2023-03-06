package com.company.ErDiagram;

import com.company.OopExercises.Author;

import java.util.ArrayList;

public class Article {
    private int id;
    private String title;
    private String content;
    private User user;
    private ArrayList<Comment> comments;

    public Article(int id, String title){
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public boolean addUser(User user){
        if(user.getRole().getName() == "Author"||user.getRole().getName()== "Admin"){
            this.user = user;
            return true;
        }
        else{
            return false;
        }
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }


    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", title='" + title + '\'' +
                ']';
    }
}
