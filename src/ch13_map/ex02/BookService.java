package ch13_map.ex02;

import java.util.Map;
import java.util.Scanner;

public class BookService {
    BookRepository bookRepository = new BookRepository();
    Scanner scanner = new Scanner(System.in);

    public void save() {
        System.out.print("도서 제목을 입력하세요: ");
        String bookName = scanner.next();
        System.out.print("저자를 입력하세요: ");
        String bookAuthor = scanner.next();
        System.out.print("가격을 입력하세요: ");
        int bookPrice = scanner.nextInt();
        System.out.print("출판사을 입력하세요: ");
        String bookPublisher = scanner.next();
        BookDTO bookDTO = new BookDTO(bookName, bookAuthor, bookPrice, bookPublisher);
        boolean result = bookRepository.save(bookDTO);
        System.out.println("result = " + result);
        if (result) {
            System.out.println("도서가 정상적으로 등록되었습니다.");
        } else {
            System.out.println("도서 등록에 실패하였습니다.");
        }
    }

    public void findAll() {
        Map<Long, BookDTO> bookDTOMap = bookRepository.findAll();
        for (Long i : bookDTOMap.keySet()) {
            System.out.println(bookDTOMap.get(i));
            // 도서 제목만 본다면
            System.out.println(bookDTOMap.get(i).getBookTitle());
        }
    }

    public void findById() {
        System.out.println("조희 id: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회 결과가 없습니다.");
        }
    }
}
