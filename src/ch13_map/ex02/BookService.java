package ch13_map.ex02;

import java.util.List;
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

    public void update() {
        System.out.println("수정할 도서의 id를 입력하세요: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("수정할 가격을 입력하세요: ");
            int bookPrice = scanner.nextInt();
            boolean updateResult = bookRepository.update(id, bookPrice);
            if (updateResult) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("조회결과가 없습니다.");
        }
    }

    public void delete() {
        System.out.print("삭제할 id: ");
        Long id = scanner.nextLong();
        boolean result = bookRepository.delete(id);
        if (result) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패");
        }
    }

    public void search() {
        System.out.print("검색어: ");
        String bookTitle = scanner.next();
        List<BookDTO> bookDTOList = bookRepository.search(bookTitle);
        // 검색 결과가 여러개일 수 있으니 List타입으로 받는다.
        if (bookDTOList.size() > 0) {
            for (BookDTO bookDTO : bookDTOList) {
                System.out.println("bookDTO = " + bookDTO);
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }
}
