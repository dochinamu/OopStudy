public class hw6_2 {
    public static void main(String[] args) {
        Book book = new Book("1984", "B001", "George Orwell");
        Magazine magazine = new Magazine("National Geographic", "M001", 200);

        book.printDetails();
        System.out.println();

        magazine.printDetails();
        System.out.println();

        Book bookWithoutAuthor = new Book("To Kill a Mockingbird", "B002");
        bookWithoutAuthor.printDetails();
    }
}

class LibraryItem {
    private String title;
    private String id;

    public LibraryItem() {}

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;

    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }
    public void printDetails() {
        System.out.println("Title: " + getTitle() + ", ID: " + getId());
    }

}
class Book extends LibraryItem {
    private String author;
    public Book(String title, String id, String author) {
        super(title, id); //이건 인자를 넘겨야 하니까 super를 생략 못하고 꼭 써야 하나?
        this.author = author;
    }
    public Book(String title, String id) {
        super(title, id);
        author = "Unknown";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void printDetails() {
        System.out.println("Title: " + super.getTitle() + ", ID: " + super.getId());
        System.out.println("Author: " + getAuthor());
    }


}


class Magazine extends LibraryItem {
    private int issueNum;
    public Magazine(String title, String id, int issueNum) {
        super(title, id); //이건 인자를 넘겨야 하니까 super를 생략 못하고 꼭 써야 하나?
        this.issueNum = issueNum;
    }

    public int getIssueNum() {
        return issueNum;
    }
    public void printDetails() {
        System.out.println("Title: " + super.getTitle() + ", ID: " + super.getId());
        System.out.println("Issue Number: " + getIssueNum());
    }


}
