package library_model;

public class Novel extends Book {

    private String type;

    public Novel(){
    }

    public Novel(String name, int nrOfPages, Author author, String type) {
        super(name, nrOfPages, author);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "name='" + getName() + '\'' +
                "nrOfPages=" + getNrOfPages() +
                "author='" + getAuthor() + '\'' +
                "type='" + type + '\'' +
                '}';
    }
}
