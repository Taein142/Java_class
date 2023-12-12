package ch10_class.ex5;

public class BookMain {
    public static void main(String[] args) {
        // 도서관에서 책을 다루기 위한 class

        // 책 정보는 시중에 있는 실제 책으로 해봅시다.

        // 기본생성자로 객체 만들고 필드값 채우기
        Book book1 = new Book();
        book1.bookTitle = "퍼시잭슨과 올림포스의 신. 1: 미스터 D의 여름캠프";
        book1.bookAuthor = "릭 라이어던";
        book1.bookPublisher = "한솔수북";
        book1.isbn = "9791185494241";
        book1.bookPrice = 9500;

        // 매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("판도라하츠(전24권)", "Jun Mochizuki");
        book2.bookPublisher = "대원씨아이";
        book2.isbn = "01058095132";
        book2.bookPrice = 54000;

        //모든 배개변수가 있는 생성자로 객체 만들고 필드값 채우기
        Book book3 = new Book("나미야 잡화점의 기적", "히가시노 케이고", "현대문학", "9788937836374", 9500);
    }
}
