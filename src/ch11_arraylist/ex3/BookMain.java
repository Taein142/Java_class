package ch11_arraylist.ex3;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        // Book 객체를 담기위한 bookList 객체 선언
        List<Book> bookList = new ArrayList<>();

        // 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가
        Book book1 = new Book();
//        book1.setId(0L);
        book1.setBookTitle("그리고 아무도 없었다.");
        book1.setBookAuthor("애거서 크리스티");
        book1.setBookPrice(10800);
        book1.setBookPublisher("해문출판사");


        // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가
        Book book2 = new Book("판도라하츠", "Jun Mochizuki", 5400, "대원씨아이");
        bookList.add(book2);

        Book book3 = new Book("123", "123", 123, "123");
        bookList.add(book3);

        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList.get(i) = " + bookList.get(i));
        }

        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book bookData : bookList) {
            System.out.println("book = " + bookData);
        }

        // list의 1번 인덱스에 담긴 책의 가격을 50000으로 변경
        bookList.get(0).setBookPrice(50000);

        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList.get(i) = " + bookList.get(i));
        }

        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book bookData : bookList) {
            System.out.println("bookData = " + bookData);
        }
    }
}
