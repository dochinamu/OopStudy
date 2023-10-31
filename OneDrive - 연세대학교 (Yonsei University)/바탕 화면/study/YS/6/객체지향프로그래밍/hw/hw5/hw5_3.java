public class hw5_3 {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("The Great Gatsby", 8);
        books[1] = new Book("To Kill a Mockingbird", 5);
        books[2] = new Book("1984", 6);
        books[3] = new Book("Moby Dick", 2);
        books[4] = new Book("Gone with the wind", 4);

        Sorting.sort(books);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}

class Book {
    private String bookTitle;
    private int isbn;

    public Book() {}

    public Book(String bookTitle, int isbn) {
        this.bookTitle = bookTitle;
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public int getIsbn() {
        return isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String toString() {
        return "[BOOK] ISBN(" + isbn + ") Title(" + bookTitle + ")";
    }
}

class Sorting {
    public static void sort(Book[] books) {
        int n = books.length;


        // 리스트 element 하나씩 순회
        for (int i = 0; i < n ; i++) {
            // 현 element(i번째)보다 앞에 있는 elements 모두와 크기 비교 (ㅑ=0일 땐 더 앞 element가 없으므로 넘어감)
            for (int j = i; j > 0; j--) {
                // 앞이 더 크다면 interchange함
                if (books[j-1].getIsbn() > books[j].getIsbn()) {
                    Book temp = books[j-1];
                    books[j-1] = books[j];
                    books[j] = temp;

                }
            }printISBNs(books); // 다음 element로 넘어가기 전에 배열 상태 출력
        }


    }

    private static void printISBNs(Book[] a) {
        for (int i=0; i < a.length; i++) {
            System.out.print(a[i].getIsbn());
            if (i < a.length -1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

