package com.company.ErDiagram;

import java.util.ArrayList;

public class TestErDiagram {
    public static void main(String[] args) {

        Role r1 = new Role(301,"Manager");
        Role r2 = new Role(302,"Author");
        Role r3 = new Role(302,"Admin");

        User u1 = new User(201,"Prity","prity@gmail.com",r1);
        User u2 = new User(202,"Maruf Hossen","maruf@gmail.com",r2);
        User u3 = new User(203,"Ritu","ritu@gmail.com",r3);

        Article a1 = new Article(101,"Happiness");
        Article a2 = new Article(102,"Sadness");
        Article a3 = new Article(103,"Hormonal Imbalance");

        System.out.println("Article1: " + a1);
        System.out.println("Article2: " + a2);
        System.out.println("Article3: " + a3);

        System.out.println("---------------");

        boolean result = a1.addUser(u3);
        if(result==true){
            System.out.println("User added successfully");
        }
        else{
            System.out.println("Failed to add User");
        }

        boolean result1 = a2.addUser(u2);
        if(result1==true){
            System.out.println("User added successfully");
        }
        else{
            System.out.println("Failed to add User");
        }

        boolean result2 = a3.addUser(u1);
        if(result2==true){
            System.out.println("User added successfully");
        }
        else{
            System.out.println("Failed to add User");
        }
        System.out.println("----------------");

        ArrayList<Article> articles= new ArrayList<Article>();
        articles.add(a1);
        articles.add(a2);
        articles.add(a3);


            for (int i = 0; i <articles.size(); i++) {
                System.out.println("----------------");
                System.out.println(articles.get(i).getId());
                System.out.println(articles.get(i).getTitle());
               if(articles.get(i).getUser() == null){
                   System.out.println("No user found");
               }
               else{
                   System.out.println(articles.get(i).getUser().getName());
                   System.out.println(articles.get(i).getUser().getRole().getName());
               }
            }
        System.out.println("-----------------------");

        Comment c1 = new Comment(401,"'Tujhe dekha to yeh jana sanam'",u1,a1);
        Comment c2 = new Comment(402,"'Pyar hota hai deewana sanam'",u2,a1);
        Comment c3 = new Comment(403,"'The book is good'",u3,a1);

            ArrayList<Comment> comments = new ArrayList<Comment>();
            comments.add(c1);
            comments.add(c2);
            comments.add(c3);

//        System.out.println(comments.get(0).getBody());
//        System.out.println(comments.get(1).getBody());

        for(int i=0; i< comments.size();i++){
            System.out.println(comments.get(i).getBody());
        }

        System.out.println("---------");

        boolean result4 = a2.addUser(u3);
        if(result4==true){
            a2.setTitle("Favourite Fruit");
            System.out.println(a2);
        }
        else{
            System.out.println("Title not changed");
            System.out.println(a2.getTitle());
        }

        System.out.println("----------");

        boolean result5 = a2.addUser(u1);
        if(result5==true){
            a2.setTitle("Favourite Book");
            System.out.println(a2);
        }
        else{
            System.out.println("Title cannot be changed");
        }

        System.out.println("----------");

        boolean result6 = a2.addUser(u2);
        if(result6==true){
            a2.setTitle("Favourite Movie");
            System.out.println(a2);
        }
        else{
            System.out.println("Title cannot be changed");
        }

        System.out.println("----------");

        articles.remove(a3);
        System.out.println(articles.size());

    }
}
