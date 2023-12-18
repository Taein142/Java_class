package ch11_class.ex02;

import ch11_class.ex1.StudentDTO;

import java.util.List;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();

    /**
     * 도서등록 메서드
     * name: save
     * parameter: x
     * return: x
     * 실행내용
     * 스캐너로 도서명, 저자, 가격, 출판사정보를 입력받고
     * BookDTO 객체에 담아서 Repository로 전달하여 저장이 되도록 함
     * 등록 여부를 출력한다.(등록성공 or 등록실패)
     */
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
        // 우리 클래스에서 책이라는 것은 이러한 정보로 이루어져야 해.
        // 우린 이런 정보를 다른 클래스와 주고 받을 필요가 있어
        boolean result = bookRepository.save(bookDTO);
        // Repository의 save 메서드로 전달
        // Repository에서 return 받은 값을 result에 저장
        System.out.println("result = " + result);
        if (result) {
            System.out.println("도서가 정상적으로 등록되었습니다.");
        } else {
            System.out.println("도서 등록에 실패하였습니다.");
        }
    }

    /**
     * 도서목록 메서드
     * name: findAll
     * parameter: x
     * return: x
     * 실행내용
     * Repository로 부터 목록을 리턴 받아서 목록에 있는 모든 정보를 출력
     */
    public void findAll() {
        List<BookDTO> bookDTOList = bookRepository.findAll();
        // 리턴이 있으면 반드시 좌변이 있어야 한다.
        // 리스트 '전체'를 받았기에 parameter가 필요 없다.
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println("bookDTO = " + bookDTO);
        }
    }

    /**
     * 도서조회 메서드
     * name: findById
     * parameter: x
     * return: x
     * 실행내용
     * id를 입력받고 Repository로 부터 id에 해당 하는 도서 정보를 출력
     * 없으면 없다고 출력
     */
    public void findById() {
        System.out.print("검색할 도서의 id를 입력하세요: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        // bookRepository에서의 findById 메서드로부터 id 값을 가져온다.
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("요청한 책이 존재하지 않습니다.");
        }
    }

    /**
     * 도서조회 메서드
     * name: findByTitle
     * parameter: x
     * return: x
     * 실행내용
     * 도서제목을 입력받고 Repository로 부터 해당 하는 도서 정보를 출력(제목이 정확히 일치하는 것만)
     * 없으면 없다고 출력
     */
    public void findByTitle() {
        System.out.print("검색할 도서의 제목를 입력하세요: ");
        String bookTitle = scanner.next();
        BookDTO bookDTO = bookRepository.findByTitle(bookTitle);
        if (bookTitle != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void update() {
        // 수정할 id를 입력받음
        // 해당 id 도서가 있다면 수정할 가격을 입력받고 수정 처리
        // 없으면 없다고 출력
        System.out.println("수정할 도서의 id를 입력하세요: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        // 받은 id값과 동인한 정보(id)가 있는지 확인
        // 있으면 bookDTO에 해당 id 값을 저장
        if (bookDTO != null) {
            System.out.println("수정할 가격을 입력하세요: ");
            int bookPrice = scanner.nextInt();
            boolean updateResult = bookRepository.update(id, bookPrice);
            // 저장한 id 값과 입력받은 bookPrice 값을 repository의 update 메서드에 넘겨주고
            // 리턴받은 값을 updateResult에 저장한다.
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
