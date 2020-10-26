package library_model;

public class Book {

    private String name;
    private int nrOfPages;
    private Author author;

    public Book() {
    }

    public Book(String name, int nrOfPages, Author author) {
        this.name = name;
        this.nrOfPages = nrOfPages;
        this.author = author;
    }

    public String getName() {

        return name;
    }

    public int getNrOfPages() {

        return nrOfPages;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setNrOfPages(int nrOfPages) {

        this.nrOfPages = nrOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", nrOfPages=" + nrOfPages +
                ", author=" + author +
                '}';
    }
}
