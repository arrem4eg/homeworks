package homework11;

public class Book extends Library {

    private Genre genre;

    public Book(String title, String author, Genre genre, String type) {
        super(title, author, type);
        this.genre = genre;
    }

    public String printItemInfo() {
        return "-------------\n" +
                "Type: " + super.getType() + "\n" +
                "Title: " + super.getTitle() + "\n" +
                "Author: " + super.getAuthor() + "\n" +
                "Genre: " + this.genre + "\n" +
                "----------------";
    }
}
