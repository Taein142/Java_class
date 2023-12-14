package ch11_arraylist.ex3;

/**
 * 책 클래스
 * 필드
 * 책관리번호(id) - Long 타입
 * 책제목(bookTitle)
 * 저자(bookAuthor)
 * 가격(bookPrice)
 * 출판사(bookPublisher)
 * 필드에 대한 getter/setter
 * 생성자 2가지
 * toString method
 */
public class Book {
    // 필드값
    private Long id;
    private String bookTitle;
    private String bookAuthor;
    private int bookPrice;
    private String bookPublisher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }


    private static Long inValue = 1L;
    // static 지우면 id 값이 전부 1로 나옴.
     /*
     * 자바에는 stack 과 heap 영역이 있음
     * 객체는 들어간 데이터가 많아서 전부 heap 영역에 저장한다.
     * 그런데 두 영역 말고도 메서드 영역이 따로 있다.
     * static 도 이 메서드 영역에 존재.
     * 자기 값을 계속 유지할 수 있음.
     * static 으로 정의를 안하면 이 객체를 불러올 때마다 1인 상태이기에
     * 지속적으로 1로 출력되었고
     * static에 저장되어 있으면 객체를 불러와도 초기화되지 않고 값을 유지하며 활용할 수 있다.
     * */


    public Book() {
        this.id = inValue++;
    }

    public Book(String bookTitle, String bookAuthor, int bookPrice, String bookPublisher) {

        this.id = inValue++;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return "Ex03_List{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }
}
