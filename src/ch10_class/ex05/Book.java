package ch10_class.ex05;

public class Book {
    // filed = 도서관에서 책을 표현하기 위한것. (제목, 출판사, 저자 등등)

    /*
        제목(bookTitle)
        저자(bookAuthor)
        출판사(bookPublisher)
        isbn(isbn)
        가격(bookPrice)
    */

    String bookTitle;
    String bookAuthor;
    String bookPublisher;
    String isbn;
    int bookPrice;

    // 기본생성자
    public Book() {

    }

    // 제목, 저자를 매개변수로 하는 생성자(매개변수 값을 필드에 담아야 함.)
    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    // 모든 필드값을 매개변수로 하는 생성자(매개변수 값을 필드에 담아야 함.)
    public Book(String bookTitle, String bookAuthor, String bookPublisher, String isbn, int bookPrice) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.isbn = isbn;
        this.bookPrice = bookPrice;
    }
}
