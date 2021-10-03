package pro.sky.java.course1.lesson8;

public class Book {
    String name;
    Author author;
    int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int year() {
        return this.year;
    }

    //setters
    public void setName(String name) {
        this.name = name;

    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
