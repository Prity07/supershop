package com.company.OopExercises;

public class TestBook {
    public static void main(String[] args) {

       Author author1 = new Author("Rima","anp@gmail.com",'f');

        // Declare and allocate an array of Authors
        Author[] authors = new Author[3];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        authors[2] = new Author("Shourav Tan", "Paul@nowhere.com", 'm');

        System.out.println(authors[0]);
        System.out.println(authors[1].getName());

// Declare and allocate a Book instance
        Book1 javaDummy = new Book1 ("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
        System.out.println(javaDummy.getAuthorNames());

    }
}
